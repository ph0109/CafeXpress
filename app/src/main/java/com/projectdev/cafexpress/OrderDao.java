package com.projectdev.cafexpress;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//data access object
@Dao
public interface OrderDao {
    @Insert // 삽입
    void setInsertOrder(Order order);

    @Update //수정
    void setUpdateOrder(Order order);

    @Delete //삭제
    void setDeleteOrder(Order order);

    @Query("SELECT * FROM `Order`")  //쿼리 : 데이터베이스에 요청하는 명령문
    List<Order> getOrderAll();

}
