import java.util.Arrays;

public class DeepToStringExamplecd{
    public static void main(String[] args) {
        int[][] nestedArr = {{1, 2}, {3, 4}};
        System.out.println("Nested array: " + Arrays.deepToString(nestedArr));
    }
}