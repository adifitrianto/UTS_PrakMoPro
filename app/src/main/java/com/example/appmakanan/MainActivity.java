package com.example.appmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAppetizer,btnMain_course,btnDessert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAppetizer = findViewById(R.id.appetizer);
        btnMain_course = findViewById(R.id.main_course);
        btnDessert = findViewById(R.id.dessert);

        btnAppetizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                Intent intent = new Intent(MainActivity.this, Appetizer.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btnMain_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                Intent intent = new Intent(MainActivity.this, MainCourse.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btnDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action
                Intent intent = new Intent(MainActivity.this, Dessert.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}