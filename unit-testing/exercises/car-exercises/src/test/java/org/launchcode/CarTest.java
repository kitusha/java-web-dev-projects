package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasTankAfterExceedingTankRange() {
        // Drive beyond the tank range (more than 50 miles)
        test_car.drive(60);

        // Gas tank level should be 0, as it can't go below that
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasOverfillException() {
        // Attempt to add gas that exceeds the tank size, expect an exception
        assertThrows(IllegalArgumentException.class, () -> {
            test_car.addGas(60); // Trying to add more gas than the tank size
        }, "Shouldn't get here, car cannot have more gas in the tank than the size of the tank");
    }
}
