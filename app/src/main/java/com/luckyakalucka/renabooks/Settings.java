package com.luckyakalucka.renabooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings2);
    }

    public void onMyButtonClick(View view) {
    Intent intent = new Intent(Settings.this, MainActivity.class);
    startActivity(intent);
}
}