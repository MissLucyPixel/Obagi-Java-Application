public class ProductCalculator{
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers)
            result *= num;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(product(2, 3));       // 6
        System.out.println(product(2, 3, 4));    // 24
        System.out.println(product(5));          // 5
    }
}