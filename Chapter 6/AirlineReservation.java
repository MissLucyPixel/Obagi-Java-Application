import java.util.Scanner;

public class AirlineReservation{
    private static final boolean[] seats = new boolean[10];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            int section = scanner.nextInt();

            if (section == 1) {
                if (!assignSeat(0, 4)) {
                    if (askOtherSection("Economy"))
                        assignSeat(5, 9);
                }
            } else if (section == 2) {
                if (!assignSeat(5, 9)) {
                    if (askOtherSection("First Class"))
                        assignSeat(0, 4);
                }
            }

            System.out.println("Continue booking? (y/n): ");
            if (scanner.next().equalsIgnoreCase("n")) break;
        }
    }

    static boolean assignSeat(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.printf("Boarding pass: Seat %d (%s)\n", i + 1, (i < 5 ? "First Class" : "Economy"));
                return true;
            }
        }
        return false;
    }

    static boolean askOtherSection(String altSection) {
        System.out.printf("%s is full. Would you like to be placed in %s? (y/n): ", altSection.equals("First Class") ? "Economy" : "First Class", altSection);
        return scanner.next().equalsIgnoreCase("y");
    }
}