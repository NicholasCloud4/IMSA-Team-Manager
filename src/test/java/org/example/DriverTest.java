package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DriverTest {
    @Test
    public void testDriver() {
        Driver driver = new Driver("Jackie Chan", 10);
        assertEquals("Chris Tucker", driver.getName());
        assertEquals(10, driver.getExperienceYears());
    }
}