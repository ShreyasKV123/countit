package com.example.CricScores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class news extends AppCompatActivity implements View.OnClickListener {
Button btnnews1,btnnews2,btnnews3,btnnews4,btnnews5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        TextView news1 = findViewById(R.id.n1);
        news1.setText("\tNicholas Pooran: One of \t\tthe best innings I have\t \tplayed for West Indies");
        TextView news2 = findViewById(R.id.n2);
        news2.setText("\tHardik Pandya shines with \tbat and ball as India go 1-0 \tup");
        TextView news3 = findViewById(R.id.n3);
        news3.setText("\tTrying to rewrite how Test \t\tcricket is played in England-Stokes");
        TextView news4=findViewById(R.id.n4);
        news4.setText("\tShikhar Dhawan to lead \tODI squad in West Indies");

        btnnews1 = findViewById(R.id.btnn1);
        btnnews1.setOnClickListener(this);
        btnnews2 = findViewById(R.id.btnn2);
        btnnews2.setOnClickListener(this);

        btnnews3=findViewById(R.id.btnn3);
    btnnews3.setOnClickListener(this);
    btnnews4=findViewById(R.id.btnn4);
    btnnews4.setOnClickListener(this);

    }
        @Override
        public void onClick (View v){
            if (v.equals(btnnews1)) {
// Intent will act like a broadcaster
                Intent intent = new Intent(this,MainActivitynews2.class);
                intent.putExtra("dataType", "N1");
                startActivity(intent);
            } else if (v.equals(btnnews2)) {
                Intent intent = new Intent(this, MainActivitynews2.class);
                intent.putExtra("dataType", "N2");
                startActivity(intent);
            }
            else if(v.equals(btnnews3)){
                Intent intent = new Intent(this, MainActivitynews2.class);
                intent.putExtra("dataType", "N3");
                startActivity(intent);

            }
            else if(v.equals(btnnews4)){
                Intent intent = new Intent(this, MainActivitynews2.class);
                intent.putExtra("dataType", "N4");
                startActivity(intent);

            }

        }
    }
