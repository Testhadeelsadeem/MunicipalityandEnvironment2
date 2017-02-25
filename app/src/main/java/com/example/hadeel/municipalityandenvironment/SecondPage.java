package com.example.hadeel.municipalityandenvironment;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;


public class SecondPage extends AppCompatActivity {

    //protected Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        //toolbar = (Toolbar) findViewById(R.id.app_bar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Enviromental Service");
        //getSupportActionBar().setIcon(getDrawable(R.mipmap.ic_launcher));

    }
    public void button14 (View view) {

        Intent myintent= new Intent (this,First_Page.class);
        startActivity(myintent);
    }
    public void button15 (View view) {

        Intent myintent= new Intent (this,Register.class);
        startActivity(myintent);
    }
}
