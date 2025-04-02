import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double itemValue;
        double totalSales = 0;
        double earnings;

        System.out.print("Enter item value (-1 to end): ");
        itemValue = input.nextDouble();

        while (itemValue != -1) {
            totalSales += itemValue;

            System.out.print("Enter next item value (-1 to end): ");
            itemValue = input.nextDouble();
        }

        earnings = 200 + (0.09 * totalSales);

        System.out.printf("Salesperson's earnings: $%.2f\n", earnings);

        input.close();
    }
}