package strings;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class PasswordHasherAndStorage
{
    public String hashAndSavePassword(String password)
    {
        String hashedPassword = hashPassword(password);
        savePassword(hashedPassword);
        return hashedPassword;
    }

        private String hashPassword(String password)
        {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hashedBytes = digest.digest(password.getBytes());

                StringBuilder hexString = new StringBuilder();
                for (byte b : hashedBytes) {
                    hexString.append(String.format("%02x", b));
                }

                return hexString.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        }

    private void savePassword(String hashedPassword)
    {
//        saving the hashed password to the database
        System.out.println("Saving hashed password to the DB: " + hashedPassword);
    }

    public static void main(String[] args)
    {
        PasswordHasherAndStorage passwordHasherAndStorage = new PasswordHasherAndStorage();

        String password = "mySecretPassword";
        String hashedPassword = passwordHasherAndStorage.hashAndSavePassword(password);
    }
}

