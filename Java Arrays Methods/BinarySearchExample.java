import java.util.Arrays;

public class BinarySearchExample{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 9};
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index);
    }
}