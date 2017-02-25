package com.example.hadeel.municipalityandenvironment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
    }
    public void buclick1 (View view) {

        Intent myintent= new Intent (this,First_Page.class);
        startActivity(myintent);
    }
}
