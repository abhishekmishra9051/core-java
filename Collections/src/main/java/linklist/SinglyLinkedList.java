package linklist;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insertion at the Beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head =newNode;
    }

    // Insertion at the End
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insertion at a Specific Position
    public void insertAfterNode(Node prevNode, int data){
        if(prevNode == null){
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Deletion
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Traversal
    public void traverse(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // Search
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Length (Size)
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Reversal
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Sorting (Example for ascending order)
    public void sort() {
        Node current = head;
        Node index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // Merging (Assuming two sorted lists)
    public void merge(SinglyLinkedList list2) {
        Node current1 = this.head;
        Node current2 = list2.head;
        SinglyLinkedList mergedList = new SinglyLinkedList();

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.insertAtEnd(current1.data);
                current1 = current1.next;
            } else {
                mergedList.insertAtEnd(current2.data);
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            mergedList.insertAtEnd(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.insertAtEnd(current2.data);
            current2 = current2.next;
        }

        this.head = mergedList.head;
    }

    // Cycle Detection (Using Floyd's Tortoise and Hare Algorithm)
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(10);  // Insert 10 at the beginning
        list.insertAtEnd(44);        // Insert 44 at the end
        list.insertAfterNode(list.head, 15);  // Insert 15 after the head

        list.traverse();  // Traverse and print the list

        list.delete(15);  // Delete node with value 15
        System.out.println("\nAfter deleting 15:");
        list.traverse();

        System.out.println("Search for 44: " + list.search(44));  // Search for 44
        System.out.println("Search for 15: " + list.search(15));  // Search for 15

        int size = list.size();  // Get the size of the list
        System.out.println("Size: " + size);

        list.reverse();  // Reverse the list
        System.out.println("Reversed List:");
        list.traverse();

        list.sort();  // Sort the list in ascending order
        System.out.println("Sorted List:");
        list.traverse();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertAtEnd(20);
        list2.insertAtEnd(25);
        list2.insertAtEnd(30);
        System.out.println("List 2:");
        list2.traverse();

        list.merge(list2);  // Merge list with list2
        System.out.println("After Merging with List 2:");
        list.traverse();

        // Cycle Detection (assuming no cycle in this example)
        System.out.println("Has Cycle: " + list.hasCycle());
    }


}
