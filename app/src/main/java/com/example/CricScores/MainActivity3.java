package com.example.CricScores;



import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button btnOne, btnClear;
        EditText txtResult;
        TextView dis;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.statistics);

                dis = (TextView) findViewById(R.id.t3);
                btnClear = (Button) findViewById(R.id.butclr);
                btnClear.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                dis.setText(" ");
                        }
                });

                Spinner spinner = (Spinner) findViewById(R.id.spinner2);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Mode));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                String data = spinner.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();
            btnOne = (Button) findViewById(R.id.butsrc);
            btnOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String data = spinner.getSelectedItem().toString();
                    Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();


                    if (data.contains("VIRAT")) {
                        // String[] operands = data.split("/");
                        if (data.contains("VIRAT")) {
                            String result = "Span-2008-2022\nMatches-260\nRuns-12311\nHS_183\nAverage-58.07";

                            dis.setText(result);

                        } else {

                            Toast.makeText(getBaseContext(), "enter correct name.", Toast.LENGTH_LONG).show();

                        }
                    } else if (data.contains("KLRAHUL")) {
                        // String[] operands = data.split("/");
                        if (data.contains("KLRAHUL")) {
                            String result = "Span-2016-2022\nMatches-42\nRuns-1634\nHS-112\nAverage-46.89";

                            dis.setText(result);

                        } else {

                            Toast.makeText(getBaseContext(), "enter correct name.", Toast.LENGTH_LONG).show();

                        }
                    } else if (data.contains("ROHIT")) {
                        // String[] operands = data.split("/");
                        if (data.contains("ROHIT")) {
                            String result = "Span-2007-2022\nMatches-230\nRuns-9283\nHS-264\nAverage-48.6";

                            dis.setText(result);

                        } else {

                            Toast.makeText(getBaseContext(), "enter correct name.", Toast.LENGTH_LONG).show();

                        }
                    }
                    else if (data.contains("SHREYAS")) {
                        // String[] operands = data.split("/");
                        if (data.contains("SHREYAS")) {
                            String result = "Span-2017-2022\nMatches-26\nRuns-947\nHS-103\nAverage-41.7";

                            dis.setText(result);

                        } else {

                            Toast.makeText(getBaseContext(), "enter correct name.", Toast.LENGTH_LONG).show();

                        }
                    }else {

                        Toast.makeText(getBaseContext(), "enter correct name", Toast.LENGTH_LONG).show();

                    }







                }
            });
        }

}