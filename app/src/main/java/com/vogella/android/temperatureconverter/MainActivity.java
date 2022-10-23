package com.vogella.android.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text = (EditText) findViewById(R.id.inputValue);
        RadioButton celsiusButton = (RadioButton) findViewById((R.id.radio0));
        RadioButton fahrenheitButton = (RadioButton) findViewById((R.id.radio1));
        Button convertButton = (Button) findViewById(R.id.calculateButton);


        convertButton.setOnClickListener(v -> {
            Context context = getApplicationContext();
            // Do something in response to button click
            if (text.getText().length() == 0) {
                Toast.makeText(context, "Please enter valid number!", Toast.LENGTH_LONG).show();
                return;
            }

    float inputValue = Float.parseFloat(text.getText().toString());
            if (celsiusButton.isChecked()) {
                text.setText(String.valueOf(ConvertUtil.convertFahrenheitToCelsius(inputValue)));
                celsiusButton.setChecked(false);
                fahrenheitButton.setChecked(true);
            } else {
                text.setText(String.valueOf(ConvertUtil.convertCelsiusToFahrenheit(inputValue)));
                celsiusButton.setChecked(true);
                fahrenheitButton.setChecked(false);
            }
        });
    }

}