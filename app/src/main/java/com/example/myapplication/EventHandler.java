package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.nio.file.Files;

public class EventHandler extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton rb1,rb2;
    private LinearLayout l1,l2,l3,l4,l5,l6,l7;
    private Button s1,s2,s3,succ,fail,ofreb,defreb,foul,block,assist,turnover,home;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handler);
    rg = (RadioGroup) findViewById(R.id.aid);
    rb1 = (RadioButton) findViewById(R.id.radioButton5);
    rb2 = (RadioButton) findViewById(R.id.radioButton6);

    l1 = (LinearLayout) findViewById(R.id.linearLayout8);
    l2 = (LinearLayout) findViewById(R.id.linearLayout3);
    l3 = (LinearLayout) findViewById(R.id.linearLayout6);
    l4 = (LinearLayout) findViewById(R.id.linearLayout5);
    l5 = (LinearLayout) findViewById(R.id.linearLayout2);
    l6 = (LinearLayout) findViewById(R.id.linearLayout9);

    rb1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            l1.setVisibility(View.VISIBLE);
        }
    });

    rb2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            l1.setVisibility(View.VISIBLE);
        }
    });

     s1 = (Button) findViewById(R.id.button10);
     s2 = (Button) findViewById(R.id.button11);
     s3 = (Button) findViewById(R.id.button12);
     succ = (Button) findViewById(R.id.button17);
     fail = (Button) findViewById(R.id.button18);
     ofreb = (Button) findViewById(R.id.button13);
     defreb = (Button) findViewById(R.id.button14);
     foul = (Button) findViewById(R.id.button23);
     block = (Button) findViewById(R.id.button24);
     assist = (Button) findViewById(R.id.button28);
     turnover = (Button) findViewById(R.id.button27);
     home = (Button) findViewById(R.id.button24);

    }


    public void onClickSelect(View view){
        l2.setVisibility(View.VISIBLE);
        l6.setVisibility(View.VISIBLE);
        l4.setVisibility(View.VISIBLE);
    }

    public void onClickAfterShoot(View view){
        l2.setVisibility(View.INVISIBLE);
        l3.setVisibility(View.VISIBLE);
    }
    public void onClickAfterEventSuccess(View view){
       recreate();
    }

    public void onClickAfterShootFailed(View view){
        l5.setVisibility(View.VISIBLE);
    }


    public void sendLIVEMatch(View view){
       finish();
    }







}