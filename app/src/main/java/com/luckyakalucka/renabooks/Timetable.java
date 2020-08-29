package com.luckyakalucka.renabooks;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Timetable extends AppCompatActivity implements View.OnClickListener {


    EditText editText;
    Button btnSave, btnLoad;
    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        editText = (EditText) findViewById(R.id.editText);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        btnLoad = (Button) findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(this);

        loadText();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSave:
                saveText();
                break;
            case R.id.btnLoad:
                loadText();
                break;
            default:
                break;
        }

    }




    private void loadText() {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        editText.setText(savedText);
        Toast.makeText(Timetable.this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    private void saveText() {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, editText.getText().toString());
        ed.commit();
        Toast.makeText(Timetable.this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }
}


