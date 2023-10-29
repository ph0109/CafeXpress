package com.projectdev.cafexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class OptionActivity extends AppCompatActivity {
    ImageView optionMenuImg;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        Drawable drawable = getResources().getDrawable(
                R.drawable.americano);
        Drawable drawable1 = getResources().getDrawable(
                R.drawable.latte);

        // XML 에 있는 ImageView 위젯에 이미지 셋팅
        optionMenuImg = (ImageView) findViewById(R.id.optionMenuImg);
        optionMenuImg.setImageDrawable(drawable);
    }
}