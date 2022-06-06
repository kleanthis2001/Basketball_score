package com.example.myapplication;

public class LiveMatch {
    private int id;
    private int hometeam_starter1;
    private int hometeam_starter2;
    private int hometeam_starter3;
    private int hometeam_starter4;
    private int hometeam_starter5;
    private int awayteam_starter1;
    private int awayteam_starter2;
    private int awayteam_starter3;
    private int awayteam_starter4;
    private int awayteam_starter5;
    private int hometeam_changer1;
    private int hometeam_changer2;
    private int hometeam_changer3;
    private int hometeam_changer4;
    private int hometeam_changer5;
    private int awayteam_changer1;
    private int awayteam_changer2;
    private int awayteam_changer3;
    private int awayteam_changer4;
    private int awayteam_changer5;
    private int home_freethrowpercentage;
    private int home_twopointspercentage;
    private int home_threepointspercentage;
    private int home_insideshootspercentage;
    private int away_freethrowpercentage;
    private int away_twopointspercentage;
    private int away_threepointspercentage;
    private int away_insideshootspercentage;


    public LiveMatch(String id, String hometeam_starter1, String hometeam_starter2, String hometeam_starter3, String hometeam_starter4, String hometeam_starter5,
                     String awayteam_starter1, String awayteam_starter2 , String awayteam_starter3, String awayteam_starter4, String awayteam_starter5,
                     String hometeam_changer1, String hometeam_changer2 , String hometeam_changer3 ,
                     String awayteam_changer1, String awayteam_changer2 , String awayteam_changer3 ,
                     String home_freethrowpercentage, String home_twopointspercentage, String home_threepointspercentage , String home_insideshootspercentage,
                     String away_freethrowpercentage, String away_twopointspercentage, String away_threepointspercentage, String away_insideshootspercentage){
        this.id = Integer.parseInt(id);
        this.hometeam_starter1 = Integer.parseInt(hometeam_starter1);
        this.hometeam_starter2 = Integer.parseInt(hometeam_starter2);
        this.hometeam_starter3 = Integer.parseInt(hometeam_starter3);
        this.hometeam_starter4 = Integer.parseInt(hometeam_starter4);
        this.hometeam_starter5 = Integer.parseInt(hometeam_starter5);

        this.awayteam_starter1 = Integer.parseInt(awayteam_starter1);
        this.awayteam_starter2 = Integer.parseInt(awayteam_starter2);
        this.awayteam_starter3 = Integer.parseInt(awayteam_starter3);
        this.awayteam_starter4 = Integer.parseInt(awayteam_starter4);
        this.awayteam_starter5 = Integer.parseInt(awayteam_starter5);

        this.hometeam_changer1 = Integer.parseInt(hometeam_changer1);
        this.hometeam_changer2 = Integer.parseInt(hometeam_changer2);
        this.hometeam_changer3 = Integer.parseInt(hometeam_changer3);


        this.awayteam_changer1 = Integer.parseInt(awayteam_changer1);
        this.awayteam_changer2 = Integer.parseInt(awayteam_changer2);
        this.awayteam_changer3 = Integer.parseInt(awayteam_changer3);

        this.home_freethrowpercentage = Integer.parseInt(home_freethrowpercentage);
        this.home_twopointspercentage = Integer.parseInt(home_twopointspercentage);
        this.home_threepointspercentage = Integer.parseInt(home_threepointspercentage);
        this.home_insideshootspercentage = Integer.parseInt(home_insideshootspercentage);

        this.away_freethrowpercentage = Integer.parseInt(away_freethrowpercentage);
        this.away_twopointspercentage = Integer.parseInt(away_twopointspercentage);
        this.away_threepointspercentage = Integer.parseInt(away_threepointspercentage);
        this.away_insideshootspercentage = Integer.parseInt(away_insideshootspercentage);
    }

    public int getId() {
        return id;
    }

    public int getHometeam_starter1() {
        return hometeam_starter1;
    }

    public int getHometeam_starter2() {
        return hometeam_starter2;
    }

    public int getHometeam_starter3() {
        return hometeam_starter3;
    }

    public int getHometeam_starter4() {
        return hometeam_starter4;
    }

    public int getHometeam_starter5() {
        return hometeam_starter5;
    }

    public int getAwayteam_starter1() {
        return awayteam_starter1;
    }

    public int getAwayteam_starter2() {
        return awayteam_starter2;
    }

    public int getAwayteam_starter3() {
        return awayteam_starter3;
    }

    public int getAwayteam_starter4() {
        return awayteam_starter4;
    }

    public int getAwayteam_starter5() {
        return awayteam_starter5;
    }

    public int getHometeam_changer1() {
        return hometeam_changer1;
    }

    public int getHometeam_changer2() {
        return hometeam_changer2;
    }

    public int getHometeam_changer3() {
        return hometeam_changer3;
    }

    public int getHometeam_changer4() {
        return hometeam_changer4;
    }

    public int getHometeam_changer5() {
        return hometeam_changer5;
    }

    public int getAwayteam_changer1() {
        return awayteam_changer1;
    }

    public int getAwayteam_changer2() {
        return awayteam_changer2;
    }

    public int getAwayteam_changer3() {
        return awayteam_changer3;
    }

    public int getAwayteam_changer4() {
        return awayteam_changer4;
    }

    public int getAwayteam_changer5() {
        return awayteam_changer5;
    }

    public int getHome_freethrowpercentage() {
        return home_freethrowpercentage;
    }

    public int getHome_twopointspercentage() {
        return home_twopointspercentage;
    }

    public int getHome_threepointspercentage() {
        return home_threepointspercentage;
    }

    public int getHome_insideshootspercentage() {
        return home_insideshootspercentage;
    }

    public int getAway_freethrowpercentage() {
        return away_freethrowpercentage;
    }

    public int getAway_twopointspercentage() {
        return away_twopointspercentage;
    }

    public int getAway_threepointspercentage() {
        return away_threepointspercentage;
    }

    public int getAway_insideshootspercentage() {
        return away_insideshootspercentage;
    }


}