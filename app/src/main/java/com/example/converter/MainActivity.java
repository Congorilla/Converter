package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double input;
    private EditText et;
    private TextView tv;
    private String result;
    private int pointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editTextInput);
        pointer = 0;
    }

    public void poundConvert(View v) {
        pointer = 1;
    }

    public void mileConvert(View v) {
        pointer = 2;
    }

    public void dollarConvert(View v) {
        pointer = 3;
    }

    public void convert(View v) {
            if (et.getText().toString().matches("")) {
                tv.setText("Enter Something!");
            } else if (pointer == 0) {
                tv.setText("Choose Something!");
            } else {
                input = Double.parseDouble(et.getText().toString());
                tv = (TextView) findViewById(R.id.result);
                if (pointer == 1) {
                    result = new Double(input * 0.453592).toString();
                    tv.setText(result);
                } else if (pointer == 2) {
                    result = new Double(input * 1.60934).toString();
                    tv.setText(result);
                } else {
                    result = new Double(input / 0.99).toString();
                    tv.setText(result);
                }
            }
        }
        }