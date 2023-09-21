package practics;

import java.util.Scanner;

public class ReverseStringExample {
//    public static String reverseString(String input){
//        char[] charArray = input.toCharArray();
//        int left = 0;
//        int right = charArray.length-1;
//
//        while (left < right){
//            char temp = charArray[left];
//            charArray[left++] = charArray[right];
//            charArray[right--] = temp;
//        }
////        return new String(charArray);
//        return String.valueOf(charArray);
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
//        String reversedStr = reverseString(str);
//        System.out.println("Reversed string: " + reversedStr);

       String rev = " ";
       for(int i=str.length()-1; i>=0; i--)
           rev += str.charAt(i);
        System.out.println(rev);
    }
}

