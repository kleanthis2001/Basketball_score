package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {
    private String myIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        myIP = intent.getStringExtra("myIP");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        AdminsList aList = new AdminsList(myIP);

        EditText uname = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText pword = (EditText) findViewById(R.id.editTextTextPassword);

        final Button btn = (Button) findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aList.findAdmin(uname.getText().toString(),pword.getText().toString())) {
                    Intent myIntent = new Intent(AdminLogin.this, AdminPage.class);
                    startActivity(myIntent);
                }else{
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}