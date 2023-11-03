package basic;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        if(number < 0)
            System.out.println("Negative Number");
        else {
            for (int i = 1; i <= number; i++)
                fact *= i;
            System.out.println("The factorial of " + number + " is " + fact);
        }
    }
}
