public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // Initial amount
        int years = 10;

        System.out.println("Interest Rate\tYear\tAmount on Deposit");

        for (int rate = 5; rate <= 10; rate++) {
            double interestRate = rate / 100.0; // Convert percentage to decimal

            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + interestRate, year);
                System.out.printf("%d%%\t\t%d\t%.2f\n", rate, year, amount);
            }
            System.out.println(); // Add a blank line between rates
        }
    }
}