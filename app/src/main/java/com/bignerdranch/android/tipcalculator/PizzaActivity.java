package com.bignerdranch.android.tipcalculator;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PizzaActivity extends AppCompatActivity {

    private EditText pizzaEditText;
    private RadioGroup percentRadioGroup;
    private RadioButton poorRadioButton;
    private RadioButton commonRadioButton;
    private RadioButton excellentRadioButton;
    private CheckBox badWeatherCheckBox;
    private CheckBox reallyBadWeatherCheckBox;
    private CheckBox threeMileCheckBox;
    private CheckBox fiveMileCheckBox;
    private CheckBox minimumCheckBox;
    private CheckBox largeOrderCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        pizzaEditText = (EditText) findViewById(R.id.pizzaEditText);
        pizzaEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        percentRadioGroup = (RadioGroup) findViewById(R.id.percentRadioGroup);
        percentRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                View radioButton = radioGroup.findViewById(i);
                int index = radioGroup.indexOfChild(radioButton);
            }
        });

        poorRadioButton = (RadioButton) findViewById(R.id.poorRadioButton);
        poorRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        badWeatherCheckBox = (CheckBox) findViewById(R.id.badWeatherCheckBox);
        badWeatherCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        reallyBadWeatherCheckBox = (CheckBox) findViewById(R.id.reallyBadWeatherCheckBox);
        reallyBadWeatherCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        threeMileCheckBox = (CheckBox) findViewById(R.id.threeMileCheckBox);
        threeMileCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        fiveMileCheckBox = (CheckBox) findViewById(R.id.fiveMileCheckBox);
        fiveMileCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        minimumCheckBox = (CheckBox) findViewById(R.id.minimumCheckBox);
        minimumCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        largeOrderCheckBox = (CheckBox) findViewById(R.id.largeOrderCheckBox);
        largeOrderCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
