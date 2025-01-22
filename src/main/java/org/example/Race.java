package org.example;

public class Race {
    private String raceName;
    private String location;
    private int raceDuration;

    public Race(String raceName, String location, int raceDuration) {
        this.raceName = raceName;
        this.location = location;
        this.raceDuration = raceDuration;
    }

    public String getRaceName() {
        return raceName;
    }

    public String getLocation() {
        return location;
    }

    public int getRaceDuration() {
        return raceDuration;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceName='" + raceName + '\'' +
                ", location='" + location + '\'' +
                ", raceDuration=" + raceDuration +
                '}';
    }
}
