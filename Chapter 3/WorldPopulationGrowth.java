public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double currentPopulation = 8.2e9; // Current population in billions
        double growthRate = 0.0085; // Annual growth rate (0.85%)
        int yearsToDouble = 0;

        System.out.printf("%-10s %-20s %-20s%n", "Year", "Population (Billions)", "Increase (Billions)");

        for (int year = 1; year <= 75; year++) {
            double increase = currentPopulation * growthRate; // Annual population increase
            currentPopulation += increase; // Update population

            System.out.printf("%-10d %-20.2f %-20.2f%n", year, currentPopulation / 1e9, increase / 1e9);

            // Check when population doubles
            if (yearsToDouble == 0 && currentPopulation >= 16.4e9) {
                yearsToDouble = year;
            }
        }

        System.out.printf("The population will double in %d years.%n", yearsToDouble);
    }
}