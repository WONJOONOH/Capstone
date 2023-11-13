package org.techtown.a1023_food_guard;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Food.class}, version = 2)
public abstract class FoodDataBase extends RoomDatabase {
    public abstract FoodDao foodDao();
}
