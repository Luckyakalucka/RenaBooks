package com.luckyakalucka.renabooks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings2);
        
        TextView tvTg = (TextView) findViewById(R.id.tvTg);
        Switch switch2 = (Switch) findViewById(R.id.switch2);
    }

    Intent browserIntent;

    public void onClick(View v) {
        if (v.getId() == R.id.ivGit) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Luckyakalucka/RenaBooks"));
            startActivity(browserIntent);

        }

        if (v.getId() == R.id.ivTg) {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/joinchat/AAAAAE6SacQIaPCblqpfYQ"));
            startActivity(browserIntent);
        }
    }

    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(Settings.this, MainActivity.class);
            startActivity(intent);
        }
     }
}