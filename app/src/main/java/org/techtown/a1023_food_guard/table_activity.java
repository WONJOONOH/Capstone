package org.techtown.a1023_food_guard;



import static org.techtown.a1023_food_guard.freezer_activity.convertStringToDate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class table_activity extends AppCompatActivity {

	
	private View _bg__table;
	private View rectangle_8;
	private TextView table_name;
	private View _bg__ic_menu_ek1;
	private ImageView icon;
	private View _bg__list_ek1;
	private View rectangle_18;
	private View rectangle_13;
	private TextView type1_in_table;
	private View _bg__group_1_ek1;
	private View rectangle_14;
	private View _bg___tabs_icon_active_ek1;
	private View _bg__icons_home_ek1;
	private View _bg__icon_actions_table_ek1;
	private View rectangle_15;
	private View rectangle_16;
	private View rectangle_13_ek1;
	private View rectangle_17;
	private TextView barcode_in_table, barcode_value_in_table;
	private TextView product_name_in_table, product_name_value_in_table;
	private TextView deadline_in_table, deadline_value_in_table;
	private TextView remain_time_in_table, remain_time_value_in_table;
	private TextView remain_food_in_table, remain_food_value_in_table;
	private ImageView rectangle_11, rectangle_110;
	private TextView product_picture_in_table, product_picture2_in_freezer;
	private View _bg__list_ek3;
	private View _bg__list_ek5;
	private View rectangle_18_ek1;
	private View rectangle_13_ek2;
	private TextView type2_in_table;
	private View _bg__icons_alert_error_ek1;
	private ImageView error;
	private TextView caution1_in_table;
	private TextView caution2_in_table;
	private View _bg__ic_add_ek1;
	private ImageView icon_ek1;
	private View _bg__ic_baseline_add_circle_outline_ek1;
	private ImageView vector;
	private View _bg__tabs_icon_5_tabs_ek1;
	private ImageView tab_bg;
	private View _bg___tabs_icon_inactive_ek1;
	private View _bg__icons_actions_home_ek1;
	private ImageView home;
	private View _bg___tabs_icon_inactive_ek3;
	private View _bg__icon_freezer_ek1;
	private View _bg___tabs_icon_inactive_ek5;
	private View _bg__icon_cold_storage_ek1;
	private View _bg___tabs_icon_inactive_ek7;
	private View _bg__icon_veget_ek1;
	private View _bg__tabs_icon_active_ek1;
	private View indicator;
	private View _bg__icon_table_ek1;
	private View _bg__tabs_icon_inactive_ek1;
	private FoodDao mfoodDao;

	private TextView tv_barcode_table, tv_productName_table, tv_Remain_food_table, tv_Deadline_table, tv_Kcal_table,
			tv_Sugar_table, tv_Tansuhwamul_table, tv_Salt_table, tv_Protein_table, tv_Fat_table;
	private Button getdata_in_table, remove_data_in_table, reset_list_in_table;
	private TextView barcode_value_in_table_MaxPS, product_name_value_in_table_MaxPS, deadline_value_in_table_MaxPS,
			remain_time_value_in_table_MaxPS, remain_food_value_in_table_MaxPS;
	float kcaltocalc_float_1week_after, sugartocalc_float_1week_after, tansuhwamultocalc_float_1week_after, salttocalc_float_1week_after,
			proteintocalc_float_1week_after, fattocalc_float_1week_after;
	float kcaltocalc_float_1week_before, sugartocalc_float_1week_before, tansuhwamultocalc_float_1week_before, salttocalc_float_1week_before,
			proteintocalc_float_1week_before, fattocalc_float_1week_before;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.table);

		if (savedInstanceState != null) {
			String restoredText1 = savedInstanceState.getString("barcode_value_save");
			String restoredText2 = savedInstanceState.getString("product_name_value_save");
			String restoredText3 = savedInstanceState.getString("deadline_value_save");
			String restoredText4 = savedInstanceState.getString("remain_time_value_save");
			String restoredText5 = savedInstanceState.getString("remain_food_value_save");
			String restoredText6 = savedInstanceState.getString("barcode_after_value_save");
			String restoredText7 = savedInstanceState.getString("product_name_after_value_save");
			String restoredText8 = savedInstanceState.getString("deadline_after_value_save");
			String restoredText9 = savedInstanceState.getString("remain_time_after_value_save");
			String restoredText10 = savedInstanceState.getString("remain_food_after_value_save");
			barcode_value_in_table.setText(restoredText1);
			product_name_in_table.setText(restoredText2);
			deadline_in_table.setText(restoredText3);
			remain_time_in_table.setText(restoredText4);
			remain_food_in_table.setText(restoredText5);
			barcode_value_in_table_MaxPS.setText(restoredText6);
			product_name_value_in_table_MaxPS.setText(restoredText7);
			deadline_value_in_table_MaxPS.setText(restoredText8);
			remain_time_value_in_table_MaxPS.setText(restoredText9);
			remain_food_value_in_table_MaxPS.setText(restoredText10);
		}

		tv_barcode_table = (TextView) findViewById(R.id.tv_barcode_table);
		tv_productName_table = (TextView) findViewById(R.id.tv_productName_table);
		tv_Remain_food_table = (TextView) findViewById(R.id.tv_Remain_food_table);
		tv_Deadline_table = (TextView) findViewById(R.id.tv_Deadline_table);
		tv_Kcal_table = (TextView) findViewById(R.id.tv_Kcal_table);
		tv_Sugar_table = (TextView) findViewById(R.id.tv_Sugar_table);
		tv_Tansuhwamul_table = (TextView) findViewById(R.id.tv_Tansuhwamul_table);
		tv_Salt_table = (TextView) findViewById(R.id.tv_Salt_table);
		tv_Protein_table = (TextView) findViewById(R.id.tv_Protein_table);
		tv_Fat_table = (TextView) findViewById(R.id.tv_Fat_table);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		table_name = (TextView) findViewById(R.id.table_name);
		rectangle_18 = (View) findViewById(R.id.rectangle_18);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
		type1_in_table = (TextView) findViewById(R.id.type1_in_table);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		rectangle_13_ek1 = (View) findViewById(R.id.rectangle_13_ek1);
		rectangle_17 = (View) findViewById(R.id.rectangle_17);
		barcode_in_table = (TextView) findViewById(R.id.barcode_in_table);
		product_name_in_table = (TextView) findViewById(R.id.product_name_in_table);
		deadline_in_table = (TextView) findViewById(R.id.deadline_in_table);
		remain_time_in_table = (TextView) findViewById(R.id.remain_time_in_table);
		remain_food_in_table = (TextView) findViewById(R.id.remain_food_in_table);
		barcode_value_in_table = (TextView) findViewById(R.id.barcode_value_in_table);
		product_name_value_in_table = (TextView) findViewById(R.id.product_name_value_in_table);
		deadline_value_in_table = (TextView) findViewById(R.id.deadline_value_in_table);
		remain_time_value_in_table = (TextView) findViewById(R.id.remain_time_value_in_table);
		remain_food_value_in_table = (TextView) findViewById(R.id.remain_food_value_in_table);
		rectangle_11 = (ImageView) findViewById(R.id.rectangle_11);
		product_picture_in_table = (TextView) findViewById(R.id.product_picture_in_table);
		type2_in_table = (TextView) findViewById(R.id.type2_in_table);
		vector = (ImageView) findViewById(R.id.vector);
		_bg__tabs_icon_5_tabs_ek1 = (View) findViewById(R.id._bg__tabs_icon_5_tabs_ek1);
		tab_bg = (ImageView) findViewById(R.id.tab_bg);
		_bg___tabs_icon_active_ek1 = (View) findViewById(R.id._bg___tabs_icon_active_ek1);
		_bg___tabs_icon_inactive_ek1 = (View) findViewById(R.id._bg___tabs_icon_inactive_ek1);
		_bg__tabs_icon_inactive_ek1 = (View) findViewById(R.id._bg__tabs_icon_inactive_ek1);
		_bg__icons_home_ek1 = (View) findViewById(R.id._bg__icons_home_ek1);
		home = (ImageView) findViewById(R.id.home);
		_bg__icon_freezer_ek1 = (View) findViewById(R.id._bg__icon_freezer_ek1);
		_bg__icon_actions_table_ek1 = (View) findViewById(R.id._bg__icon_actions_table_ek1);
		_bg___tabs_icon_inactive_ek5 = (View) findViewById(R.id._bg___tabs_icon_inactive_ek5);
		_bg__icon_cold_storage_ek1 = (View) findViewById(R.id._bg__icon_cold_storage_ek1);
		_bg___tabs_icon_inactive_ek7 = (View) findViewById(R.id._bg___tabs_icon_inactive_ek7);
		_bg__icon_veget_ek1 = (View) findViewById(R.id._bg__icon_veget_ek1);
		indicator = (View) findViewById(R.id.indicator);
		getdata_in_table = (Button) findViewById(R.id.getdata_in_table);
		reset_list_in_table = (Button) findViewById(R.id.reset_list_in_table);
		barcode_value_in_table_MaxPS = (TextView) findViewById(R.id.barcode_value_in_table_MaxPS);
		product_name_value_in_table_MaxPS = (TextView) findViewById(R.id.product_name_value_in_table_MaxPS);
		deadline_value_in_table_MaxPS = (TextView) findViewById(R.id.deadline_value_in_table_MaxPS);
		remain_time_value_in_table_MaxPS = (TextView) findViewById(R.id.remain_time_value_in_table_MaxPS);
		remain_food_value_in_table_MaxPS = (TextView) findViewById(R.id.remain_food_value_in_table_MaxPS);
		rectangle_110 = (ImageView) findViewById(R.id.rectangle_110);
		product_picture2_in_freezer = (TextView) findViewById(R.id.product_picture2_in_freezer);

		FoodDataBase foodDataBase = Room.databaseBuilder(getApplicationContext(), FoodDataBase.class, "table_Food_db")
				.fallbackToDestructiveMigration()
				.allowMainThreadQueries()
				.build();
		mfoodDao = foodDataBase.foodDao();
		Food food = new Food();


		_bg__tabs_icon_inactive_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent nextScreen = new Intent(getApplicationContext(), main_menu_activity.class);
				startActivity(nextScreen);
			}
		});

		_bg___tabs_icon_inactive_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent nextScreen = new Intent(getApplicationContext(), freezer_activity.class);
				startActivity(nextScreen);
			}
		});

		_bg___tabs_icon_inactive_ek5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent nextScreen = new Intent(getApplicationContext(), veget_activity.class);
				startActivity(nextScreen);
			}
		});

		_bg___tabs_icon_inactive_ek7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent nextScreen = new Intent(getApplicationContext(), cold_storage_activity.class);
				startActivity(nextScreen);
			}
		});

		vector.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent nextScreen = new Intent(table_activity.this, overlay_add_product_activity.class);
				getAllvalue.launch(nextScreen);
			}
		});

		getdata_in_table.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				AlertDialog.Builder builder = new AlertDialog.Builder(table_activity.this);

				builder.setTitle("안내");
				builder.setMessage("+버튼을 통해 제품을 등록한 이후 누르면 목록이 최신화되며, 앱 내부 데이터베이스에 값이 저장됩니다.");

				builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						food.setBarcode(tv_barcode_table.getText().toString());
						food.setName(tv_productName_table.getText().toString());
						food.setRemain_food(tv_Remain_food_table.getText().toString());
						food.setDeadline(tv_Deadline_table.getText().toString());
						food.setKcal(tv_Kcal_table.getText().toString());
						food.setSalt(tv_Salt_table.getText().toString());
						food.setSugar(tv_Sugar_table.getText().toString());
						food.setFat(tv_Fat_table.getText().toString());
						food.setTansuhwamul(tv_Tansuhwamul_table.getText().toString());
						food.setProtein(tv_Protein_table.getText().toString());

						mfoodDao.setInsertFood(food);

						try {
							if(convertStringToDate(food.getDeadline())>=7) {
								product_picture2_in_freezer.setVisibility(View.INVISIBLE);
								rectangle_110.setImageResource(R.drawable.beatles);
								barcode_value_in_table_MaxPS.setText(food.getBarcode());
								product_name_value_in_table_MaxPS.setText(food.getName());
								deadline_value_in_table_MaxPS.setText(food.getDeadline());
								try {
									remain_time_value_in_table_MaxPS.setText(String.valueOf(convertStringToDate(food.getDeadline())));
								} catch (ParseException e) {
									throw new RuntimeException(e);
								}
								remain_food_value_in_table_MaxPS.setText(food.getRemain_food());
							}
							else {
								product_picture_in_table.setVisibility(View.INVISIBLE);
								rectangle_11.setImageResource(R.drawable.beatles);
								barcode_value_in_table.setText(food.getBarcode());
								product_name_value_in_table.setText(food.getName());
								deadline_value_in_table.setText(food.getDeadline());
								try {
									remain_time_value_in_table.setText(String.valueOf(convertStringToDate(food.getDeadline())));
								} catch (ParseException e) {
									throw new RuntimeException(e);
								}
								remain_food_value_in_table.setText(food.getRemain_food());
							}
						} catch (ParseException e) {
							throw new RuntimeException(e);
						}
						dialog.dismiss();
					}
				});
				builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
				builder.show();

			}
		});


		reset_list_in_table.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				AlertDialog.Builder builder = new AlertDialog.Builder(table_activity.this);

				builder.setTitle("안내");
				builder.setMessage("위에 목록에 있는 값이 초기화 됩니다.");

				builder.setPositiveButton("1주 이하 제거", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {

						int idtocalc = mfoodDao.getidtocalc(deadline_value_in_table.getText().toString());
						String kcaltocalc = mfoodDao.getkcaltocalc(deadline_value_in_table.getText().toString());
						String sugartocalc = mfoodDao.getsugartocalc(deadline_value_in_table.getText().toString());
						String tansuhwamultocalc = mfoodDao.gettansuhwamultocalc(deadline_value_in_table.getText().toString());
						String proteintocalc = mfoodDao.getproteintocalc(deadline_value_in_table.getText().toString());
						String salttocalc = mfoodDao.getsalttocalc(deadline_value_in_table.getText().toString());
						String fattocalc = mfoodDao.getfattocalc(deadline_value_in_table.getText().toString());

						try{
							kcaltocalc_float_1week_before = Float.parseFloat(kcaltocalc);
							sugartocalc_float_1week_before = Float.parseFloat(sugartocalc);
							tansuhwamultocalc_float_1week_before = Float.parseFloat(tansuhwamultocalc);
							salttocalc_float_1week_before = Float.parseFloat(salttocalc);
							proteintocalc_float_1week_before = Float.parseFloat(proteintocalc);
							fattocalc_float_1week_before = Float.parseFloat(fattocalc);

						} catch (NumberFormatException e){

						}
						float remain_food = convertStringToFloat(remain_food_value_in_table.getText().toString());

						float after_kcal = kcaltocalc_float_1week_before * remain_food;
						float after_sugar = sugartocalc_float_1week_before * remain_food;
						float after_tansuhwamul = tansuhwamultocalc_float_1week_before * remain_food;
						float after_salt = salttocalc_float_1week_before * remain_food;
						float after_protein = proteintocalc_float_1week_before * remain_food;
						float after_fat = fattocalc_float_1week_before * remain_food;

						Intent intent = new Intent(table_activity.this, today_nutri_activity.class);

						intent.putExtra("after_kcal_1week_before", after_kcal);
						intent.putExtra("after_sugar_1week_before", after_sugar);
						intent.putExtra("after_tansuhwamul_1week_before", after_tansuhwamul);
						intent.putExtra("after_salt_1week_before", after_salt);
						intent.putExtra("after_protein_1week_before", after_protein);
						intent.putExtra("after_fat_1week_before", after_fat);

						barcode_value_in_table.setText("");
						product_name_value_in_table.setText("");
						deadline_value_in_table.setText("");
						remain_food_value_in_table.setText("");
						remain_time_value_in_table.setText("");
						rectangle_11.setImageDrawable(null);
						product_picture_in_table.setVisibility(View.VISIBLE);
						mfoodDao.deleteId(idtocalc);
						dialog.dismiss();
						startActivity(intent);
					}
				});

				builder.setNeutralButton("1주 이상 제거", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {

						int idtocalc = mfoodDao.getidtocalc(deadline_value_in_table_MaxPS.getText().toString());
						String kcaltocalc = mfoodDao.getkcaltocalc(deadline_value_in_table_MaxPS.getText().toString());
						String sugartocalc = mfoodDao.getsugartocalc(deadline_value_in_table_MaxPS.getText().toString());
						String tansuhwamultocalc = mfoodDao.gettansuhwamultocalc(deadline_value_in_table_MaxPS.getText().toString());
						String proteintocalc = mfoodDao.getproteintocalc(deadline_value_in_table_MaxPS.getText().toString());
						String salttocalc = mfoodDao.getsalttocalc(deadline_value_in_table_MaxPS.getText().toString());
						String fattocalc = mfoodDao.getfattocalc(deadline_value_in_table_MaxPS.getText().toString());

						try{
							kcaltocalc_float_1week_after = Float.parseFloat(kcaltocalc);
							sugartocalc_float_1week_after = Float.parseFloat(sugartocalc);
							tansuhwamultocalc_float_1week_after = Float.parseFloat(tansuhwamultocalc);
							salttocalc_float_1week_after = Float.parseFloat(salttocalc);
							proteintocalc_float_1week_after = Float.parseFloat(proteintocalc);
							fattocalc_float_1week_after = Float.parseFloat(fattocalc);

						} catch (NumberFormatException e){

						}
						float remain_food = convertStringToFloat(remain_food_value_in_table_MaxPS.getText().toString());

						float after_kcal = kcaltocalc_float_1week_after * remain_food;
						float after_sugar = sugartocalc_float_1week_after * remain_food;
						float after_tansuhwamul = tansuhwamultocalc_float_1week_after * remain_food;
						float after_salt = salttocalc_float_1week_after * remain_food;
						float after_protein = proteintocalc_float_1week_after * remain_food;
						float after_fat = fattocalc_float_1week_after * remain_food;

						Intent intent = new Intent(table_activity.this, today_nutri_activity.class);

						intent.putExtra("after_kcal_1week_after", after_kcal);
						intent.putExtra("after_sugar_1week_after", after_sugar);
						intent.putExtra("after_tansuhwamul_1week_after", after_tansuhwamul);
						intent.putExtra("after_salt_1week_after", after_salt);
						intent.putExtra("after_protein_1week_after", after_protein);
						intent.putExtra("after_fat_1week_after", after_fat);

						barcode_value_in_table_MaxPS.setText("");
						product_name_value_in_table_MaxPS.setText("");
						deadline_value_in_table_MaxPS.setText("");
						remain_food_value_in_table_MaxPS.setText("");
						remain_time_value_in_table_MaxPS.setText("");
						rectangle_110.setImageDrawable(null);
						product_picture2_in_freezer.setVisibility(View.VISIBLE);
						mfoodDao.deleteId(idtocalc);
						dialog.dismiss();
						startActivity(intent);
					}
				});

				builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
				builder.show();
			}
		});


	}
	private final ActivityResultLauncher<Intent> getAllvalue = registerForActivityResult(
			new ActivityResultContracts.StartActivityForResult(),
			result -> {
				if(result.getResultCode()==RESULT_OK){

					tv_barcode_table.setText(result.getData().getStringExtra("barcodevalue"));
					tv_productName_table.setText(result.getData().getStringExtra("namevalue"));
					tv_Remain_food_table.setText(result.getData().getStringExtra("remainvalue"));
					tv_Deadline_table.setText(result.getData().getStringExtra("deadlinevalue"));
					tv_Kcal_table.setText(result.getData().getStringExtra("kcalvalue"));
					tv_Sugar_table.setText(result.getData().getStringExtra("sugarvalue"));
					tv_Salt_table.setText(result.getData().getStringExtra("saltvalue"));
					tv_Tansuhwamul_table.setText(result.getData().getStringExtra("tansuhwamulvalue"));
					tv_Fat_table.setText(result.getData().getStringExtra("fatvalue"));
					tv_Protein_table.setText(result.getData().getStringExtra("proteinvalue"));

				}
			}
	);
	public static long convertStringToDate(String dateString) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA);
		Date date;

		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);

		// 날짜 문자열에 연도 정보 추가
		dateString = currentYear + "년 " + dateString;

		// 날짜 파싱
		date = dateFormat.parse(dateString);

		// 날짜 차이 계산
		Date today = new Date();
		long timeDifference = date.getTime() - today.getTime();
		long daysDifference = timeDifference / (1000 * 60 * 60 * 24);

		return daysDifference+1;

	}
	public static float convertStringToFloat(String value) {
		if (value.equals("1")) {
			return 1.0f;
		} else if (value.equals("1/4")) {
			return 0.25f;
		} else if (value.equals("2/4") || value.equals("1/2")) {
			return 0.5f;
		} else if (value.equals("3/4")) {
			return 0.75f;
		} else {
			try {
				return Float.parseFloat(value);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		return 1.0f;
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		String barcode_value_save = barcode_value_in_table.getText().toString();
		String product_name_value_save = product_name_in_table.getText().toString();
		String deadline_value_save = deadline_in_table.getText().toString();
		String remain_time_value_save = remain_time_in_table.getText().toString();
		String remain_food_value_save = remain_food_in_table.getText().toString();
		String barcode_after_value_save = barcode_value_in_table_MaxPS.getText().toString();
		String product_name_after_value_save = product_name_value_in_table_MaxPS.getText().toString();
		String deadline_after_value_save = deadline_value_in_table_MaxPS.getText().toString();
		String remain_time_after_value_save = remain_time_value_in_table_MaxPS.getText().toString();
		String remain_food_after_value_save = remain_food_value_in_table_MaxPS.getText().toString();

		outState.putString("barcode_value_save", barcode_value_save);
		outState.putString("product_name_value_save", product_name_value_save);
		outState.putString("deadline_value_save", deadline_value_save);
		outState.putString("remain_time_value_save", remain_time_value_save);
		outState.putString("remain_food_value_save", remain_food_value_save);
		outState.putString("barcode_after_value_save", barcode_after_value_save);
		outState.putString("product_name_after_value_save", product_name_after_value_save);
		outState.putString("deadline_after_value_save", deadline_after_value_save);
		outState.putString("remain_time_after_value_save", remain_time_after_value_save);
		outState.putString("remain_food_after_value_save", remain_food_after_value_save);
	}
}
	
	