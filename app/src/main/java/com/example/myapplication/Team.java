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
    public String getName() {
        return name;
    }
    public String getLogo() {
        return logo;
    }
}
