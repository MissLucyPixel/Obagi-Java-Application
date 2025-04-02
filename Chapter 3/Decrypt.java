import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a four-digit encrypted integer to decrypt: ");
        int encryptedNumber = scanner.nextInt();

        // Extract digits
        int digit1 = (encryptedNumber / 1000) % 10;
        int digit2 = (encryptedNumber / 100) % 10;
        int digit3 = (encryptedNumber / 10) % 10;
        int digit4 = encryptedNumber % 10;

        // Reverse the swap
        int temp1 = digit1, temp2 = digit2;
        digit1 = digit3;
        digit2 = digit4;
        digit3 = temp1;
        digit4 = temp2;

        // Decrypt each digit
        digit1 = (digit1 + 10 - 7) % 10;
        digit2 = (digit2 + 10 - 7) % 10;
        digit3 = (digit3 + 10 - 7) % 10;
        digit4 = (digit4 + 10 - 7) % 10;

        // Reconstruct original number
        int originalNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;

        System.out.printf("Original number: %04d%n", originalNumber); // Ensure 4-digit output

        scanner.close();
    }
}