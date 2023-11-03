package basic;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.compareTo(str2) > 0)
            System.out.println("First String is greater then Second String");
        else if(str1.compareTo(str2) < 0)
            System.out.println("First String is smaller then Second String");
        else
            System.out.println("Both string is equal");
    }
}
