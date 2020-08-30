package com.luckyakalucka.renabooks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Context context;

    ImageView ivtimetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.timetable) {
            Intent intent = new Intent(MainActivity.this, Timetable.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.books) {
            Intent intent = new Intent(MainActivity.this, BooksActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.timetabletime) {
            Intent intent = new Intent(MainActivity.this, BooksActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.settings) {
            Intent intent = new Intent(MainActivity.this, Settings.class);
            startActivity(intent);
        }


    }
}