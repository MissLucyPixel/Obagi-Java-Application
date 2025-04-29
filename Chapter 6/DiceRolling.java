import java.util.Random;

public class DiceRolling{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] frequency = new int[13]; // index 2–12

        for (int i = 0; i < 36000000; i++) {
            int die1 = 1 + rand.nextInt(6);
            int die2 = 1 + rand.nextInt(6);
            frequency[die1 + die2]++;
        }

        for (int i = 2; i < frequency.length; i++)
            System.out.printf("%2d: %d\n", i, frequency[i]);
    }
}