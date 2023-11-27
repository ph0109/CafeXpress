package com.projectdev.cafexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OptionActivity extends AppCompatActivity {
    ImageView optionMenuImg;
    ImageView img;
    Button optionDel;
    Button optionCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        //인텐트 받아오기
        Intent intent = getIntent();
        //메뉴 이름과 가격 받아와서 변수에 저장
        String menuName = intent.getStringExtra("menuName");
        int menuPrice = intent.getIntExtra("menuPrice", 0);
        int menuImage = intent.getIntExtra("menuImage", 0);

        //imageview 변수를 선언하고 메뉴 이미지 id 저장
        ImageView image = findViewById(R.id.optionMenuImg);

        //textview 변수를 선언하고 각 메뉴와 가격 id 저장
        TextView data = findViewById(R.id.optionMenuName);
        TextView price = findViewById(R.id.optionMenuPrice);

        //imageview에 menuimage 저장
        image.setImageResource(menuImage);

        //각각의 textview의 text 지정
        data.setText(menuName);
        price.setText(String.valueOf(menuPrice));

        Drawable drawable = getResources().getDrawable(
                R.drawable.americano);
        Drawable drawable1 = getResources().getDrawable(
                R.drawable.latte);

        // XML 에 있는 ImageView 위젯에 이미지 셋팅
        optionDel = findViewById(R.id.optionDel);
        optionCart = findViewById(R.id.optionCart);
        optionDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
           
        });
        optionCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}