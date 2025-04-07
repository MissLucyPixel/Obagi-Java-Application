import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("Invalid input for the number of integers.");
            return;
        }

        System.out.print("Enter integer 1: ");
        int smallest = input.nextInt(); // Initialize smallest with the first number

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = input.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("The smallest value is: " + smallest);
        input.close();
    }
}