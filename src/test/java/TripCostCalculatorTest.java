import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void testCalculateTripCost() {
        double cost = TripCostCalculator.calculateTripCost(200, 1.5);
        assertEquals(15.0, cost, 0.01);
    }

    @Test
    void testZeroDistance() {
        double cost = TripCostCalculator.calculateTripCost(0, 1.5);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    void testZeroFuelPrice() {
        double cost = TripCostCalculator.calculateTripCost(200, 0);
        assertEquals(0.0, cost, 0.01);
    }
}
