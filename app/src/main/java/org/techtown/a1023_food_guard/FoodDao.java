package org.techtown.a1023_food_guard;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FoodDao {

    @Insert
    void setInsertFood(Food food);

    @Update
    void setUpdateFood(Food food);

    @Delete
    void setDeleteFood(Food food);

    @Query("DELETE FROM Food WHERE id = :foodId")
    void deleteId(int foodId);

    @Query("SELECT * FROM Food")
    List<Food> getFoodAll();

    @Query("SELECT COUNT(*) FROM Food")
    int getDataCount();

    @Query("SELECT id FROM Food WHERE deadline = :deadlineValue")
    int getidtocalc(String deadlineValue);
    @Query("SELECT kcal FROM Food WHERE deadline = :deadlineValue")
    String getkcaltocalc(String deadlineValue);
    @Query("SELECT sugar FROM Food WHERE deadline = :deadlineValue")
    String getsugartocalc(String deadlineValue);
    @Query("SELECT tansuhwamul FROM Food WHERE deadline = :deadlineValue")
    String gettansuhwamultocalc(String deadlineValue);
    @Query("SELECT salt FROM Food WHERE deadline = :deadlineValue")
    String getsalttocalc(String deadlineValue);
    @Query("SELECT protein FROM Food WHERE deadline = :deadlineValue")
    String getproteintocalc(String deadlineValue);
    @Query("SELECT fat FROM Food WHERE deadline = :deadlineValue")
    String getfattocalc(String deadlineValue);

}
