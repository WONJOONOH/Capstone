package org.techtown.a1023_food_guard;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_min_product_small extends Fragment {
    public Fragment_min_product_small() {

    }
    private TextView barcode_in_MinPS;
    private TextView product_name_in_MinPS;
    private TextView deadline_in_MinPS;
    private TextView remain_time_in_MinPS;
    private TextView remain_food_in_MinPS;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_min_product_small, container, false);
    }
    public void setbarcodeValue(String value) {
        barcode_in_MinPS.setText(value);
    }
    public void setproductnameValue(String value) {
        if (product_name_in_MinPS != null) {
            product_name_in_MinPS.setText(value);
        }
    }
    public void setdeadlineValue(String value) {
        if (deadline_in_MinPS != null) {
            deadline_in_MinPS.setText(value);
        }
    }
    public void setremaintimeValue(String value) {
        if (remain_time_in_MinPS != null) {
            remain_time_in_MinPS.setText(value);
        }
    }
    public void setremainfoodValue(String value) {
        if (remain_food_in_MinPS != null) {
            remain_food_in_MinPS.setText(value);
        }
    }

}
