package basic;

import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
            System.out.println("The First number is largest "+a);
        else if(b>c && b>a)
            System.out.println("The Second number is largest "+b);
        else
            System.out.println("The Third number is largest "+c);
    }
}
