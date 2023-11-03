package basic;

import java.util.Scanner;

public class SwapNumberWithoutUsingThird {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping \n a = "+a +" \n b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping \n a = "+a +" \n b = "+b);
    }
}
