import java.util.Arrays;

public class CopyExample{
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}