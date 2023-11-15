package org.techtown.a1023_food_guard;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_max_product_small extends Fragment {

    private TextView barcode_in_MaxPS;
    private TextView product_name_in_MaxPS;
    private TextView deadline_in_MaxPS;
    private TextView remain_time_in_MaxPS;
    private TextView remain_food_in_MaxPS;


    public Fragment_max_product_small() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_max_product_small, container, false);
    }

    public void setbarcodeValue(String value) {
        barcode_in_MaxPS.setText(value);
    }
    public void setproductnameValue(String value) {
        product_name_in_MaxPS.setText(value);
    }
    public void setdeadlineValue(String value) {
        deadline_in_MaxPS.setText(value);
    }
    public void setremaintimeValue(String value) {
        remain_time_in_MaxPS.setText(value);
    }
    public void setremainfoodValue(String value) {
        remain_food_in_MaxPS.setText(value);
    }
}
