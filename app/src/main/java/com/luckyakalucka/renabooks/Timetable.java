package com.luckyakalucka.renabooks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Timetable extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
    }

    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(Timetable.this, MainActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.monday) {
            Intent intent = new Intent(Timetable.this, TimetableMonday.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.tuesday) {
            Intent intent = new Intent(Timetable.this, TimetableTuesday.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.wednesday) {
            Intent intent = new Intent(Timetable.this, TimetableWednesday.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.thursday) {
            Intent intent = new Intent(Timetable.this, TimetableThursday.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.friday) {
            Intent intent = new Intent(Timetable.this, TimetableFriday.class);
            startActivity(intent);
        }
    }
}


