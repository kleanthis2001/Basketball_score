package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class FinishedMatch extends AppCompatActivity {
    private TeamsList tml;
    private MatchesList mal;
    private MatchStatsList stl;
    private String homeUrl;
    private String awayUrl;
    private String myIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //myid = to id tou agwna pou pairnoume apo prohgoumeno activity
        Intent intent = getIntent();
        String myid = intent.getStringExtra("ID");
        myIP = intent.getStringExtra("myIP");

        //Dhmiourgia listas olwn twn omadwn
        try {
            tml = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Dhmiourgia listas olwn twn agwnwn
        mal = new MatchesList(myIP);
        //Dhmiourgia listas olwn twn statistikwn
        stl= new MatchStatsList(myIP);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_match);

        //eisagwgh twn onomatwn twn omadwn
        Match theMatch = mal.findMatch(Integer.parseInt(myid));
        Team home = tml.findTeam(theMatch.getHome_id());
        String home_name = home.getName();
        TextView txt = (TextView) findViewById(R.id.textView17);
        txt.setText(home_name);

        Team away = tml.findTeam(theMatch.getAway_id());
        String away_name = away.getName();
        TextView txt2 = (TextView) findViewById(R.id.textView18);
        txt2.setText(away_name);

        //eisagwgh twn logo twn omadwn
        ImageView home_logo = (ImageView) findViewById(R.id.imageView);
        home_logo.setVisibility(View.VISIBLE);
        homeUrl = home.getLogo();
        Picasso.with(getApplicationContext()).load(Uri.parse(homeUrl)).into(home_logo);

        ImageView away_logo = (ImageView) findViewById(R.id.imageView2);
        away_logo.setVisibility(View.VISIBLE);
        awayUrl = away.getLogo();
        Picasso.with(getApplicationContext()).load(Uri.parse(awayUrl)).into(away_logo);

        //eisagwgh tou score
        TextView hscore = (TextView) findViewById(R.id.textView19);
        hscore.setText(Integer.toString(theMatch.getHome_score()));
        TextView ascore = (TextView) findViewById(R.id.textView20);
        ascore.setText(Integer.toString(theMatch.getAway_score()));

        //eisagwgh tou arithmou ths agwnistikhs
        TextView round = (TextView) findViewById(R.id.textView3);
        round.setText(Integer.toString(theMatch.getRound()));

        //eisagwgh twn pontwn ana periodo
        TextView q1h = (TextView) findViewById(R.id.textView6);
        q1h.setText(Integer.toString(theMatch.getQ1_home_score()));
        TextView q2h = (TextView) findViewById(R.id.textView7);
        q2h.setText(Integer.toString(theMatch.getQ2_home_score()));
        TextView q3h = (TextView) findViewById(R.id.textView11);
        q3h.setText(Integer.toString(theMatch.getQ3_home_score()));
        TextView q4h = (TextView) findViewById(R.id.textView12);
        q4h.setText(Integer.toString(theMatch.getQ4_home_score()));

        TextView q1a = (TextView) findViewById(R.id.textView13);
        q1a.setText(Integer.toString(theMatch.getQ1_away_score()));
        TextView q2a = (TextView) findViewById(R.id.textView144);
        q2a.setText(Integer.toString(theMatch.getQ2_away_score()));
        TextView q3a = (TextView) findViewById(R.id.textView155);
        q3a.setText(Integer.toString(theMatch.getQ3_away_score()));
        TextView q4a = (TextView) findViewById(R.id.textView16);
        q4a.setText(Integer.toString(theMatch.getQ4_away_score()));

        //eisagwgh twn statistikwn tou ghpedouxou
        MatchStats homeStats = stl.findStats(theMatch.getId(),theMatch.getHome_id());
        TextView freeHome = (TextView) findViewById(R.id.textView255);
        freeHome.setText(Integer.toString(homeStats.getFree_throws())+"/"+Integer.toString(homeStats.getLost_free_throws()));
        TextView twoHome = (TextView) findViewById(R.id.textView215);
        twoHome.setText(Integer.toString(homeStats.getTwo_pointers())+"/"+Integer.toString(homeStats.getLost_two_pointers()));
        TextView threeHome = (TextView) findViewById(R.id.textView259);
        threeHome.setText(Integer.toString(homeStats.getThree_pointers())+"/"+Integer.toString(homeStats.getLost_three_pointers()));
        TextView fieldHome = (TextView) findViewById(R.id.textView250);
        fieldHome.setText(Integer.toString(homeStats.getField_goals())+"/"+Integer.toString(homeStats.getLost_field_goals()));
        TextView rebHome = (TextView) findViewById(R.id.textView252);
        rebHome.setText(Integer.toString(homeStats.getRebounds()));
        TextView defrebHome = (TextView) findViewById(R.id.textView253);
        defrebHome.setText(Integer.toString(homeStats.getDefensive_rebounds()));
        TextView offrebHome = (TextView) findViewById(R.id.textView254);
        offrebHome.setText(Integer.toString(homeStats.getOffensive_rebounds()));
        TextView assistHome = (TextView) findViewById(R.id.textView256);
        assistHome.setText(Integer.toString(homeStats.getAssists()));
        TextView mstHome = (TextView) findViewById(R.id.textView257);
        mstHome.setText(Integer.toString(homeStats.getTurnovers()));
        TextView stlsHome = (TextView) findViewById(R.id.textView8);
        stlsHome.setText(Integer.toString(homeStats.getSteals()));
        TextView blHome = (TextView) findViewById(R.id.textView66);
        blHome.setText(Integer.toString(homeStats.getBlocks()));
        TextView fHome = (TextView) findViewById(R.id.textView133);
        fHome.setText(Integer.toString(homeStats.getFouls()));
        TextView tmtHome = (TextView) findViewById(R.id.textView25);
        tmtHome.setText(Integer.toString(homeStats.getTimeouts()));

        //eisagwgh twn statistikwn tou filoxenoumenou
        MatchStats awayStats = stl.findStats(theMatch.getId(),theMatch.getAway_id());
        TextView freeAway = (TextView) findViewById(R.id.textView277);
        freeAway.setText(Integer.toString(awayStats.getFree_throws())+"/"+Integer.toString(awayStats.getLost_free_throws()));
        TextView twoAway = (TextView) findViewById(R.id.textView272);
        twoAway.setText(Integer.toString(awayStats.getTwo_pointers())+"/"+Integer.toString(awayStats.getLost_two_pointers()));
        TextView threeAway = (TextView) findViewById(R.id.textView270);
        threeAway.setText(Integer.toString(awayStats.getThree_pointers())+"/"+Integer.toString(awayStats.getLost_three_pointers()));
        TextView fieldAway = (TextView) findViewById(R.id.textView271);
        fieldAway.setText(Integer.toString(awayStats.getField_goals())+"/"+Integer.toString(awayStats.getLost_field_goals()));
        TextView rebAway = (TextView) findViewById(R.id.textView279);
        rebAway.setText(Integer.toString(awayStats.getRebounds()));
        TextView defrebAway = (TextView) findViewById(R.id.textView273);
        defrebAway.setText(Integer.toString(awayStats.getDefensive_rebounds()));
        TextView offrebAway = (TextView) findViewById(R.id.textView274);
        offrebAway.setText(Integer.toString(awayStats.getOffensive_rebounds()));
        TextView assistAway = (TextView) findViewById(R.id.textView278);
        assistAway.setText(Integer.toString(awayStats.getAssists()));
        TextView mstAway = (TextView) findViewById(R.id.textView373);
        mstAway.setText(Integer.toString(awayStats.getTurnovers()));
        TextView stlsAway = (TextView) findViewById(R.id.textView100);
        stlsAway.setText(Integer.toString(awayStats.getSteals()));
        TextView blAway = (TextView) findViewById(R.id.textView111);
        blAway.setText(Integer.toString(awayStats.getBlocks()));
        TextView fAway = (TextView) findViewById(R.id.textView15);
        fAway.setText(Integer.toString(awayStats.getFouls()));
        TextView tmtAway = (TextView) findViewById(R.id.textView27);
        tmtAway.setText(Integer.toString(awayStats.getTimeouts()));

        final Button btn = (Button) findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(FinishedMatch.this, FunPage.class);
                myIntent.putExtra("myIP", myIP);
                startActivity(myIntent);
            }
        });
    }
}