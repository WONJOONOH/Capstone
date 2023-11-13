package org.techtown.a1023_food_guard;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import androidx.room.Room;

import org.techtown.a1023_food_guard.main_menu_activity;

public class today_nutri_activity extends Activity {

	
	private View _bg__today_nutri;
	private View _bg__android_ui_status_bar_dark_ek1;
	private ImageView background;
	private TextView _11_11;
	private View _bg__icons_device_signal_wifi_4_bar_ek1;
	private ImageView signal_wifi_4_bar;
	private View _bg__icons_device_signal_cellular_4_bar_ek1;
	private ImageView signal_cellular_4_bar;
	private View _bg__icons_device_battery_std_ek1;
	private ImageView battery_std;
	private View _bg__ic_menu_ek1;
	private ImageView icon;
	private View rectangle_19;
	private TextView _______;
	private View _bg__group_3_ek1;
	private View rectangle_26;
	private View rectangle_25;
	private View _bg__group_4_ek1;
	private View rectangle_26_ek1;
	private View rectangle_25_ek1;
	private TextView _________________________;
	private TextView _______00_00______00_00________;
	private View _bg__group_5_ek1;
	private View rectangle_27;
	private View rectangle_29;
	private View rectangle_31;
	private View rectangle_30;
	private View rectangle_32;
	private View rectangle_28;
	private TextView ____kcal_;
	private TextView ______g_;
	private TextView _____mg_;
	private TextView ____g_;
	private TextView _____g_;
	private TextView ___g_;
	private View _bg__group_6_ek1;
	private View rectangle_27_ek1;
	private View rectangle_29_ek1;
	private View rectangle_31_ek1;
	private View rectangle_30_ek1;
	private View rectangle_32_ek1;
	private View rectangle_28_ek1;
	private TextView ____kcal__ek1;
	private TextView ______g__ek1;
	private TextView _____mg__ek1;
	private TextView ____g__ek1;
	private TextView _____g__ek1;
	private TextView ___g__ek1;
	private View rectangle_33;
	private View rectangle_34;
	private View _rectangle_35;
	private TextView ____________;
	private TextView _____________ek1;
	private TextView fatsecret_____;
	private TextView my_kcal, my_sugar, my_tan, my_salt, my_protein, my_fat;
	float my_kcal_float=0, my_sugar_float=0, my_tan_float=0, my_salt_float=0, my_protein_float=0, my_fat_float=0;
	private Button reset_btn;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.today_nutri);

		// 이전에 저장된 값을 불러온다.
		if (savedInstanceState != null) {
			String restoredText1 = savedInstanceState.getString("kcal_value_save");
			String restoredText2 = savedInstanceState.getString("sugar_value_save");
			String restoredText3 = savedInstanceState.getString("tansuhwamul_value_save");
			String restoredText4 = savedInstanceState.getString("salt_value_save");
			String restoredText5 = savedInstanceState.getString("protein_value_save");
			String restoredText6 = savedInstanceState.getString("fat_value_save");
			float restorednum1 = savedInstanceState.getFloat("kcal_float_value_save");
			float restorednum2 = savedInstanceState.getFloat("sugar_float_value_save");
			float restorednum3 = savedInstanceState.getFloat("tansuhwamul_float_value_save");
			float restorednum4 = savedInstanceState.getFloat("salt_float_value_save");
			float restorednum5 = savedInstanceState.getFloat("protein_float_value_save");
			float restorednum6 = savedInstanceState.getFloat("fat_float_value_save");


			my_kcal.setText(restoredText1);
			my_sugar.setText(restoredText2);
			my_tan.setText(restoredText3);
			my_salt.setText(restoredText4);
			my_protein.setText(restoredText5);
			my_fat.setText(restoredText6);

			my_kcal_float = restorednum1;
			my_sugar_float = restorednum2;
			my_salt_float = restorednum4;
			my_tan_float = restorednum3;
			my_protein_float = restorednum5;
			my_fat_float = restorednum6;
		}

		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		_______ = (TextView) findViewById(R.id._______);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		rectangle_26_ek1 = (View) findViewById(R.id.rectangle_26_ek1);
		rectangle_25_ek1 = (View) findViewById(R.id.rectangle_25_ek1);
		_________________________ = (TextView) findViewById(R.id._________________________);
		_______00_00______00_00________ = (TextView) findViewById(R.id._______00_00______00_00________);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_31 = (View) findViewById(R.id.rectangle_31);
		rectangle_30 = (View) findViewById(R.id.rectangle_30);
		rectangle_32 = (View) findViewById(R.id.rectangle_32);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		____kcal_ = (TextView) findViewById(R.id.____kcal_);
		______g_ = (TextView) findViewById(R.id.______g_);
		_____mg_ = (TextView) findViewById(R.id._____mg_);
		____g_ = (TextView) findViewById(R.id.____g_);
		_____g_ = (TextView) findViewById(R.id._____g_);
		___g_ = (TextView) findViewById(R.id.___g_);
		rectangle_27_ek1 = (View) findViewById(R.id.rectangle_27_ek1);
		rectangle_29_ek1 = (View) findViewById(R.id.rectangle_29_ek1);
		rectangle_31_ek1 = (View) findViewById(R.id.rectangle_31_ek1);
		rectangle_30_ek1 = (View) findViewById(R.id.rectangle_30_ek1);
		rectangle_32_ek1 = (View) findViewById(R.id.rectangle_32_ek1);
		rectangle_28_ek1 = (View) findViewById(R.id.rectangle_28_ek1);
		____kcal__ek1 = (TextView) findViewById(R.id.____kcal__ek1);
		______g__ek1 = (TextView) findViewById(R.id.______g__ek1);
		_____mg__ek1 = (TextView) findViewById(R.id._____mg__ek1);
		____g__ek1 = (TextView) findViewById(R.id.____g__ek1);
		_____g__ek1 = (TextView) findViewById(R.id._____g__ek1);
		___g__ek1 = (TextView) findViewById(R.id.___g__ek1);
		rectangle_33 = (View) findViewById(R.id.rectangle_33);
		rectangle_34 = (View) findViewById(R.id.rectangle_34);
		_rectangle_35 = (View) findViewById(R.id._rectangle_35);
		____________ = (TextView) findViewById(R.id.____________);
		_____________ek1 = (TextView) findViewById(R.id._____________ek1);
		fatsecret_____ = (TextView) findViewById(R.id.fatsecret_____);
		my_kcal = (TextView) findViewById(R.id.my_kcal);
		my_sugar = (TextView) findViewById(R.id.my_sugar);
		my_tan = (TextView) findViewById(R.id.my_tan);
		my_salt = (TextView) findViewById(R.id.my_salt);
		my_protein = (TextView) findViewById(R.id.my_protein);
		my_fat = (TextView) findViewById(R.id.my_fat);
		reset_btn = (Button) findViewById(R.id.reset_btn);

		
		_rectangle_35.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), main_menu_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		rectangle_33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.khidi.or.kr/kps/dhraStat/result5?menuId=MENU01657&gubun=sex&year=2020"));
				startActivity(myIntent);
			}
		});


		rectangle_34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fatsecret.kr/%EC%B9%BC%EB%A1%9C%EB%A6%AC-%EC%98%81%EC%96%91%EC%86%8C/search?q="));
				startActivity(myIntent);
			}
		});


		// 섭취량 초기화 버튼을 누를 경우 영양소 값을 0.0으로 초기화한다.
		reset_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				my_kcal.setText("0.0");
				my_sugar.setText("0.0");
				my_salt.setText("0.0");
				my_protein.setText("0.0");
				my_tan.setText("0.0");
				my_fat.setText("0.0");
			}
		});

		// 저장공간 4개(냉동실, 냉장실, 야채실, 상온)에서 넘어온 값 중에 1주 이상 또는 1주 이하의 값을 따로 받는다.
		Intent intent = getIntent();
		if(intent != null){
			if(intent.hasExtra("after_kcal_1week_after")){
				my_kcal_float += intent.getFloatExtra("after_kcal_1week_after", 0);
				my_sugar_float += intent.getFloatExtra("after_sugar_1week_after", 0);
				my_salt_float += intent.getFloatExtra("after_salt_1week_after", 0);
				my_protein_float += intent.getFloatExtra("after_protein_1week_after", 0);
				my_tan_float += intent.getFloatExtra("after_tansuhwamul_1week_after", 0);
				my_fat_float += intent.getFloatExtra("after_fat_1week_after", 0);
				my_kcal.setText(String.valueOf(my_kcal_float));
				my_sugar.setText(String.valueOf(my_sugar_float));
				my_protein.setText(String.valueOf(my_protein_float));
				my_tan.setText(String.valueOf(my_tan_float));
				my_salt.setText(String.valueOf(my_salt_float));
				my_fat.setText(String.valueOf(my_fat_float));
			} else if (intent.hasExtra("after_kcal_1week_before")) {
				my_kcal_float += intent.getFloatExtra("after_kcal_1week_before", 0);
				my_sugar_float += intent.getFloatExtra("after_sugar_1week_before", 0);
				my_salt_float += intent.getFloatExtra("after_salt_1week_before", 0);
				my_protein_float += intent.getFloatExtra("after_protein_1week_before", 0);
				my_tan_float += intent.getFloatExtra("after_tansuhwamul_1week_before", 0);
				my_fat_float += intent.getFloatExtra("after_fat_1week_before", 0);
				my_kcal.setText(String.valueOf(my_kcal_float));
				my_sugar.setText(String.valueOf(my_sugar_float));
				my_protein.setText(String.valueOf(my_protein_float));
				my_tan.setText(String.valueOf(my_tan_float));
				my_salt.setText(String.valueOf(my_salt_float));
				my_fat.setText(String.valueOf(my_fat_float));
			}
		}
	}


	// 현재 기록된 값들을 저장한다.
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		String kcal_value_save = my_kcal.getText().toString();
		String sugar_name_value_save = my_sugar.getText().toString();
		String tansuhwamul_value_save = my_protein.getText().toString();
		String salt_time_value_save = my_tan.getText().toString();
		String protein_food_value_save = my_salt.getText().toString();
		String fat_after_value_save = my_fat.getText().toString();
		float kcal_float_value_save = my_kcal_float;
		float sugar_float_value_save = my_sugar_float;
		float tansuhwamul_float_value_save = my_tan_float;
		float salt_float_value_save = my_salt_float;
		float protein_float_value_save = my_protein_float;
		float fat_float_value_save = my_fat_float;

		outState.putString("kcal_value_save", kcal_value_save);
		outState.putString("sugar_value_save", sugar_name_value_save);
		outState.putString("tansuhwamul_value_save", tansuhwamul_value_save);
		outState.putString("salt_value_save", salt_time_value_save);
		outState.putString("protein_value_save", protein_food_value_save);
		outState.putString("fat_value_save", fat_after_value_save);
		outState.putFloat("kcal_float_value_save", kcal_float_value_save);
		outState.putFloat("sugar_float_value_save", sugar_float_value_save);
		outState.putFloat("tansuhwamul_float_value_save", tansuhwamul_float_value_save);
		outState.putFloat("salt_float_value_save", salt_float_value_save);
		outState.putFloat("protein_float_value_save", protein_float_value_save);
		outState.putFloat("fat_float_value_save", fat_float_value_save);
	}
}
	
	