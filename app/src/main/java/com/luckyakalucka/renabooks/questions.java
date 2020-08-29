package com.luckyakalucka.renabooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(questions.this, MainActivity.class);
            startActivity(intent);
        }
    }
}