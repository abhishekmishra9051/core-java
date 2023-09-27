package practics;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        // Approach 1
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i< str.length(); i++)
            set.add(str.charAt(i));
        for(Character ch : set)
            sb.append(ch);
        System.out.println(sb);

        // Approach 2
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println(sb1);
    }
}
