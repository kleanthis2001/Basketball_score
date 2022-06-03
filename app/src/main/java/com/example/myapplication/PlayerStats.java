package com.example.myapplication;

public class PlayerStats {
    private int playerID;
    private int points;
    private int rebounds;
    private int assists;
    private int id;

    public PlayerStats(String playerID, String points, String rebounds, String assists, String id) {
        this.playerID = Integer.parseInt(playerID);
        this.points = Integer.parseInt(points);
        this.rebounds = Integer.parseInt(rebounds);
        this.assists = Integer.parseInt(assists);
        this.id = Integer.parseInt(id);
    }

    public PlayerStats(int playerID, int points, int rebounds, int assists, int id) {
        this.playerID = playerID;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.id = id;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getPoints() {
        return points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getAssists() {
        return assists;
    }

    public int getId() {
        return id;
    }
}
