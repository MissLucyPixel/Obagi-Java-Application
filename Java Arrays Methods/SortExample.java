import java.util.Arrays;

public class SortExample{
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}