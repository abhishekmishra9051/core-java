package basic;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of a and b is : "+ c);
    }
}