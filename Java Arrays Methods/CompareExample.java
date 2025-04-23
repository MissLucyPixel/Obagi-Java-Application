import java.util.Arrays;

public class CompareExample{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int result = Arrays.compare(arr1, arr2);
        System.out.println("Compare result: " + result); // -1 means arr1 < arr2
    }
}