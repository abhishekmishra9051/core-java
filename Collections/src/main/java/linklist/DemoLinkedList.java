package linklist;

public class DemoLinkedList {
    // Represent a node of the singly linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Declare the head of the linked list

    public static void main(String[] args) {
        DemoLinkedList list = new DemoLinkedList(); // Create an instance of the SinglyLinkedList class

        Node node1 = list.new Node(10);
        Node node2 = list.new Node(20);
        Node node3 = list.new Node(30);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;

        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
