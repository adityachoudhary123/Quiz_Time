package com.org.carven.quiztime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {


   public TextView qT,aIYC;
    public Button cTP;


   public void welcome(){
       qT=(TextView)findViewById(R.id.qT);
       aIYC=(TextView)findViewById(R.id.aIYC);
       cTP=(Button)findViewById(R.id.cTP);

       cTP.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(WelcomeActivity.this,"Lets Play",Toast.LENGTH_LONG).show();
               Intent intent=new Intent(WelcomeActivity.this,Central.class);
               startActivity(intent);
           }
       });
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcome();


    }
}
