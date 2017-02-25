package com.example.hadeel.municipalityandenvironment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import static android.icu.util.Calendar.getInstance;

public class sixthpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthpage);
        final Calendar c = getInstance();
        final int year = c.get(Calendar.YEAR);
        final int month = c.get(Calendar.MONTH);
        final int day = c.get(Calendar.DAY_OF_MONTH);
        final int hour = c.get(Calendar.HOUR_OF_DAY);
        final int minute = c.get(Calendar.MINUTE);
        final EditText txtTime = (EditText) findViewById(R.id.edtTime);
        final EditText txtDate = (EditText) findViewById(R.id.edtDate);

        txtTime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TimePickerDialog timepick = new TimePickerDialog(sixthpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute1) {
                        txtTime.setText(hourOfDay + ":" + minute1);
                    }
                }, hour, minute,true);
                timepick.setTitle("Select time");
                timepick.show();
            }
        });

        txtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datepicker= new DatePickerDialog(sixthpage.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        txtDate.setText(year+"-"+month+"-"+dayOfMonth);
                    }
                },year,month,day);
                datepicker.setTitle("Select date");
                datepicker.show();
            }
        });
    }
    public void buclick1 (View view) {
        Intent myintent1= new Intent (this,fifthpage.class);;
        startActivity(myintent1);
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
