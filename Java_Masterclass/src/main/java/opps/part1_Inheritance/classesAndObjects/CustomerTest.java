package opps.part1_Inheritance.classesAndObjects;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("Customer details:");
        System.out.println("Name : "+ customer.getName() + "; email " + customer.getEmail()+ "; credit_limit : " + customer.getCredit_limit());
        System.out.println();

        Customer customer1 = new Customer("Raj","raj@gmail.com");

        System.out.println("Customer 1 details:");
        System.out.println("Name: " + customer1.getName());
        System.out.println("Credit Limit: " + customer1.getCredit_limit());
        System.out.println("Email: " + customer1.getEmail());
        System.out.println();

        Customer customer2 = new Customer("Rahul Kumar", "2000", "rahul.kumar@gmail.com");

        System.out.println("Customer 2 details:");
        System.out.println("Name: " + customer2.getName());
        System.out.println("Credit Limit: " + customer2.getCredit_limit());
        System.out.println("Email: " + customer2.getEmail());
        System.out.println();
    }
}
