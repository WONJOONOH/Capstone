package org.techtown.a1023_food_guard;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Food {
    @PrimaryKey(autoGenerate = true)
    private int id = 0;

    private String name;    //제품명
    private String kcal;       //칼로리
    private String sugar;      //당
    private String tansuhwamul;//탄수화물
    private String salt;       //나트륨
    private String protein;    //단백질
    private String fat;        //지방
    private String remain_food;//남은 음식 양
    private String deadline;//유통기한
    private String barcode;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getTansuhwamul() {
        return tansuhwamul;
    }

    public void setTansuhwamul(String tansuhwamul) {
        this.tansuhwamul = tansuhwamul;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getRemain_food() {
        return remain_food;
    }

    public void setRemain_food(String remain_food) {
        this.remain_food = remain_food;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
