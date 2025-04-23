import java.util.Arrays;

public class DeepToStringExample{
    public static void main(String[] args) {
        int[][] nestedArr = {{1, 2}, {3, 4}};
        System.out.println("Nested array: " + Arrays.deepToString(nestedArr));
    }
}