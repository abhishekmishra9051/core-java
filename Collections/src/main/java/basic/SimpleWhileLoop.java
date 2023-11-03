package basic;

import java.util.Scanner;

public class SimpleWhileLoop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) != 0){
            System.out.println("you entered "+n);
            System.out.println("You entered an integer! ");
        }
        System.out.println("Your out of the loop");
    }
}
