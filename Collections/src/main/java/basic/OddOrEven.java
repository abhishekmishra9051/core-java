package basic;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0)
            System.out.println("It's prime number "+number);
        else
            System.out.println("It's Odd number "+number);
    }
}
