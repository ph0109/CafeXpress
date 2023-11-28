package com.projectdev.cafexpress;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Order {
    @PrimaryKey(autoGenerate = true)
    private int id = 0;

    private String menuName;

    private int menuPrice;

    private String option1; //hot or ice

    private String option2; //shot 농도 or shot 추가

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }
}
