package com.example.CricScores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class open2 extends AppCompatActivity {
    Button btnscore, btnstats, btnranks,btnnews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open2);


        btnscore = (Button) findViewById(R.id.b1);
        btnscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(open2.this, MainActivitypage2.class);
                startActivity(i);

            }
        });

        btnstats = (Button) findViewById(R.id.b2);
        btnstats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(open2.this, MainActivity3.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "WELCOME TO STATS  WORLD", Toast.LENGTH_LONG).show();
            }
        });

        btnranks = (Button) findViewById(R.id.b3);
        btnranks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(open2.this, MainActivity4.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "!!LATEST TEAM RANKINGS!!", Toast.LENGTH_LONG).show();
            }
        });
        btnnews = (Button) findViewById(R.id.b4);
        btnnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(open2.this, news.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "!!LATEST TEAM NAMES!!", Toast.LENGTH_LONG).show();
            }
        });
    }
}