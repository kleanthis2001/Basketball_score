package com.example.myapplication;

public class MatchStats {
    private int match_id;
    private int team_id;
    private int free_throws;
    private int lost_free_throws;
    private int two_pointers;
    private int lost_two_pointers;
    private int three_pointers;
    private int lost_three_pointers;
    private int field_goals;
    private int lost_field_goals;
    private int rebounds;
    private int defensive_rebounds;
    private int offensive_rebounds;
    private int assists;
    private int turnovers;
    private int steals;
    private int blocks;
    private int fouls;
    private int timeouts;
    private int id;

    public MatchStats(String match_id, String team_id, String free_throws, String lost_free_throws, String two_pointers, String lost_two_pointers, String three_pointers, String lost_three_pointers, String field_goals, String lost_field_goals, String rebounds, String defensive_rebounds, String offensive_rebounds, String assists, String turnovers, String steals, String blocks, String fouls, String timeouts, String id) {
        this.match_id = Integer.parseInt(match_id);
        this.team_id = Integer.parseInt(team_id);
        this.free_throws = Integer.parseInt(free_throws);
        this.lost_free_throws = Integer.parseInt(lost_free_throws);
        this.two_pointers = Integer.parseInt(two_pointers);
        this.lost_two_pointers = Integer.parseInt(lost_two_pointers);
        this.three_pointers = Integer.parseInt(three_pointers);
        this.lost_three_pointers = Integer.parseInt(lost_three_pointers);
        this.field_goals = Integer.parseInt(field_goals);
        this.lost_field_goals = Integer.parseInt(lost_field_goals);
        this.rebounds = Integer.parseInt(rebounds);
        this.defensive_rebounds = Integer.parseInt(defensive_rebounds);
        this.offensive_rebounds = Integer.parseInt(offensive_rebounds);
        this.assists = Integer.parseInt(assists);
        this.turnovers = Integer.parseInt(turnovers);
        this.steals = Integer.parseInt(steals);
        this.blocks = Integer.parseInt(blocks);
        this.fouls = Integer.parseInt(fouls);
        this.timeouts = Integer.parseInt(timeouts);
        this.id = Integer.parseInt(id);
    }

    public int getMatch_id() {
        return match_id;
    }
    public int getTeam_id() {
        return team_id;
    }
    public int getFree_throws() {
        return free_throws;
    }
    public int getLost_free_throws() {
        return lost_free_throws;
    }
    public int getTwo_pointers() {
        return two_pointers;
    }
    public int getLost_two_pointers() {
        return lost_two_pointers;
    }
    public int getThree_pointers() {
        return three_pointers;
    }
    public int getLost_three_pointers() {
        return lost_three_pointers;
    }
    public int getField_goals() {
        return field_goals;
    }
    public int getLost_field_goals() {
        return lost_field_goals;
    }
    public int getRebounds() {
        return rebounds;
    }
    public int getDefensive_rebounds() {
        return defensive_rebounds;
    }
    public int getOffensive_rebounds() {
        return offensive_rebounds;
    }
    public int getAssists() {
        return assists;
    }
    public int getTurnovers() {
        return turnovers;
    }
    public int getSteals() {
        return steals;
    }
    public int getBlocks() {
        return blocks;
    }
    public int getFouls() {
        return fouls;
    }
    public int getTimeouts() {
        return timeouts;
    }


}
