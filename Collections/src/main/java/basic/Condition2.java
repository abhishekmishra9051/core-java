package basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args){
        int marksObtained, passingMarks = 40;
        char grade;
        Scanner sc = new Scanner(System.in);
        marksObtained = sc.nextInt();
        if(marksObtained >= passingMarks){
            if(marksObtained > 90)
                grade = 'A';
            else if(marksObtained > 75)
                grade = 'B';
            else if(marksObtained > 60)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("Congrats! You are pass and your grade is " + grade);


        }else {
            grade = 'F';
            System.out.println("You are failed ! your grade is : " + grade);
        }
    }
}
