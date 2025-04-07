public class Factorials {
    public static void main(String[] args) {
        System.out.println("Number\tFactorial");
        System.out.println("------\t---------");

        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + "\t" + factorial);
        }

        System.out.println("\nDifficulty calculating factorial of 100:");
        System.out.println("The factorial of 100 is extremely large and");
        System.out.println("exceeds the maximum value that can be stored");
        System.out.println("in a long variable. You would need to use");
        System.out.println("arbitrary-precision arithmetic (e.g., BigInteger)");
    }
}