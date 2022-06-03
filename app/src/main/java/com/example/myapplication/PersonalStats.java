package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonalStats extends AppCompatActivity {
    private PlayerStatsList pl;
    private PlayersList psl;
    private ArrayList<PlayerStats> topPoints;
    private ArrayList<PlayerStats> topAssists;
    private ArrayList<PlayerStats> topRebounds;
    private String myIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String myid = intent.getStringExtra("ID");
        myIP = intent.getStringExtra("myIP");

        //Dhmiourgia listas olwn twn statistikwn
        try {
            pl = new PlayerStatsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Dhmiourgia listas olwn twn statistikwn
        psl = new PlayersList(myIP);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_stats);

        //Eisagwgh top4 gia pontous
        topPoints = pl.getTopPoints();

        TextView p1 = (TextView) findViewById(R.id.textView4);
        p1.setText(Integer.toString(topPoints.get(0).getPoints()));
        TextView pn1 = (TextView) findViewById(R.id.textView3);
        pn1.setText(psl.findPlayer(topPoints.get(0).getPlayerID()).getName());

        TextView p2 = (TextView) findViewById(R.id.textView6);
        p2.setText(Integer.toString(topPoints.get(1).getPoints()));
        TextView pn2 = (TextView) findViewById(R.id.textView5);
        pn2.setText(psl.findPlayer(topPoints.get(1).getPlayerID()).getName());

        TextView p3 = (TextView) findViewById(R.id.textView8);
        p3.setText(Integer.toString(topPoints.get(2).getPoints()));
        TextView pn3 = (TextView) findViewById(R.id.textView7);
        pn3.setText(psl.findPlayer(topPoints.get(2).getPlayerID()).getName());

        TextView p4 = (TextView) findViewById(R.id.textView10);
        p4.setText(Integer.toString(topPoints.get(3).getPoints()));
        TextView pn4 = (TextView) findViewById(R.id.textView9);
        pn4.setText(psl.findPlayer(topPoints.get(3).getPlayerID()).getName());

        //Eisagwgh top4 gia assists
        topAssists = pl.getTopAssists();

        TextView a1 = (TextView) findViewById(R.id.textView12);
        a1.setText(Integer.toString(topAssists.get(0).getAssists()));
        TextView an1 = (TextView) findViewById(R.id.textView11);
        an1.setText(psl.findPlayer(topAssists.get(0).getPlayerID()).getName());

        TextView a2 = (TextView) findViewById(R.id.textView14);
        a2.setText(Integer.toString(topAssists.get(1).getAssists()));
        TextView an2 = (TextView) findViewById(R.id.textView13);
        an2.setText(psl.findPlayer(topAssists.get(1).getPlayerID()).getName());

        TextView a3 = (TextView) findViewById(R.id.textView16);
        a3.setText(Integer.toString(topAssists.get(2).getAssists()));
        TextView an3 = (TextView) findViewById(R.id.textView15);
        an3.setText(psl.findPlayer(topAssists.get(2).getPlayerID()).getName());

        TextView a4 = (TextView) findViewById(R.id.textView18);
        a4.setText(Integer.toString(topAssists.get(3).getAssists()));
        TextView an4 = (TextView) findViewById(R.id.textView17);
        an4.setText(psl.findPlayer(topAssists.get(3).getPlayerID()).getName());

        //Eisagwgh top4 gia rebounds
        topRebounds = pl.getTopRebounds();

        TextView r1 = (TextView) findViewById(R.id.textView21);
        r1.setText(Integer.toString(topRebounds.get(0).getAssists()));
        TextView rn1 = (TextView) findViewById(R.id.textView20);
        rn1.setText(psl.findPlayer(topRebounds.get(0).getPlayerID()).getName());

        TextView r2 = (TextView) findViewById(R.id.textView23);
        r2.setText(Integer.toString(topRebounds.get(1).getAssists()));
        TextView rn2 = (TextView) findViewById(R.id.textView22);
        rn2.setText(psl.findPlayer(topRebounds.get(1).getPlayerID()).getName());

        TextView r3 = (TextView) findViewById(R.id.textView25);
        r3.setText(Integer.toString(topRebounds.get(2).getAssists()));
        TextView rn3 = (TextView) findViewById(R.id.textView24);
        rn3.setText(psl.findPlayer(topRebounds.get(2).getPlayerID()).getName());

        TextView r4 = (TextView) findViewById(R.id.textView27);
        r4.setText(Integer.toString(topRebounds.get(3).getAssists()));
        TextView rn4 = (TextView) findViewById(R.id.textView26);
        rn4.setText(psl.findPlayer(topRebounds.get(3).getPlayerID()).getName());
    }
}