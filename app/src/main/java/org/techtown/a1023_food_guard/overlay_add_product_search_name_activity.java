package org.techtown.a1023_food_guard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class overlay_add_product_search_name_activity extends Activity {


	private ImageView line_1;
	private ImageView line_3;
	private ImageView line_2;
	private TextView _______;
	private ImageView save;
	private ImageView delete;
	private View field_border;
	private EditText input;
	private TextView label;
	private ImageView playlist_add;
	private TextView ____;
	private View rectangle_46;
	private View rectangle_51;
	private View rectangle_53;
	private View rectangle_55;
	private ImageView rectangle_50;
	private ImageView rectangle_52;
	private ImageView rectangle_54;
	private ImageView rectangle_56;
	private View rectangle_47;
	private TextView ___;
	private TextView ______;
	private TextView _______ek1;
	private TextView _______ek2;
	private TextView _______ek3, error_text_1, error_text_2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.overlay_add_product_search_name);


		line_1 = (ImageView) findViewById(R.id.line_1);
		line_3 = (ImageView) findViewById(R.id.line_3);
		line_2 = (ImageView) findViewById(R.id.line_2);
		_______ = (TextView) findViewById(R.id._______);
		save = (ImageView) findViewById(R.id.save);
		delete = (ImageView) findViewById(R.id.delete);
		field_border = (View) findViewById(R.id.field_border);
		input = (EditText) findViewById(R.id.input);
		playlist_add = (ImageView) findViewById(R.id.playlist_add);
		____ = (TextView) findViewById(R.id.____);
		rectangle_46 = (View) findViewById(R.id.rectangle_46);
		rectangle_51 = (View) findViewById(R.id.rectangle_51);
		rectangle_53 = (View) findViewById(R.id.rectangle_53);
		rectangle_55 = (View) findViewById(R.id.rectangle_55);
		rectangle_50 = (ImageView) findViewById(R.id.rectangle_50);
		rectangle_52 = (ImageView) findViewById(R.id.rectangle_52);
		rectangle_54 = (ImageView) findViewById(R.id.rectangle_54);
		rectangle_56 = (ImageView) findViewById(R.id.rectangle_56);
		rectangle_47 = (View) findViewById(R.id.rectangle_47);
		___ = (TextView) findViewById(R.id.___);
		______ = (TextView) findViewById(R.id.______);
		_______ek1 = (TextView) findViewById(R.id._______ek1);
		_______ek2 = (TextView) findViewById(R.id._______ek2);
		_______ek3 = (TextView) findViewById(R.id._______ek3);
		error_text_1 = (TextView) findViewById(R.id.error_text_1);
		error_text_2 = (TextView) findViewById(R.id.error_text_2);

		rectangle_47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				______.setVisibility(View.VISIBLE);
				error_text_1.setVisibility(View.INVISIBLE);
				error_text_2.setVisibility(View.INVISIBLE);
				if(input.getText().toString().equals("비틀즈")){
					______.setText("비틀즈");
					rectangle_50.setImageResource(R.drawable.beatles);
					_______ek1.setText("비틀즈 사워");
					rectangle_52.setImageResource(R.drawable.beatles_sour);
					rectangle_46.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							String product_name = ______.getText().toString();
							String food_kcal = "162";
							String food_sugar = "25";
							String food_tansuhwamul = "34";
							String food_salt = "0";
							String food_protein = "0";
							String food_fat = "2.9";
							String product_picture = "C:/Users/fihh8/AndroidStudioProjects/1023_food_guard/app/src/main/res/drawable/beatles.png";

							Intent intent = new Intent();

							intent.putExtra("productpicture", product_picture);
							intent.putExtra("productname", product_name);
							intent.putExtra("kcalvalue", food_kcal);
							intent.putExtra("sugarvalue", food_sugar);
							intent.putExtra("saltvalue", food_salt);
							intent.putExtra("fatvalue", food_fat);
							intent.putExtra("tansuhwamulvalue", food_tansuhwamul);
							intent.putExtra("proteinvalue", food_protein);

							setResult(RESULT_OK, intent);
							finish();
						}
					});
					rectangle_51.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View view) {
							String product_name = _______ek1.getText().toString();
							String food_kcal = "235";
							String food_sugar = "36";
							String food_tansuhwamul = "49";
							String food_salt = "35";
							String food_protein = "1";
							String food_fat = "4.1";
							String product_picture = "C:/Users/fihh8/AndroidStudioProjects/1023_food_guard/app/src/main/res/drawable/beatles_sour.png";

							Intent intent = new Intent();

							intent.putExtra("productpicture", product_picture);
							intent.putExtra("productname", product_name);
							intent.putExtra("kcalvalue", food_kcal);
							intent.putExtra("sugarvalue", food_sugar);
							intent.putExtra("saltvalue", food_salt);
							intent.putExtra("fatvalue", food_fat);
							intent.putExtra("tansuhwamulvalue", food_tansuhwamul);
							intent.putExtra("proteinvalue", food_protein);

							setResult(RESULT_OK, intent);
							finish();
						}
					});
				}
				else {
					______.setVisibility(View.INVISIBLE);
					error_text_1.setVisibility(View.VISIBLE);
					error_text_2.setVisibility(View.VISIBLE);
					error_text_1.setText("데이터베이스에 없는 제품입니다.");
					error_text_2.setText("직접 입력하여 제품을 등록해주세요.");
				}
			}
		});



		delete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});



	}
}
	
	