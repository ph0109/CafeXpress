package com.projectdev.cafexpress;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Order.class}, version = 1)
public abstract class Orderdatabase extends RoomDatabase {
    public abstract OrderDao orderDao();

}
