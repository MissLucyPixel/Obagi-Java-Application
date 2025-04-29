import java.util.Scanner;

public class SalesSummary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4]; // [product][salesperson]

        while (true) {
            System.out.print("Enter salesperson (1–4), product (1–5), amount (or -1 to stop): ");
            int s = input.nextInt();
            if (s == -1) break;
            int p = input.nextInt();
            double amount = input.nextDouble();

            sales[p - 1][s - 1] += amount;
        }

        System.out.println("\nProduct\tS1\tS2\tS3\tS4\tTotal");
        for (int i = 0; i < 5; i++) {
            double total = 0;
            System.out.printf("%d\t", i + 1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t", sales[i][j]);
                total += sales[i][j];
            }
            System.out.printf("%.2f\n", total);
        }
    }
}