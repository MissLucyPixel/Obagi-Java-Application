import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value;

        do {
            System.out.print("Enter 1 or 2: ");
            value = input.nextInt();
        } while (value != 1 && value != 2);

        System.out.printf("Valid input: %d\n", value);

        input.close();
    }
}