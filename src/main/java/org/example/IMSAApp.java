package org.example;

import java.util.Arrays;

public class IMSAApp {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Laurin Heinrich", 14);
        Driver driver2 = new Driver("Seb Priaulx", 9);
        Car car = new Car("Porsche 911 GT3 R", 211);
        Team team = new Team("AO Racing", Arrays.asList(driver1, driver2), car);

        Race race = new Race("Daytona 24", "Daytona, USA", 24);

        RaceManager manager = new RaceManager();
        manager.addTeam(team);
        manager.addRace(race);

        System.out.println("Teams:");
        manager.getTeams().forEach(System.out::println);

        System.out.println("\nRaces:");
        manager.getRaces().forEach(System.out::println);
    }
}
