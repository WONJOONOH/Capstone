package org.techtown.a1023_food_guard;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_min_product_big extends Fragment {

    private TextView barcode_in_MinPB;
    private TextView product_name_in_MinPB;
    private TextView deadline_in_MinPB;
    private TextView remain_food_in_MinPB;
    private TextView remain_time_in_MinPB;
    private TextView production_name_in_MinPB;
    private TextView category_food_in_MinPB;
    private TextView address_production_in_MinPB;
    private TextView kcal_in_MinPB;
    private TextView tansuhwamul_in_MinPB;
    private TextView protein_in_MinPB;
    private TextView sugar_in_MinPB;
    private TextView salt_in_MinPB;
    private TextView fat_in_MinPB;

    public Fragment_min_product_big() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_min_product_big, container, false);
    }

    public void setbarcodeValue(String value) {
        barcode_in_MinPB.setText(value);
    }
    public void setproductnameValue(String value) {
        product_name_in_MinPB.setText(value);
    }
    public void setdeadlineValue(String value) {
        deadline_in_MinPB.setText(value);
    }
    public void setremaintimeValue(String value) {
        remain_time_in_MinPB.setText(value);
    }
    public void setremainfoodValue(String value) {
        remain_food_in_MinPB.setText(value);
    }
    public void setproductionnameValue(String value) {
        production_name_in_MinPB.setText(value);
    }
    public void setcategoryfoodValue(String value) {
        category_food_in_MinPB.setText(value);
    }
    public void setaddressproductionValue(String value) {
        address_production_in_MinPB.setText(value);
    }
    public void setkcalValue(String value) {
        kcal_in_MinPB.setText(value);
    }
    public void settansuhwamulValue(String value) {
        tansuhwamul_in_MinPB.setText(value);
    }
    public void setproteinValue(String value) {
        protein_in_MinPB.setText(value);
    }
    public void setsugarValue(String value) {
        sugar_in_MinPB.setText(value);
    }
    public void setsaltValue(String value) {
        salt_in_MinPB.setText(value);
    }
    public void setfatValue(String value) {
        fat_in_MinPB.setText(value);
    }

}
