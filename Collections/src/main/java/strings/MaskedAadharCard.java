package strings;

import java.util.Scanner;

class Masked {

    public static String MaskedAadharCard(String aadharCard) {
        // Remove spaces from the input Aadhar card
        String cleanedAadhar = aadharCard.replaceAll(" ", "");

        // Check if the cleaned Aadhar card is the expected length
        if (cleanedAadhar.length() != 12) {
            return "Invalid Aadhar Number";
        }

        // Create a StringBuilder to construct the masked Aadhar card
        StringBuilder maskedAadharCard = new StringBuilder("XXXX-XXXX-");

        // Append the last 4 characters from the cleaned Aadhar card
        maskedAadharCard.append(cleanedAadhar.substring(8));

        return maskedAadharCard.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Aadhar number: ");
        String aadharNumber = sc.nextLine();
        System.out.println(MaskedAadharCard(aadharNumber));
    }
}
