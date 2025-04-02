import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a four-digit integer to encrypt: ");
        int number = scanner.nextInt();

        // Extract digits
        int digit1 = (number / 1000) % 10;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        // Encrypt each digit
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        // Swap digits
        int encryptedNumber = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;

        System.out.printf("Encrypted number: %04d%n", encryptedNumber); // Ensure 4-digit output

        scanner.close();
    }
}