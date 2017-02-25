package com.example.hadeel.municipalityandenvironment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class fifthpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthpage);
    }
    public void buclick5 (View view) {
        Intent myintent6= new Intent (this,thirdPage.class);;
        startActivity(myintent6);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_fifthpage2,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.activity_third_page) {
            Intent myintent7 = new Intent(this,thirdPage.class);
            startActivity(myintent7);
            return true;
        }
        if (id == R.id.activity_fourthpage) {
            Intent myintent7 = new Intent(this,fourthpage.class);
            startActivity(myintent7);
            return true;
        }
        if (id == R.id.activity_sixthpage) {
            Intent myintent7 = new Intent(this,sixthpage.class);
            startActivity(myintent7);
            return true;
        }
        if (id == R.id.activity_seventhhpage) {
            Intent myintent7 = new Intent(this,seventhhpage.class);
            startActivity(myintent7);
            return true;
        }
        if (id == R.id.activity_second_page) {
            Intent myintent7 = new Intent(this,SecondPage.class);
            startActivity(myintent7);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
