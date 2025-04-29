public class TurtleGraphics{
    static int[][] floor = new int[20][20];
    static int x = 0, y = 0, direction = 0; // 0=right,1=down,2=left,3=up
    static boolean penDown = false;

    public static void main(String[] args) {
        int[] commands = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9};

        for (int cmd : commands) {
            if (cmd == 1) penDown = false;
            else if (cmd == 2) penDown = true;
            else if (cmd == 3) direction = (direction + 1) % 4;
            else if (cmd == 4) direction = (direction + 3) % 4;
            else if (cmd == 6) printFloor();
            else if (cmd == 9) break;
            else if (cmd >= 5) move(cmd % 10); // e.g., 5,12 -> move 12
        }
    }

    static void move(int steps) {
        for (int i = 0; i < steps; i++) {
            if (direction == 0 && y < 19) y++;
            else if (direction == 1 && x < 19) x++;
            else if (direction == 2 && y > 0) y--;
            else if (direction == 3 && x > 0) x--;

            if (penDown) floor[x][y] = 1;
        }
    }

    static void printFloor() {
        for (int[] row : floor) {
            for (int val : row)
                System.out.print(val == 1 ? "*" : " ");
            System.out.println();
        }
    }
}