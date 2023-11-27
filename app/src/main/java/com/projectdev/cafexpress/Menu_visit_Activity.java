package com.projectdev.cafexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu_visit_Activity extends AppCompatActivity {
    LinearLayout americano,latte,vanillalatte,lemonade,peachtea,strawberrylatte,chocolatte,milkshake,hibiscus;
    String img = new String();
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
        hibiscus = (LinearLayout)findViewById   (R.id.hibiscus);
        americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this, OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.americano);
                intent.putExtra("menuName","아메리카노");
                intent.putExtra("menuPrice", 1500);
                startActivity(intent);
            }

        });
        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this, OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.latte);
                intent.putExtra("menuName","라떼");
                intent.putExtra("menuPrice", 3000);
                startActivity(intent);
            }
        });
        vanillalatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.vanilla);
                intent.putExtra("menuName","바닐라라떼");
                intent.putExtra("menuPrice", 3500);
                startActivity(intent);
            }
        });
        lemonade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.lemon);
                intent.putExtra("menuName","레몬에이드");
                intent.putExtra("menuPrice", 3500);
                startActivity(intent);
            }
        });
        peachtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.peachtea);
                intent.putExtra("menuName","복숭아아이스티");
                intent.putExtra("menuPrice", 3000);
                startActivity(intent);
            }
        });
        strawberrylatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.strawberry);
                intent.putExtra("menuName","딸기라떼");
                intent.putExtra("menuPrice", 3800);
                startActivity(intent);
            }
        });
        chocolatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.choco);
                intent.putExtra("menuName","초콜릿라떼");
                intent.putExtra("menuPrice", 3800);
                startActivity(intent);
            }
        });
        milkshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.milk);
                intent.putExtra("menuName","밀크쉐이크");
                intent.putExtra("menuPrice", 4500);
                startActivity(intent);
            }
        });
        hibiscus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_visit_Activity.this,OptionActivity.class);
                intent.putExtra("menuImage", R.drawable.hibi);
                intent.putExtra("menuName","히비스커스");
                intent.putExtra("menuPrice", 3500);
                startActivity(intent);
            }
        });
    }
}