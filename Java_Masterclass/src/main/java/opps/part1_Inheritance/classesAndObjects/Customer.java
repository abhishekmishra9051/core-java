package opps.part1_Inheritance.classesAndObjects;

public class Customer {
    private String name;
    private String credit_limit;
    private String email;

    public Customer(String name, String credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    public Customer() {
        this("Abhishek", "abhi@gmail.com");
    }

    public Customer(String name, String email) {
        this(name,"Unknown",email);
    }

    public String getName() {
        return name;
    }

    public String getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}
