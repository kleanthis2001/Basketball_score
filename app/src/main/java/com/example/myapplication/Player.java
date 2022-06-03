package com.example.myapplication;

public class Player {
    private int id;
    private String name;
    private String position;
    private int team_id;

    public Player(String id, String name, String position, String team_id) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.position = position;
        this.team_id = Integer.parseInt(team_id);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
