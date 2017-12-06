package com.bignerdranch.android.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchRestaurant(View view) {
        Intent intent = new Intent(this, RestaurantActivity.class);
        startActivity(intent);
    }

    public void launchPizza(View view) {
        Intent intent = new Intent(this, PizzaActivity.class);
        startActivity(intent);
    }
}
