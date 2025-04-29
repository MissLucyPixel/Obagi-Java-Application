public class Sieve{
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1000];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j < isPrime.length; j += i)
                    isPrime[j] = false;
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) System.out.print(i + " ");
        }
    }
}