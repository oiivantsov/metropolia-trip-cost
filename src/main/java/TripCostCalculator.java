import java.util.Scanner;

public class TripCostCalculator {
    private static final double FUEL_CONSUMPTION_PER_100KM = 5.0;

    public static double calculateTripCost(double distance, double fuelPricePerLiter) {
        double fuelNeeded = (distance / 100) * FUEL_CONSUMPTION_PER_100KM;
        return fuelNeeded * fuelPricePerLiter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance to travel (km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter fuel price per liter: ");
        double fuelPricePerLiter = scanner.nextDouble();

        double totalCost = calculateTripCost(distance, fuelPricePerLiter);
        System.out.printf("Total trip cost: %.2f%n", totalCost);

        scanner.close();
    }
}
