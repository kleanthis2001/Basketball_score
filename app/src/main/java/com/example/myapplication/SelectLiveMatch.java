package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SelectLiveMatch extends AppCompatActivity {
    private TeamsList teaml;
    private MatchesList matchl;
    private LiveMatchesList livematchl;
    private PlayersList Playerl;
    private String myIP;
    private String SelectedMatchID;
    private Button SelectBtn;

    public String IdFromSpinner(String astring){
        String id ;
        String[] str = astring.split(" ",2);
        id = str[0];

        return id;
    }


    public String getIdAndLiveMatchTeams(int id){
        String MatchText;

        Match current_match = matchl.findMatch(id);
        Team Home_team_curr_match  = teaml.findTeam(current_match.getHome_id());
        Team Away_team_curr_match  = teaml.findTeam(current_match.getAway_id());
        MatchText = Integer.toString(id) + " "+Home_team_curr_match.getName()+" VS "+Away_team_curr_match.getName();

        return MatchText;
    }



    public List<String> getAllLiveMatchesTeams(LiveMatchesList alist){
        List<String> AllLiveMatchesTeam = new ArrayList<String>();
        for(LiveMatch m:alist.getLiveList()){
            AllLiveMatchesTeam.add(getIdAndLiveMatchTeams(m.getId()));
        }
        return AllLiveMatchesTeam;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        myIP = intent.getStringExtra("myIP");

        try {
            Playerl = new PlayersList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            matchl = new MatchesList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            livematchl = new LiveMatchesList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            teaml = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_live_match);

        Spinner dropDown = (Spinner) findViewById(R.id.live_mathces);
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,getAllLiveMatchesTeams(livematchl));
        dropDown.setAdapter(arrayAdapter);

        SelectBtn = (Button) findViewById(R.id.SelectBtn);

        SelectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected = dropDown.getSelectedItem().toString();
                SelectedMatchID = (String) IdFromSpinner(selected);
                sendLIVEMatch(view);
            }
        });

        final Button Eventbtn = (Button) findViewById(R.id.button25);
        Eventbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEventMatch(v);
            }
        });

    }


    public void sendLIVEMatch(View view){
        Intent myIntent = new Intent(SelectLiveMatch.this, LineUpAdmin.class);
        myIntent.putExtra("ID",SelectedMatchID ); /////Allazontas to value allazei o agwnas
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }

    public void sendEventMatch(View view){
        Intent myIntent = new Intent(SelectLiveMatch.this, EventHandler.class);
        myIntent.putExtra("ID",SelectedMatchID ); /////Allazontas to value allazei o agwnas
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }

    public void sendLOginMatch(View view){
        Intent myIntent = new Intent(SelectLiveMatch.this, MainActivity.class);
        startActivity(myIntent);
    }



}