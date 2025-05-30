import java.util.Scanner;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer: ");
            int number = input.nextInt();

            if (number > largest1) {
                largest2 = largest1; 
                largest1 = number;
            } else if (number > largest2) {
                largest2 = number;
            }
        }

        System.out.printf("Largest number: %d\n", largest1);
        System.out.printf("Second largest number: %d\n", largest2);

        input.close();
    }
}