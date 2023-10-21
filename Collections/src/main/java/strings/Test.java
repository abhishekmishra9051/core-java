package strings;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city name : ");
        String name = scanner.nextLine().toLowerCase().trim();
        if(name.equals("mohali"))
            System.out.println("Hello ji");
        else if (name.equals("Delhi"))
            System.out.println("Namasta ji");
        else if (name.equals("Bangalore"))
            System.out.println("fab");
        else
            System.out.println("Enter city is not valid");
    }
}
