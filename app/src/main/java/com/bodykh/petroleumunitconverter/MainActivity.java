package com.bodykh.petroleumunitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void volume_but(View view) {
        Intent intent1 = new Intent(MainActivity.this, volumeconv.class);
        startActivity(intent1);
    }

    public void area_but(View view) {
        Intent intent2 = new Intent(MainActivity.this, areaconv.class);
        startActivity(intent2);
    }

    public void length_but(View view) {
        Intent intent3 = new Intent(MainActivity.this, lengthconv.class);
        startActivity(intent3);
    }

    public void pressure_but(View view) {
        Intent intent4 = new Intent(MainActivity.this, pressureconv.class);
        startActivity(intent4);
    }

    public void temperature_but(View view) {
        Intent intent5 = new Intent(MainActivity.this, temperatureconv.class);
        startActivity(intent5);
    }
}