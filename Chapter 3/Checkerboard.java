public class Checkerboard {

    public static void main(String[] args) {
        int size = 8; // Adjust the size for different checkerboard dimensions

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}