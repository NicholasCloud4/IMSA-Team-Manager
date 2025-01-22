package org.example;

import java.util.ArrayList;
import java.util.List;

public class RaceManager {
    private List<Team> teams = new ArrayList<>();
    private List<Race> races = new ArrayList<>();

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addRace(Race race) {
        races.add(race);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Race> getRaces() {
        return races;
    }
}
