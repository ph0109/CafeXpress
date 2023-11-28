package com.projectdev.cafexpress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

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
        RadioButton optHot = findViewById(R.id.optHot);
        RadioButton optIce = findViewById(R.id.optIce);
        RadioButton basic = findViewById(R.id.basic);
        RadioButton light = findViewById(R.id.light);
        RadioButton addShot = findViewById(R.id.addShot);
        RadioButton addTwoShot = findViewById(R.id.addTwoShot);

        optionDel = findViewById(R.id.optionDel);
        optionCart = findViewById(R.id.optionCart);
        optionDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
           
        });
        optionCart.setOnClickListener(new View.OnClickListener() {
            private OrderDao order_Dao;
            @Override
            public void onClick(View view) {
                Orderdatabase database = Room.databaseBuilder(getApplicationContext(), Orderdatabase.class, "CafeXpress")
                        .fallbackToDestructiveMigration() //스키마 버전 변경 가능
                        .allowMainThreadQueries()  //Main thread에서 db에 io를 가능하게 함
                        .build();
                order_Dao = database.orderDao(); //인터페이스 객체 할당

                //데이터 삽입
                Order order = new Order();
                order.setMenuName(menuName);
                order.setMenuPrice(menuPrice);

                // 선택된 옵션에 따라 Order 객체의 필드 설정
                if (optHot.isChecked())
                    order.setOption1("뜨거운");
                else if (optIce.isChecked())
                    order.setOption1("차가운");

                if (basic.isChecked())
                    order.setOption2("기본");
                else if (light.isChecked())
                    order.setOption2("연하게");
                else if (addShot.isChecked()){
                    order.setMenuPrice(menuPrice+500);
                    order.setOption2("샷 추가");
                }

                else if (addTwoShot.isChecked()){
                    order.setMenuPrice(menuPrice+1000);
                    order.setOption2("2샷 추가");
                }

                order_Dao.setInsertOrder(order);
                /*List<Order> orderList = order_Dao.getOrderAll();
                //데이터 조회
                for(int i=0;i<orderList.size();i++){
                    Log.d("TEST",orderList.get(i).getMenuName()+"\n"+
                          orderList.get(i).getMenuPrice()+"\n"+
                            orderList.get(i).getOption1()+"\n"+
                            orderList.get(i).getOption2());
                }*/
                finish();
            }

        });
    }
}