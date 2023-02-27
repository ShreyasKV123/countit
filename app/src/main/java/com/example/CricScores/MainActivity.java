package com.example.CricScores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnscore,btnstats,btnranks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        btnscore = (Button) findViewById(R.id.b1);
        btnscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, open2.class);
                startActivity(i);
               // Toast.makeText(getBaseContext(), "!!!!!", Toast.LENGTH_LONG).show();
            }
        });


    }
}
