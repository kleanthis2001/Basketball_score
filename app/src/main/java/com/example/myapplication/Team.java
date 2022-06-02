package com.example.myapplication;

public class Team {
    private int id;
    private String name;
    private String logo;
    private int wins;
    private int losses;
    private int matches;
    private int points;

    public Team(String id, String name, String logo, String wins, String losses, String matches, String  points) {

        this.id = Integer.parseInt(id);
        this.name = name;
        this.logo = logo;
        this.wins = Integer.parseInt(wins);
        this.losses = Integer.parseInt(losses);
        this.matches = Integer.parseInt(matches);
        this.points = Integer.parseInt(points);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
