package basic;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        String str;
        float b;
        System.out.println("Enter the Integer");
        a = sc.nextInt();
        System.out.println("Enter the String");
        str = sc.next();
        System.out.println("Enter the float");
        b = sc.nextFloat();
        System.out.println("you entered Integer "+a);
        System.out.println("you entered String "+str);
        System.out.println("you entered Float "+b);
    }
}
