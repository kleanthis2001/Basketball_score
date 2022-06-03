package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String myIP = "192.168.1.21";  //////Allazoume dw thn ip kai sto network_security_config.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendFinishedMatch(view);
            }
        });

        final Button btn2 = (Button) findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendPersonalStats(view);
            }
        });
    }

    public void sendFinishedMatch(View view){
        Intent myIntent = new Intent(MainActivity.this, FinishedMatch.class);
        myIntent.putExtra("ID", "1"); /////Allazontas to value allazei o agwnas
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }
    public void sendPersonalStats(View view){
        Intent myIntent = new Intent(MainActivity.this, PersonalStats.class);
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }
}