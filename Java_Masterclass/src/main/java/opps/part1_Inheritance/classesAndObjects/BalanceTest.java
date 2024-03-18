package opps.part1_Inheritance.classesAndObjects;

public class BalanceTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.withdrawal(144);
        account.depositFunds(1000);
        account.withdrawal(1);

    }
}
