package com.example.myapplication;

public class TeamOverallStats {
    private int team_id;
    private int rebounds;
    private int steals;
    private int turnovers;
    private int fouls;
    private int id ;


    public TeamOverallStats(String ateam_id, String arebounds, String asteals, String aturnoversint , String afouls, String aid ){
        this.team_id = Integer.parseInt(ateam_id);
        this.rebounds = Integer.parseInt(arebounds);
        this.steals = Integer.parseInt(asteals);
        this.turnovers = Integer.parseInt(aturnoversint);
        this.fouls = Integer.parseInt(afouls);
        this.id = Integer.parseInt(aid);

    }

    public int getTeam_id() {
        return team_id;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getSteals() {
        return steals;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public int getFouls() {
        return fouls;
    }

    public int getId() {
        return id;
    }
}
