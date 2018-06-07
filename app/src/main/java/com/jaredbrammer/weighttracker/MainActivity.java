package com.jaredbrammer.weighttracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize click events
        init();


        //Set the current date
        SetCurrentDateTime();
    }

    protected void SetCurrentDateTime() {
        //variables and objects
        TextView tbCurrentDate;
        String currentTime = java.text.DateFormat.getTimeInstance().format(Calendar.getInstance().getTime());
        SimpleDateFormat currentDate = new SimpleDateFormat(("dd/MM/yyyy"));

        //set the textView object
        tbCurrentDate = findViewById(R.id.tb_current_date);

        tbCurrentDate.setText(currentDate.format(new Date()) + " - " + currentTime);
    }

    protected void init() {
        //Set button click event
        final Button btnSubmit = findViewById(R.id.btn_submit_weight);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SetCurrentDateTime();
            }
        });
    }
}
