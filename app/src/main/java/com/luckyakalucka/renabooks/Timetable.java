package com.luckyakalucka.renabooks;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Timetable extends AppCompatActivity implements View.OnClickListener {


    EditText et1, et2, et3, et4, et5, et6, et7;
    Button btnSave, btnLoad;
    SharedPreferences sPref;

    final String SAVED_TEXT1 = "saved_text1";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7 = (EditText) findViewById(R.id.et7);
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
        sPref = getSharedPreferences("MyPref1", MODE_PRIVATE);
        String savedText1 = sPref.getString(SAVED_TEXT1, "");
        et1.setText(savedText1);
        String savedText2 = sPref.getString(SAVED_TEXT2, "");
        et2.setText(savedText2);
        String savedText3 = sPref.getString(SAVED_TEXT3, "");
        et3.setText(savedText3);
        String savedText4 = sPref.getString(SAVED_TEXT4, "");
        et4.setText(savedText4);
        String savedText5 = sPref.getString(SAVED_TEXT5, "");
        et5.setText(savedText5);
        String savedText6 = sPref.getString(SAVED_TEXT6, "");
        et6.setText(savedText6);
        String savedText7 = sPref.getString(SAVED_TEXT7, "");
        et7.setText(savedText7);

         Toast.makeText(Timetable.this, "Text loaded", Toast.LENGTH_SHORT).show();
      }



      private void saveText() {
          sPref = getSharedPreferences("MyPref1", MODE_PRIVATE);
         SharedPreferences.Editor ed = sPref.edit();
          ed.putString(SAVED_TEXT1, et1.getText().toString());
          ed.putString(SAVED_TEXT2, et2.getText().toString());
          ed.putString(SAVED_TEXT3, et3.getText().toString());
          ed.putString(SAVED_TEXT4, et4.getText().toString());
          ed.putString(SAVED_TEXT5, et5.getText().toString());
          ed.putString(SAVED_TEXT6, et6.getText().toString());
          ed.putString(SAVED_TEXT7, et7.getText().toString());
          ed.commit();
        Toast.makeText(Timetable.this, "Text saved", Toast.LENGTH_SHORT).show();
      }



    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(Timetable.this, MainActivity.class);
            startActivity(intent);
        }
    }

      @Override
      protected void onDestroy() {
         super.onDestroy();
         saveText();
      }
}


