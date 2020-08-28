package com.luckyakalucka.renabooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings2);


    }

    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(Settings.this, MainActivity.class);
            startActivity(intent);


        }

        }
    }
