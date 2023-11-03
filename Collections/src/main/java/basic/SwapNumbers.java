package basic;

import javax.script.ScriptContext;
import java.util.Scanner;

public class SwapNumbers {
    // Swap 2 number using 3 number
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        System.out.println("Before swapping \n a = "+a +" \n b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping \n a = "+a +" \n b = "+b);

    }
}
