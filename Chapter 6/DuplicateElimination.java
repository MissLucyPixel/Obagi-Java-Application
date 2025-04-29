import java.util.Scanner;

public class DuplicateElimination{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num < 10 || num > 100) continue;

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++)
                if (unique[i] == num) isDuplicate = true;

            if (!isDuplicate) {
                unique[count++] = num;
                System.out.print("Unique numbers so far: ");
                for (int i = 0; i < count; i++)
                    System.out.print(unique[i] + " ");
                System.out.println();
            }
        }
    }
}