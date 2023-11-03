package basic;

import java.util.Scanner;

public class BreakWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            System.out.println("Please Enter an Integer");
            n = sc.nextInt();
            if(n == 0)
                break;
        }
        System.out.println("You Enter "+n);
    }
}
