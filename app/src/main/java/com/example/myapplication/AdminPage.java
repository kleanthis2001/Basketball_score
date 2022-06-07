package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminPage extends AppCompatActivity {
    private String myIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        myIP = intent.getStringExtra("myIP");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        final Button btn = (Button) findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AdminPage.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        final Button btn1 = (Button) findViewById(R.id.button9);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSelectLiveMatchAdmin(v);
            }
        });
    }


    public void sendSelectLiveMatchAdmin(View view){
        Intent myIntent = new Intent(AdminPage.this, SelectLiveMatch.class);
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }
}