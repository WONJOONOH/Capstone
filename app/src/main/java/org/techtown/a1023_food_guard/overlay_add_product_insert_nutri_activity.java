package org.techtown.a1023_food_guard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class overlay_add_product_insert_nutri_activity extends Activity {


	private ImageView line_1;
	private ImageView line_2;
	private TextView __________;
	private ImageView save_nutri;
	private ImageView delete;
	private View field_border;
	private EditText input_kcal;
	private TextView label;
	private View field_border_ek1;
	private EditText input_ek1;
	private TextView label_ek1;
	private View field_border_ek2;
	private EditText input_ek2;
	private TextView label_ek2;
	private View field_border_ek3;
	private EditText input_ek3;
	private TextView label_ek3;
	private View field_border_ek4;
	private EditText input_ek4;
	private TextView label_ek4;
	private View field_border_ek5;
	private EditText input_ek5;
	private TextView label_ek5;
	private ImageView playlist_add;
	private TextView ____kcal_;
	private TextView ___g_;
	private TextView _____mg_;
	private TextView _____g_;
	private TextView ____g_;
	private TextView ______g_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.overlay_add_product_insert_nutri);

		line_1 = (ImageView) findViewById(R.id.line_1);
		line_2 = (ImageView) findViewById(R.id.line_2);
		__________ = (TextView) findViewById(R.id.__________);
		save_nutri = (ImageView) findViewById(R.id.save_nutri);
		delete = (ImageView) findViewById(R.id.delete);
		field_border = (View) findViewById(R.id.field_border);
		input_kcal = (EditText) findViewById(R.id.input_kcal);
		field_border_ek1 = (View) findViewById(R.id.field_border_ek1);
		input_ek1 = (EditText) findViewById(R.id.input_ek1);
		field_border_ek2 = (View) findViewById(R.id.field_border_ek2);
		input_ek2 = (EditText) findViewById(R.id.input_ek2);
		field_border_ek3 = (View) findViewById(R.id.field_border_ek3);
		input_ek3 = (EditText) findViewById(R.id.input_ek3);
		field_border_ek4 = (View) findViewById(R.id.field_border_ek4);
		input_ek4 = (EditText) findViewById(R.id.input_ek4);
		field_border_ek5 = (View) findViewById(R.id.field_border_ek5);
		input_ek5 = (EditText) findViewById(R.id.input_ek5);
		playlist_add = (ImageView) findViewById(R.id.playlist_add);
		____kcal_ = (TextView) findViewById(R.id.____kcal_);
		___g_ = (TextView) findViewById(R.id.___g_);
		_____mg_ = (TextView) findViewById(R.id._____mg_);
		_____g_ = (TextView) findViewById(R.id._____g_);
		____g_ = (TextView) findViewById(R.id.____g_);
		______g_ = (TextView) findViewById(R.id.______g_);

		delete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});


		save_nutri.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String KcalValue = input_kcal.getText().toString();
				String sugarValue = input_ek1.getText().toString();
				String tansuhwamulValue = input_ek2.getText().toString();
				String saltValue = input_ek3.getText().toString();
				String proteinValue = input_ek4.getText().toString();
				String fatValue = input_ek5.getText().toString();

				Intent intent = new Intent();

				intent.putExtra("kcalvalue", KcalValue);
				intent.putExtra("sugarvalue", sugarValue);
				intent.putExtra("saltvalue", saltValue);
				intent.putExtra("fatvalue", fatValue);
				intent.putExtra("tansuhwamulvalue", tansuhwamulValue);
				intent.putExtra("proteinvalue", proteinValue);

				setResult(RESULT_OK, intent);
				finish();
			}
		});
	
	}
}
	
	