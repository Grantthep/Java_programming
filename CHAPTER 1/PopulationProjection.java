public class PopulationProjection {
    public static void main(String[] args) {
        long currentPopulation = 312_032_486L;
        double growthRate = 1.2;
        for (int year = 1; year <= 5; year++) {
            currentPopulation *= growthRate;
            System.out.println("Year " + year + ": " + currentPopulation);
        }
    }
}
