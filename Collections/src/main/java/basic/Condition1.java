package basic;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args){
        int obtainedMarks, passingMarks = 40;
        Scanner sc = new Scanner(System.in);
        obtainedMarks = sc.nextInt();
        if(obtainedMarks >= passingMarks)
            System.out.println("Congtats! you are pass.");
        else
            System.out.println("Unfortunatly! You did not pass. Better luck nexttime.");
    }
}
