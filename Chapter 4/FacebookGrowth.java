public class FacebookGrowth {
    public static void main(String[] args) {
        double initialUsers = 1000000000.0; // 1 billion
        double growthRate = 0.04; // 4% monthly

        // Growth to 1.5 billion
        double target1 = 1500000000.0;
        int months1 = 0;
        double currentUsers1 = initialUsers;
        while (currentUsers1 < target1) {
            currentUsers1 *= (1 + growthRate);
            months1++;
        }
        System.out.println("Months to 1.5 billion: " + months1);

        // Growth to 2 billion
        double target2 = 2000000000.0;
        int months2 = 0;
        double currentUsers2 = initialUsers;
        while (currentUsers2 < target2) {
            currentUsers2 *= (1 + growthRate);
            months2++;
        }
        System.out.println("Months to 2 billion: " + months2);
    }
}
