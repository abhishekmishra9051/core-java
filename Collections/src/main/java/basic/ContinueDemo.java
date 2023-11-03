package basic;

import java.util.Scanner;

public class ContinueDemo {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            if(n == 0 || n == 6) {
                System.out.println("Holiday");
                continue;
            }
            else
                System.out.println("It's working Day");
                break;
        }

    }
}
