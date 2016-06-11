package com.bignerdranch.android.phonephoto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void onOrderClick (View v) {
    double p1, p2, p3;
    TextView tv1 = (TextView) findViewById(R.id.num1);
    RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton);
    RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
    RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);

    if (rb1.isChecked()) {
        p1 = .19;
    }
    if (rb2.isChecked()) ;
    {
        p2 = .49;
    }
    if (rb3.isChecked()) ;
    {
        p3 = .79;
    }




        }
    }
