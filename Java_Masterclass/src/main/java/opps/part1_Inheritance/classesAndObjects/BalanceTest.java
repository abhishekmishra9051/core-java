package opps.part1_Inheritance.classesAndObjects;

public class BalanceTest {
    public static void main(String[] args) {
//        Account account = new Account(01, 2000.00, "Abhishek Mishra", "abhishek@gmail.com", "9051000000");
        Account account = new Account();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getName());
        account.withdrawal(144);
        account.depositFunds(1000);
        account.withdrawal(1);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        Account abhiAccount  = new Account("Raj","raj@gmail.com","9051282418");
        System.out.println("Account Number "+ abhiAccount.getAccountNumber() +"; name " + abhiAccount.getName());
    }
}
