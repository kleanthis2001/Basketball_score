package com.example.myapplication;

public class Match {
    private int id;
    private int home_id;
    private int away_id;
    private int round;
    private int home_score;
    private int away_score;
    private int q1_home_score;
    private int q1_away_score;
    private int q2_home_score;
    private int q2_away_score;
    private int q3_home_score;
    private int q3_away_score;
    private int q4_home_score;
    private int q4_away_score;

    public Match(String id, String home_id, String away_id, String round, String home_score, String away_score, String q1_home_score, String q1_away_score, String q2_home_score, String q2_away_score, String q3_home_score, String q3_away_score, String q4_home_score, String q4_away_score) {
        this.id = Integer.parseInt(id);
        this.home_id = Integer.parseInt(home_id);
        this.away_id = Integer.parseInt(away_id);
        this.round = Integer.parseInt(round);
        this.home_score = Integer.parseInt(home_score);
        this.away_score = Integer.parseInt(away_score);
        this.q1_home_score = Integer.parseInt(q1_home_score);
        this.q1_away_score = Integer.parseInt(q1_away_score);
        this.q2_home_score = Integer.parseInt(q2_home_score);
        this.q2_away_score = Integer.parseInt(q2_away_score);
        this.q3_home_score = Integer.parseInt(q3_home_score);
        this.q3_away_score = Integer.parseInt(q3_away_score);
        this.q4_home_score = Integer.parseInt(q4_home_score);
        this.q4_away_score = Integer.parseInt(q4_away_score);
    }
    public int getId() { return id; }
    public int getHome_id() {
        return home_id;
    }
    public int getAway_id() {
        return away_id;
    }
    public int getRound() {
        return round;
    }
    public int getHome_score() {
        return home_score;
    }
    public int getAway_score() {
        return away_score;
    }
    public int getQ1_home_score() {
        return q1_home_score;
    }
    public int getQ1_away_score() {
        return q1_away_score;
    }
    public int getQ2_home_score() {
        return q2_home_score;
    }
    public int getQ2_away_score() {
        return q2_away_score;
    }
    public int getQ3_home_score() {
        return q3_home_score;
    }
    public int getQ3_away_score() {
        return q3_away_score;
    }
    public int getQ4_home_score() {
        return q4_home_score;
    }
    public int getQ4_away_score() {
        return q4_away_score;
    }
}
