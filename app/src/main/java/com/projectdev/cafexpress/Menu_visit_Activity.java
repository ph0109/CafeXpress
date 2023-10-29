package com.projectdev.cafexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Menu_visit_Activity extends AppCompatActivity {
    LinearLayout americano,latte,vanillalatte,lemonade,peachtea,strawberrylatte,chocolatte,milkshake,hibiscus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_visit);

        americano = (LinearLayout) findViewById(R.id.americano);
        latte = (LinearLayout)findViewById(R.id.latte);
        vanillalatte = (LinearLayout)findViewById(R.id.vanillalatte);
        lemonade = (LinearLayout)findViewById(R.id.lemonade);
        peachtea = (LinearLayout)findViewById(R.id.peachtea);
        strawberrylatte = (LinearLayout)findViewById(R.id.strawberrylatte);
        chocolatte = (LinearLayout)findViewById(R.id.chocolatte);
        milkshake = (LinearLayout)findViewById(R.id.milkshake);
        hibiscus = (LinearLayout)findViewById(R.id.hibiscus);
        americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this, OptionActivity.class);
                startActivity(intent);
            }
        });
        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this, OptionActivity.class);
                startActivity(intent);
            }
        });
        vanillalatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                startActivity(intent);
            }
        });
        lemonade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                startActivity(intent);
            }
        });
        peachtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                startActivity(intent);
            }
        });
        strawberrylatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                startActivity(intent);
            }
        });
        chocolatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                startActivity(intent);
            }
        });
        milkshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                startActivity(intent);
            }
        });
        hibiscus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                startActivity(intent);
            }
        });
    }
}