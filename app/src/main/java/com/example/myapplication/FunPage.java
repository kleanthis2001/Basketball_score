package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FunPage extends AppCompatActivity {
    private String myIP;
    private ArrayList<String> listview_array;
    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_page);

        Intent intent = getIntent();
        myIP = intent.getStringExtra("myIP");

        MatchesList mlst = new MatchesList(myIP);
        listview_array = mlst.getmList();

        myList=(ListView) findViewById(R.id.listView);
        myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                String teams = (String) ((TextView) view).getText();
                Intent myIntent = new Intent(FunPage.this, FinishedMatch.class);
                myIntent.putExtra("myIP", myIP);
                try {
                    myIntent.putExtra("ID", Integer.toString(mlst.findMatch(teams).getId()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                startActivity(myIntent);

            }
        });

        final Button btn = (Button) findViewById(R.id.button16);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(FunPage.this, PersonalStats.class);
                myIntent.putExtra("myIP", myIP);
                startActivity(myIntent);
            }
        });

    }
}