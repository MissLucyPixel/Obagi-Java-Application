import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;
        double mpg;
        double totalMiles = 0;
        double totalGallons = 0;

        System.out.print("Enter miles driven (-1 to end): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);

            totalMiles += miles;
            totalGallons += gallons;

            if (totalGallons != 0) {
                double cumulativeMpg = totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon: %.2f\n", cumulativeMpg);
            } else {
                System.out.println("No combined miles per gallon calculated yet.");
            }

            System.out.print("\nEnter miles driven (-1 to end): ");
            miles = input.nextInt();
        }

        System.out.println("Exiting program.");
        input.close();
    }
}