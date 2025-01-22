package org.example;

import java.util.List;

public class Team {
    private String teamName;
    private List<Driver> drivers;
    private Car car;

    public Team(String teamName, List<Driver> drivers, Car car) {
        this.teamName = teamName;
        this.drivers = drivers;
        this.car = car;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", drivers=" + drivers +
                ", car=" + car +
                '}';
    }
}
