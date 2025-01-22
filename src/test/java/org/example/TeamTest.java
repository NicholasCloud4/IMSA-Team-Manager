package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    @Test
    public void testTeam() {
        Driver driver1 = new Driver("Jackie Chan", 10);
        Driver driver2 = new Driver("Chris Tucker", 8);
        Car car = new Car("Ferrari 488", 211);
        Team team = new Team("Team Ferrari", Arrays.asList(driver1, driver2), car);

        assertAll(
                () -> assertEquals("Team Ferrari", team.getTeamName()),
                () -> assertEquals(2, team.getDrivers().size()),
                () -> assertEquals("Ferrari 488", team.getCar().getModel())
        );
    }
}