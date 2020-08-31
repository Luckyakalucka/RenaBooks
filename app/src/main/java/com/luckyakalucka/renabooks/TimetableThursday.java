package com.luckyakalucka.renabooks;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class TimetableThursday extends AppCompatActivity implements View.OnClickListener {


    EditText et1, et2, et3, et4, et5, et6, et7, date;
    Button btnSave, btnLoad;
    SharedPreferences sPref;

    final String SAVED_DATE_THURSDAY = "saved_date_thursday";
    final String SAVED_TEXT1_THURSDAY = "saved_text1_thursday";
    final String SAVED_TEXT2_THURSDAY = "saved_text2_thursday";
    final String SAVED_TEXT3_THURSDAY = "saved_text3_thursday";
    final String SAVED_TEXT4_THURSDAY = "saved_text4_thursday";
    final String SAVED_TEXT5_THURSDAY = "saved_text5_thursday";
    final String SAVED_TEXT6_THURSDAY = "saved_text6_thursday";
    final String SAVED_TEXT7_THURSDAY = "saved_text7_thursday";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_thursday);

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
        String savedText1 = sPref.getString(SAVED_TEXT1_THURSDAY, "");
        et1.setText(savedText1);
        String savedText2 = sPref.getString(SAVED_TEXT2_THURSDAY, "");
        et2.setText(savedText2);
        String savedText3 = sPref.getString(SAVED_TEXT3_THURSDAY, "");
        et3.setText(savedText3);
        String savedText4 = sPref.getString(SAVED_TEXT4_THURSDAY, "");
        et4.setText(savedText4);
        String savedText5 = sPref.getString(SAVED_TEXT5_THURSDAY, "");
        et5.setText(savedText5);
        String savedText6 = sPref.getString(SAVED_TEXT6_THURSDAY, "");
        et6.setText(savedText6);
        String savedText7 = sPref.getString(SAVED_TEXT7_THURSDAY, "");
        et7.setText(savedText7);
        String DATE = sPref.getString(SAVED_DATE_THURSDAY, "");
        date.setText(DATE);
    }



    private void saveText() {
        sPref = getSharedPreferences("MyPref1", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT1_THURSDAY, et1.getText().toString());
        ed.putString(SAVED_TEXT2_THURSDAY, et2.getText().toString());
        ed.putString(SAVED_TEXT3_THURSDAY, et3.getText().toString());
        ed.putString(SAVED_TEXT4_THURSDAY, et4.getText().toString());
        ed.putString(SAVED_TEXT5_THURSDAY, et5.getText().toString());
        ed.putString(SAVED_TEXT6_THURSDAY, et6.getText().toString());
        ed.putString(SAVED_TEXT7_THURSDAY, et7.getText().toString());
        ed.putString(SAVED_DATE_THURSDAY, date.getText().toString());
        ed.commit();
        Toast.makeText(TimetableThursday.this, "Расписание сохранено!", Toast.LENGTH_SHORT).show();
    }

    private void saveTextWithoutToast() {
        sPref = getSharedPreferences("MyPref1", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT1_THURSDAY, et1.getText().toString());
        ed.putString(SAVED_TEXT2_THURSDAY, et2.getText().toString());
        ed.putString(SAVED_TEXT3_THURSDAY, et3.getText().toString());
        ed.putString(SAVED_TEXT4_THURSDAY, et4.getText().toString());
        ed.putString(SAVED_TEXT5_THURSDAY, et5.getText().toString());
        ed.putString(SAVED_TEXT6_THURSDAY, et6.getText().toString());
        ed.putString(SAVED_TEXT7_THURSDAY, et7.getText().toString());
        ed.putString(SAVED_DATE_THURSDAY, date.getText().toString());
        ed.commit();
    }




    public void onMyButtonClick(View view) {
        if (view.getId() == R.id.back) {
            Intent intent = new Intent(TimetableThursday.this, Timetable.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveTextWithoutToast();
    }
}