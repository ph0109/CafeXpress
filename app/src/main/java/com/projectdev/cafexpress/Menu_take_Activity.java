package com.projectdev.cafexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Menu_take_Activity extends AppCompatActivity {
    LinearLayout americano;
    LinearLayout latte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_take);

        americano = (LinearLayout) findViewById(R.id.americano);
        latte = (LinearLayout)findViewById(R.id.latte);
        americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_take_Activity.this, OptionActivity.class);
                startActivity(intent);
            }
        });
        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_take_Activity.this, OptionActivity.class);
                startActivity(intent);
            }
        });


    }
}