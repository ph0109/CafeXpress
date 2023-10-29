package com.projectdev.cafexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button button_takeaway;
     Button button_visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_takeaway = findViewById(R.id.button_takeaway);
        button_visit = findViewById(R.id.button_visit);

        button_takeaway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Menu_take_Activity.class);
                startActivity(intent);
            }
        });
        button_visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Menu_visit_Activity.class);
                startActivity(intent);
            }
        });
    }
}