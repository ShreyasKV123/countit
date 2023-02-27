package com.example.CricScores;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivitypage2 extends AppCompatActivity {

        Button btn1,bt;
        String md,m,m1;
        TextView tt;
        String data,status,url;
        int teamnid;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.scoresandseries);


                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivitypage2.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.teamnames));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                 data = spinner.getSelectedItem().toString();
                if (data.contains("AUSTRALIA")){
                        teamnid=46541;
                        url="https://cricbuzz-cricket.p.rapidapi.com/mcenter/v1/46451/overs";


                }
                else if(data.contains("ENGLAND")){
                        teamnid=38332;
                        url="https://cricbuzz-cricket.p.rapidapi.com/mcenter/v1/38332/overs";




                }

                else if(data.contains("SOUTH")){
                     teamnid=38411;
                        url="https://cricbuzz-cricket.p.rapidapi.com/mcenter/v1/38411/overs";



                }
                else if(data.contains("INDIA")){
                        teamnid=38301;
                        url="https://cricbuzz-cricket.p.rapidapi.com/mcenter/v1/38301/overs";

                }






                bt=(Button) findViewById(R.id.button);
                bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                               // et=(EditText)findViewById(R.id.editTextTextPersonName);
                                //ans=et.getText().toString();



                                try {
                                        apicall();
                                } catch (IOException e) {
                                        e.printStackTrace();
                                }
                        }


                        private void apicall() throws IOException {

                                OkHttpClient client = new OkHttpClient();

                                Request request = new Request.Builder()
                                        .url(url)
                                        .get()
                                        .addHeader("X-RapidAPI-Key", "af49a1e554msh7e2d7553bad5146p149893jsna3d1e219b1dd")
                                        .addHeader("X-RapidAPI-Host", "cricbuzz-cricket.p.rapidapi.com")
                                        .build();
                                client.newCall(request).enqueue(new Callback() {
                                        @Override
                                        public void onFailure(Call call, IOException e) {
                                                Toast.makeText(getBaseContext(), "failure",Toast.LENGTH_LONG).show();
                                        }

                                        @Override
                                        public void onResponse(Call call, Response response) throws IOException {
                                                if(response.isSuccessful()){
                                                        String resp= response.body().string();
                                                        MainActivitypage2.this.runOnUiThread(new Runnable() {
//                                                                @Override


                                                                public void run(){
                                                                        try{
                                                                                JSONObject head=new JSONObject(resp);
                                                                                 status=head.getString("status");
                                                                                System.out.println(status);



                                                                        } catch (JSONException e) {


                                                                                e.printStackTrace();
                                                                        }
                                                                        finally {
                                                                                bt.setText(status);
                                                                        }
                                                                       // bt.setText("India Tour of England");

//
                                                           }
                                                        });
                                                }
                                        }
                                });



                        }




                });


                btn1=(Button) findViewById(R.id.button1);
                btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                String data1 = spinner.getSelectedItem().toString();

                                if (data1.contains("AUSTRALIA")){
                                        btn1.setText("Australia Tour Of SriLanka");
                                       // btn1.setText("Australia Tour Of Zimbabwe ");


                                }
                                else if(data1.contains("ENGLAND")){
                                        btn1.setText("India Tour of England");
                                     //   btn1.setText("England Tour of South Africa ");


                                }

                                else if(data1.contains("SOUTH")){
                                       // bt.setText("SouthAfrica Tour of Ireland");
                                        btn1.setText("England Tour of South Africa ");


                                }
                                else if(data.contains("INDIA")){
                                        btn1.setText("India Tour Of England");


                                }

                                // else{
                                 //       bt.setText("India Tour of England");
                                   //     btn1.setText("India Tour of Ireland");
                                //}
                        }
                });


        }
}


/*JSONObject head=new JSONObject(resp);
                                                                                JSONArray hi=head.getJSONArray("adWrapper");
                                                                              //  JSONArray arr=new JSONArray(hi);
                                                                                for(int i=0;i<hi.length();i++){
                                                                                        JSONObject  obj=hi.getJSONObject(i);
                                                                                        md=obj.getString("matchDetails");
                                                                                        JSONObject  obj1=hi.getJSONObject(Integer.parseInt(md));
                                                                                        m=obj1.getString("0");
                                                                                        JSONObject  obj2=hi.getJSONObject(Integer.parseInt(m));
                                                                                        m1=obj1.getString("key");
                                                                                        tt.setText(m);
                                                                                      Toast.makeText(getBaseContext(), "hi",Toast.LENGTH_LONG).show();


                                                                                }*/