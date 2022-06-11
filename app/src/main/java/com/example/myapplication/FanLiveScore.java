package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FanLiveScore extends AppCompatActivity {
    private String myIP;
    private TeamsList tlst;
    private MatchesList mlst;
    private String homeUrl;
    private String awayUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fan_live_score);


        Intent intent = getIntent();
        String myid = intent.getStringExtra("ID");
        myIP = intent.getStringExtra("myIP");


        try {
            tlst = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        mlst = new MatchesList(myIP);

        Match match = mlst.findMatch(Integer.parseInt(myid));

        Team home = tlst.findTeam(match.getHome_id());
        TextView homeTeamName = (TextView) findViewById(R.id.home_team_name);
        homeTeamName.setText(home.getName());

        Team away = tlst.findTeam(match.getAway_id());
        TextView awayTeamName = (TextView) findViewById(R.id.away_team_name);
        awayTeamName.setText(away.getName());

        ImageView home_logo = (ImageView) findViewById(R.id.teamHome);
        home_logo.setVisibility(View.VISIBLE);
        homeUrl = home.getLogo();
        Picasso.with(getApplicationContext()).load(Uri.parse(homeUrl)).into(home_logo);

        ImageView away_logo = (ImageView) findViewById(R.id.teamAway);
        away_logo.setVisibility(View.VISIBLE);
        awayUrl = away.getLogo();
        Picasso.with(getApplicationContext()).load(Uri.parse(awayUrl)).into(away_logo);

        TextView hscore = (TextView) findViewById(R.id.home_total);
        hscore.setText(Integer.toString(match.getHome_score()));
        TextView ascore = (TextView) findViewById(R.id.away_total);
        ascore.setText(Integer.toString(match.getAway_score()));

        TextView round = (TextView) findViewById(R.id.round);
        round.setText(Integer.toString(match.getRound()));


        TextView q1h = (TextView) findViewById(R.id.home_q1);
        if(match.getQ1_home_score() == 0){
            q1h.setText("-");
        }else {
            q1h.setText(Integer.toString(match.getQ1_home_score()));
        }
        TextView q2h = (TextView) findViewById(R.id.home_q2);
        if( match.getQ2_home_score() ==0){
            q2h.setText("-");
        }else{
            q2h.setText(Integer.toString(match.getQ2_home_score()));
        }
        TextView q3h = (TextView) findViewById(R.id.home_q3);
        if(match.getQ3_home_score() == 0){
            q3h.setText("-");
        }else{
            q3h.setText(Integer.toString(match.getQ3_home_score()));
        }
        TextView q4h = (TextView) findViewById(R.id.home_q4);
        if(match.getQ4_home_score() == 0){
            q4h.setText("-");
        }else{
            q4h.setText(Integer.toString(match.getQ4_home_score()));
        }


        TextView q1a = (TextView) findViewById(R.id.away_q1);
        if(match.getQ1_away_score() == 0){
            q1a.setText("-");
        }else {
            q1a.setText(Integer.toString(match.getQ1_away_score()));
        }
        TextView q2a = (TextView) findViewById(R.id.away_q2);
        if(match.getQ2_away_score() == 0){
            q2a.setText("-");
        }else {
            q2a.setText(Integer.toString(match.getQ2_away_score()));
        }
        TextView q3a = (TextView) findViewById(R.id.away_q3);
        if(match.getQ3_away_score() == 0){
            q3a.setText("-");
        }else {
            q3a.setText(Integer.toString(match.getQ3_away_score()));
        }
        TextView q4a = (TextView) findViewById(R.id.away_q4);
        if(match.getQ4_away_score() == 0){
            q4a.setText("-");
        }else {
            q4a.setText(Integer.toString(match.getQ4_away_score()));
        }

        final Button btn = (Button) findViewById(R.id.backbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(FanLiveScore.this, FunPage.class);
                myIntent.putExtra("myIP", myIP);
                startActivity(myIntent);
            }
        });

    }
}