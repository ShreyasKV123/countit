package com.example.CricScores;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity4 extends AppCompatActivity {
    Button btnOne,b1,b2,b3,b4,b5,btnodi;
    int count=0;
    TextView dis;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testrankings);
        b1 = (Button) findViewById(R.id.but1);
        b2 = (Button) findViewById(R.id.but2);
        b3 = (Button) findViewById(R.id.but3);
        b4 = (Button) findViewById(R.id.but4);
        b5 = (Button) findViewById(R.id.but5);
b1.setEnabled(false);
        b2.setEnabled(false);b3.setEnabled(false);
        b4.setEnabled(false);b5.setEnabled(false);
       btnodi = (Button) findViewById(R.id.butodi);
       btnodi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent i = new Intent(MainActivity4.this, odiranking.class);
               startActivity(i);
               Toast.makeText(getBaseContext(), "LATEST ODI RANKINGS", Toast.LENGTH_LONG).show();
           }
       });



dis=(TextView)findViewById(R.id.t4);

        btnOne = (Button) findViewById(R.id.butsrc);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setEnabled(true);
                b2.setEnabled(true);b3.setEnabled(true);
                b4.setEnabled(true);b5.setEnabled(true);


                //   ans = et.getText().toString();
                try {
                    apicall();
                    //System.out.println(global_obj[0]);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            private void apicall() throws IOException {

                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url("https://cricbuzz-cricket.p.rapidapi.com/stats/v1/iccstanding/team/matchtype/1")
                        .get()
                        .addHeader("X-RapidAPI-Key", "af49a1e554msh7e2d7553bad5146p149893jsna3d1e219b1dd")
                        .addHeader("X-RapidAPI-Host", "cricbuzz-cricket.p.rapidapi.com")
                        .build();

                //Response response1 = client.newCall(request).execute();

                //  Response response = client.newCall(request).execute();

                /////
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                       // Toast.makeText(getBaseContext(), "failure", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(Call call,Response response) throws IOException {
                        //  Response response = client.newCall(request).execute();


                        if (response.isSuccessful()) {
                            String resp = response.body().string();
                            try {
                                JSONObject jObj = new JSONObject(resp);

                                JSONArray jr = jObj.getJSONArray("values");
                                for (int i = 0; i < jr.length(); i++) {
//                                    tt.setText("");
                                    JSONObject jsonObject = jr.getJSONObject(i);

                                    JSONArray jr1 = jsonObject.getJSONArray("value");
                                    //for (int j = 0; j < jr1.length(); j++) {
//                                    tt.setText("");
                                       //JSONObject jsonObject1 = jr1.getJSONObject(2);

                                       String teamname=jr1.getString(2);
                                       count++;


                                       // String innings = jsonObject1.get("2").toString();
                                       // System.out.println(innings);
                                        System.out.println(teamname);
                                        try {

                                            dis.setText(" ");

                                            dis.append(count+":"+teamname + "\t");
                                        }catch (Exception e ){

                                        }
                                        finally {
                                            dis.setText(" ");
                                            if(count==1) {


                                                b1.setText(count + ":\t\t" + teamname + "\n");

                                            }
                                            if(count==2){
                                                b2.setText(count + ":\t\t" +teamname + "\n");
                                            }
                                            if(count==3){
                                                b3.setText(count + ":\t\t" + teamname + "\n");
                                            }
                                            if(count==4){
                                                b4.setText(count + ":\t\t" + teamname + "\n");
                                            }
                                            if(count==5){
                                                b5.setText(count + ":\t\t" + teamname + "\n");
                                            }
                                        }

//
//                                    }
                                    //}
                                }


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                });

            }


        });
    }
}
