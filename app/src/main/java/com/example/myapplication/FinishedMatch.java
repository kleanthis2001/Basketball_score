package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class FinishedMatch extends AppCompatActivity {
    private TeamsList tml;
    private MatchesList mal;
    private final String myIP = "192.168.1.2";
    ImageView home_logo;
    ImageView away_logo;
    TextView hscore;
    TextView ascore;
    TextView round;
    TextView q1h;
    TextView q2h;
    TextView q3h;
    TextView q4h;
    TextView q1a;
    TextView q2a;
    TextView q3a;
    TextView q4a;

    private String homeUrl;
    private String awayUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            tml = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        mal = new MatchesList(myIP);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_match);

        Intent intent = getIntent();
        String myid = intent.getStringExtra("ID");

        Match theMatch = mal.findMatch(Integer.parseInt(myid));

        Team home = tml.findTeam(theMatch.getHome_id());
        String home_name = home.getName();
        TextView txt = (TextView) findViewById(R.id.textView17);
        txt.setText(home_name);

        Team away = tml.findTeam(theMatch.getAway_id());
        String away_name = away.getName();
        TextView txt2 = (TextView) findViewById(R.id.textView18);
        txt2.setText(away_name);

        home_logo = (ImageView) findViewById(R.id.imageView);
        home_logo.setVisibility(View.VISIBLE);

        homeUrl = home.getLogo();
        Picasso.with(getApplicationContext()).load(Uri.parse(homeUrl)).into(home_logo);

        away_logo = (ImageView) findViewById(R.id.imageView2);
        away_logo.setVisibility(View.VISIBLE);

        awayUrl = away.getLogo();
        Picasso.with(getApplicationContext()).load(Uri.parse(awayUrl)).into(away_logo);

        hscore = (TextView) findViewById(R.id.textView19);
        hscore.setText(Integer.toString(theMatch.getHome_score()));

        ascore = (TextView) findViewById(R.id.textView20);
        ascore.setText(Integer.toString(theMatch.getAway_score()));

        round = (TextView) findViewById(R.id.textView3);
        round.setText(Integer.toString(theMatch.getRound()));

        q1h = (TextView) findViewById(R.id.textView6);
        q1h.setText(Integer.toString(theMatch.getQ1_home_score()));
        q2h = (TextView) findViewById(R.id.textView7);
        q2h.setText(Integer.toString(theMatch.getQ2_home_score()));
        q3h = (TextView) findViewById(R.id.textView11);
        q3h.setText(Integer.toString(theMatch.getQ3_home_score()));
        q4h = (TextView) findViewById(R.id.textView12);
        q4h.setText(Integer.toString(theMatch.getQ4_home_score()));

        q1a = (TextView) findViewById(R.id.textView13);
        q1a.setText(Integer.toString(theMatch.getQ1_away_score()));
        q2a = (TextView) findViewById(R.id.textView144);
        q2a.setText(Integer.toString(theMatch.getQ2_away_score()));
        q3a = (TextView) findViewById(R.id.textView155);
        q3a.setText(Integer.toString(theMatch.getQ3_away_score()));
        q4a = (TextView) findViewById(R.id.textView16);
        q4a.setText(Integer.toString(theMatch.getQ4_away_score()));

    }
}