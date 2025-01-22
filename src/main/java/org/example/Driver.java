package org.example;

public class Driver {
    private String name;
    private int experienceYears;

    public Driver(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}