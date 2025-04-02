import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer

        while (counter <= 10) {
            System.out.print("Enter integer: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("Largest number is: %d\n", largest);

        input.close();
    }
}