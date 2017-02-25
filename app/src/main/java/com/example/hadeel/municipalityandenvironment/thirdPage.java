package com.example.hadeel.municipalityandenvironment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class thirdPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        TextView txtv= (TextView) findViewById(R.id.textView2) ;

        //Bundle b= getIntent().getExtras();
        //String user= b.getString("username");
        //String pass= b.getString("password");
        txtv.setText("Welcome Hadeel");
    }

    public void buclick1 (View view) {

        Intent myintent1= new Intent (this,fourthpage.class);
        startActivity(myintent1);
    }
    public void buclick2 (View view) {
        Intent myintent2= new Intent (this,sixthpage.class);
        startActivity(myintent2);

    }
    public void buclick3 (View view) {
        Intent myintent3= new Intent (this,seventhhpage.class);
        startActivity(myintent3);










    }
}
