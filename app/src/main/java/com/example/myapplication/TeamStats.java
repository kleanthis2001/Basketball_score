package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TeamStats extends AppCompatActivity {
    private String myIP;
    private TeamsList tml;
    private MatchesList mal;
    private MatchStatsList stl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //myid = to id tou agwna pou pairnoume apo prohgoumeno activity
        Intent intent = getIntent();
        String myid = intent.getStringExtra("ID");
        myIP = intent.getStringExtra("myIP");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_stats);


        //Dhmiourgia listas olwn twn omadwn
        try {
            tml = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }








    }
}