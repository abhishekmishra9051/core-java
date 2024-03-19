package opps.part1_Inheritance.classesAndObjects;

public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String number;

    public Account(){
        this(1,2.4,"Abhishek","Abhi@gmail.com","9051282419");
        System.out.println("Empty Constructor called..!");
    }

    public Account(int accountNumber, double balance, String name, String email, String number){
        System.out.println("Parameter Constructor called..!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public Account(String name, String email, String number) {
        this(1234, 4000.00,name,email,number);
//        this.name = name;
//        this.email = email;
//        this.number = number;
    }

    public void depositFunds(double depositAmount) {
        if (depositAmount > 0) { // Check if depositAmount is positive
            balance += depositAmount; // Update the balance
            System.out.println("Deposit of Rs. " + depositAmount + " made. New balance is Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have Rs. " + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of Rs. " + withdrawalAmount + " processed. Remaining balance = Rs. " + balance);
        }
    }

//    public void withdrawal(double withdrawalAmount) {
//        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
//            balance -= withdrawalAmount;
//            System.out.println("Withdrawal of Rs. " + withdrawalAmount + " made. New balance is Rs." + balance);
//        } else if (withdrawalAmount <= 0) {
//            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
//        } else {
//            System.out.println("Insufficient funds. Withdrawal amount exceeds the current balance.");
//        }
//    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
