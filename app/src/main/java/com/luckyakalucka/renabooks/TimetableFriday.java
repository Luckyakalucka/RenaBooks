package com.luckyakalucka.renabooks;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class TimetableFriday extends AppCompatActivity implements View.OnClickListener {


    EditText et1, et2, et3, et4, et5, et6, et7, date;
    Button btnSave, btnLoad, btnDef, btnClear;
    SharedPreferences sPref;

    final String SAVED_DATE_FRIDAY = "saved_date_friday";
    final String SAVED_TEXT1_FRIDAY = "saved_text1_friday";
    final String SAVED_TEXT2_FRIDAY = "saved_text2_friday";
    final String SAVED_TEXT3_FRIDAY = "saved_text3_friday";
    final String SAVED_TEXT4_FRIDAY = "saved_text4_friday";
    final String SAVED_TEXT5_FRIDAY = "saved_text5_friday";
    final String SAVED_TEXT6_FRIDAY = "saved_text6_friday";
    final String SAVED_TEXT7_FRIDAY = "saved_text7_friday";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_friday);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7 = (EditText) findViewById(R.id.et7);
        date = (EditText) findViewById(R.id.date);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        btnLoad = (Button) findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(this);
        btnDef = (Button) findViewById(R.id.btnDef);
        btnDef.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);


        loadText();


    }

    private void loadDef() {
        et1.setText(R.string.friday1);
        et2.setText(R.string.friday2);
        et3.setText(R.string.friday3);
        et4.setText(R.string.friday4);
        et5.setText(R.string.friday5);
        et6.setText(R.string.friday6);
        et7.setText(R.string.friday7);
        date.setText("");

    }

    private void clear() {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
        et6.setText("");
        et7.setText("");
        date.setText("");

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
            case R.id.btnDef:
                loadDef();
                break;
            case R.id.btnClear:
                clear();
            default:
                break;
        }
    }


    private void loadText() {
        sPref = getSharedPreferences("MyPref1", MODE_PRIVATE);
        String savedText1 = sPref.getString(SAVED_TEXT1_FRIDAY, "");
        et1.setText(savedText1);
        String savedText2 = sPref.getString(SAVED_TEXT2_FRIDAY, "");
        et2.setText(savedText2);
        String savedText3 = sPref.getString(SAVED_TEXT3_FRIDAY, "");
        et3.setText(savedText3);
        String savedText4 = sPref.getString(SAVED_TEXT4_FRIDAY, "");
        et4.setText(savedText4);
        String savedText5 = sPref.getString(SAVED_TEXT5_FRIDAY, "");
        et5.setText(savedText5);
        String savedText6 = sPref.getString(SAVED_TEXT6_FRIDAY, "");
        et6.setText(savedText6);
        String savedText7 = sPref.getString(SAVED_TEXT7_FRIDAY, "");
        et7.setText(savedText7);
        String DATE = sPref.getString(SAVED_DATE_FRIDAY, "");
        date.setText(DATE);
    }



    private void saveText() {
        sPref = getSharedPreferences("MyPref1", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT1_FRIDAY, et1.getText().toString());
        ed.putString(SAVED_TEXT2_FRIDAY, et2.getText().toString());
        ed.putString(SAVED_TEXT3_FRIDAY, et3.getText().toString());
        ed.putString(SAVED_TEXT4_FRIDAY, et4.getText().toString());
        ed.putString(SAVED_TEXT5_FRIDAY, et5.getText().toString());
        ed.putString(SAVED_TEXT6_FRIDAY, et6.getText().toString());
        ed.putString(SAVED_TEXT7_FRIDAY, et7.getText().toString());
        ed.putString(SAVED_DATE_FRIDAY, date.getText().toString());
        ed.commit();
        Toast.makeText(TimetableFriday.this, "Расписание сохранено!", Toast.LENGTH_SHORT).show();
    }

    private void saveTextWithoutToast() {
        sPref = getSharedPreferences("MyPref1", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT1_FRIDAY, et1.getText().toString());
        ed.putString(SAVED_TEXT2_FRIDAY, et2.getText().toString());
        ed.putString(SAVED_TEXT3_FRIDAY, et3.getText().toString());
        ed.putString(SAVED_TEXT4_FRIDAY, et4.getText().toString());
        ed.putString(SAVED_TEXT5_FRIDAY, et5.getText().toString());
        ed.putString(SAVED_TEXT6_FRIDAY, et6.getText().toString());
        ed.putString(SAVED_TEXT7_FRIDAY, et7.getText().toString());
        ed.putString(SAVED_DATE_FRIDAY, date.getText().toString());
        ed.commit();
    }




    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.back) {
            Intent intent = new Intent(TimetableFriday.this, Timetable.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveTextWithoutToast();
    }
}