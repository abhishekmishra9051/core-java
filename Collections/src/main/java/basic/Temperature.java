package basic;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit (°F)");
        int temperature = sc.nextInt();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("Temperature in Celsius (°C) "+temperature);
    }
}
