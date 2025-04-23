import java.util.Arrays;

public class FillExample{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        System.out.println("Filled array: " + Arrays.toString(arr));
    }
}