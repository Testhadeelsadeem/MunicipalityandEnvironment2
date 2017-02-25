package com.example.hadeel.municipalityandenvironment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

public class First_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__page);
    }

    public void buclick (View view) {
        //EditText txtuser =(EditText) findViewById(R.id.editText5) ;
       // EditText txtpass =(EditText) findViewById(R.id.editText7);


        Intent myintent= new Intent (this,thirdPage.class);
        //Bundle b= new Bundle();
        //b.putString("username",txtuser.getText().toString());
        //b.putString("password",txtpass.getText().toString());
        //myintent.putExtras(b);
        startActivity(myintent);
    }
}
