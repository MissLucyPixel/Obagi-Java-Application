import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        double beginningBalance;
        double totalCharges;
        double totalCredits;
        double creditLimit;
        double newBalance;

        System.out.print("Enter account number (-1 to end): ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            beginningBalance = input.nextDouble();

            System.out.print("Enter total charges: ");
            totalCharges = input.nextDouble();

            System.out.print("Enter total credits: ");
            totalCredits = input.nextDouble();

            System.out.print("Enter credit limit: ");
            creditLimit = input.nextDouble();

            newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.printf("New balance: %.2f\n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }

            System.out.print("\nEnter account number (-1 to end): ");
            accountNumber = input.nextInt();
        }

        System.out.println("Exiting program.");
        input.close();
    }
}

