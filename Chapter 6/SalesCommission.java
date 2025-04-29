import java.util.Scanner;

public class SalesCommission{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] salaryRanges = new int[9]; // 0: $200–299 ... 8: $1000+

        while (true) {
            System.out.print("Enter salesperson's gross sales (-1 to end): ");
            double sales = scanner.nextDouble();
            if (sales == -1) break;

            int salary = (int)(200 + 0.09 * sales);
            int index = (salary >= 1000) ? 8 : (salary - 200) / 100;
            salaryRanges[index]++;
        }

        System.out.println("Salary Range\tNumber of Salespeople");
        for (int i = 0; i < salaryRanges.length; i++) {
            if (i == 8)
                System.out.println("$1000 and over\t" + salaryRanges[i]);
            else
                System.out.printf("$%d–%d\t\t%d\n", 200 + 100 * i, 299 + 100 * i, salaryRanges[i]);
        }
    }
}