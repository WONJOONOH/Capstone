package org.techtown.a1023_food_guard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class testfragment extends AppCompatActivity {

    Button btn1, btn2, btn3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testfragment);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment_min_product_small fragmentMinproductsmall = new Fragment_min_product_small();
                transaction.replace(R.id.frame, fragmentMinproductsmall);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment_min_noproduct_small fragmentMinnoproductsmall = new Fragment_min_noproduct_small();
                transaction.replace(R.id.frame, fragmentMinnoproductsmall);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment_min_product_big fragmentMinProductBig = new Fragment_min_product_big();
                transaction.replace(R.id.frame, fragmentMinProductBig);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }
}
