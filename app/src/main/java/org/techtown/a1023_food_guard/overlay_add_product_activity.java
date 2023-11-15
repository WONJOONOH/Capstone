package org.techtown.a1023_food_guard;

import static java.security.AccessController.getContext;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;



import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


import java.io.UnsupportedEncodingException;
import java.util.Calendar;


import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;


public class overlay_add_product_activity extends AppCompatActivity {

	
	private View _bg__overlay_add_product;
	private ImageView line_1;
	private ImageView line_2;
	private TextView ________;
	private View _bg__icons_content_save_ek1;
	private ImageView save;
	private View _bg__icons_actions_delete_ek1;
	private ImageView delete;
	private TextView ____;
	private View rectangle_43;
	private TextView tvResult;
	private Button btnScan;
	private View rectangle_44;
	private View rectangle_45;
	private TextView _______;
	private TextView ________ek1;
	private View _bg__text_fields_single_line_focus_label___input_ek1;
	private ImageView bottom_line;
	private TextView input;
	private View _bg__text_fields_single_line_focus_label___input_ek3;
	private ImageView bottom_line_ek1;
	private TextView input_ek1;
	private TextView label;
	private View _bg__text_fields_single_line_focus_label___input_ek5;
	private ImageView bottom_line_ek2;
	private TextView input_ek2;
	private TextView label_ek1;
	private View _bg__text_fields_multi_line_focus_label___input_ek1;
	private View field_border;
	private TextView input_ek3;
	private TextView label_ek2;
	private TextView _________ek1;
	private TextView ___________;
	private TextView _____;
	private View _bg__expansion_panels_collapsed_ek1;
	private View expansion_bg;
	private View _bg__icons_navigation_expand_more_ek1;
	private ImageView expand_more;
	private View _bg__expansion_panels_collapsed_ek3;
	private View expansion_bg_ek1;
	private View _bg__icons_navigation_expand_more_ek3;
	private ImageView expand_more_ek1;
	private View _bg__expansion_panels_collapsed_ek5;
	private View expansion_bg_ek2;
	private View _bg__icons_navigation_expand_more_ek5;
	private ImageView expand_more_ek2;
	private TextView ____________ek1;
	private TextView ________ek2;
	private View _bg__ic_arrow_drop_down_ek1;
	private ImageView icon;
	private View _bg__ic_arrow_drop_down_ek3;
	private ImageView icon_ek1;
	private View _bg__icons_av_playlist_add_ek1;
	private ImageView playlist_add;
	private TextView ______;
	private View _bg__selection_controls_ek1;
	private ImageView track;
	private ImageView thumb;
	private TextView image_path;
	private View _bg__selection_controls_ek3;
	private ImageView track_ek1;
	private ImageView thumb_ek1;
	private TextView __________;
	private Button button;
	private Spinner spinner_remain_food;
	private TextView remain_food_text;
	private Spinner spinner_before_time;
	private TextView before_time_text;
	private Spinner spinner_alarm_time;
	private TextView alarm_time_text;
	private Button select_date_1;
	private Button select_date_2;
	private int year1, year2, month1, month2, day1, day2;
	private DatePicker vDatePicker;
	private Button vDateEnter;
	private FoodDao mfoodDao;
	private String kcalValue, sugarValue, tansuhwamulValue, saltValue, proteinValue, fatValue, barcodeValue;
	private TextView tv_kcal, tv_sugar, tv_tansuhwamul, tv_salt, tv_protein, tv_fat;
	private String barcode = "8801117332808";


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.overlay_add_product);

		tv_fat = (TextView) findViewById(R.id.tv_fat);
		tv_kcal = (TextView) findViewById(R.id.tv_kcal);
		tv_protein = (TextView) findViewById(R.id.tv_protein);
		tv_salt = (TextView) findViewById(R.id.tv_salt);
		tv_sugar = (TextView) findViewById(R.id.tv_sugar);
		tv_tansuhwamul = (TextView) findViewById(R.id.tv_tansuhwamul);
		line_1 = (ImageView) findViewById(R.id.line_1);
		line_2 = (ImageView) findViewById(R.id.line_2);
		________ = (TextView) findViewById(R.id.________);
		save = (ImageView) findViewById(R.id.save);
		delete = (ImageView) findViewById(R.id.delete);
		____ = (TextView) findViewById(R.id.____);
		rectangle_43 = (View) findViewById(R.id.rectangle_43);
		tvResult = findViewById(R.id.tvResult);
		rectangle_44 = (View) findViewById(R.id.rectangle_44);
		rectangle_45 = (View) findViewById(R.id.rectangle_45);
		_______ = (TextView) findViewById(R.id._______);
		________ek1 = (TextView) findViewById(R.id.________ek1);
		input = (TextView) findViewById(R.id.input);
		bottom_line_ek1 = (ImageView) findViewById(R.id.bottom_line_ek1);
		input_ek1 = (TextView) findViewById(R.id.input_ek1);
		label = (TextView) findViewById(R.id.label);
		bottom_line_ek2 = (ImageView) findViewById(R.id.bottom_line_ek2);
		input_ek2 = (TextView) findViewById(R.id.input_ek2);
		label_ek1 = (TextView) findViewById(R.id.label_ek1);
		field_border = (View) findViewById(R.id.field_border);
		input_ek3 = (TextView) findViewById(R.id.input_ek3);
		label_ek2 = (TextView) findViewById(R.id.label_ek2);
		_________ek1 = (TextView) findViewById(R.id._________ek1);
		___________ = (TextView) findViewById(R.id.___________);
		_____ = (TextView) findViewById(R.id._____);
		____________ek1 = (TextView) findViewById(R.id.____________ek1);
		________ek2 = (TextView) findViewById(R.id.________ek2);
		playlist_add = (ImageView) findViewById(R.id.playlist_add);
		______ = (TextView) findViewById(R.id.______);
		track = (ImageView) findViewById(R.id.track);
		thumb = (ImageView) findViewById(R.id.thumb);
		track_ek1 = (ImageView) findViewById(R.id.track_ek1);
		thumb_ek1 = (ImageView) findViewById(R.id.thumb_ek1);
		__________ = (TextView) findViewById(R.id.__________);
		Spinner remain_food_Spinner = (Spinner) findViewById(R.id.spinner_remain_food);
		remain_food_text = (TextView) findViewById(R.id.remain_food_text);
		Spinner before_time_Spinner = (Spinner) findViewById(R.id.spinner_before_time);
		before_time_text = (TextView) findViewById(R.id.before_time_text);
		Spinner alarm_time_Spinner = (Spinner) findViewById(R.id.spinner_alarm_time);
		alarm_time_text = (TextView) findViewById(R.id.alarm_time_text);
		select_date_1 = (Button) findViewById(R.id.select_date_1);
		select_date_2 = (Button) findViewById(R.id.select_date_2);
		image_path = (TextView) findViewById(R.id.image_path);


		save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				String product_name = input.getText().toString();
				String remain_food = remain_food_text.getText().toString();
				String deadline = input_ek2.getText().toString();
				String Image_path = image_path.getText().toString();

				Intent intent = new Intent();

				intent.putExtra("imagepath", Image_path);
				intent.putExtra("barcodevalue", barcodeValue);
				intent.putExtra("namevalue", product_name);
				intent.putExtra("remainvalue", remain_food);
				intent.putExtra("deadlinevalue", deadline);
				intent.putExtra("kcalvalue", kcalValue);
				intent.putExtra("sugarvalue", sugarValue);
				intent.putExtra("saltvalue", saltValue);
				intent.putExtra("fatvalue", fatValue);
				intent.putExtra("tansuhwamulvalue", tansuhwamulValue);
				intent.putExtra("proteinvalue", proteinValue);

				setResult(RESULT_OK, intent);

				finish();
			}
		});

		remain_food_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
				remain_food_text.setText("" + adapterView.getItemAtPosition(i));
			}

			@Override
			public void onNothingSelected(AdapterView<?> adapterView) {

			}
		});
		before_time_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
				before_time_text.setText("" + adapterView.getItemAtPosition(i));
			}

			@Override
			public void onNothingSelected(AdapterView<?> adapterView) {

			}
		});
		alarm_time_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
				alarm_time_text.setText("" + adapterView.getItemAtPosition(i));
			}

			@Override
			public void onNothingSelected(AdapterView<?> adapterView) {

			}
		});

		rectangle_44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent nextScreen = new Intent(overlay_add_product_activity.this, overlay_add_product_search_name_activity.class);
				getSearchNameValue.launch(nextScreen);
			}
		});

		rectangle_45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent nextScreen = new Intent(overlay_add_product_activity.this, overlay_add_product_insert_nutri_activity.class);
				getNutrivalue.launch(nextScreen);
			}
		});

		delete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

		select_date_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Calendar today = Calendar.getInstance();
				int year = today.get(Calendar.YEAR);
				int month = today.get(Calendar.MONTH);
				int date = today.get(Calendar.DATE);

				DatePickerDialog dlg = new DatePickerDialog(overlay_add_product_activity.this, new DatePickerDialog.OnDateSetListener() {
					@Override
					public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
						input_ek1.setText((month + 1) + "월 " + dayOfMonth + "일");
					}
				}, year, month, date);
				dlg.show();
			}
		});

		select_date_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Calendar today = Calendar.getInstance();
				int year = today.get(Calendar.YEAR);
				int month = today.get(Calendar.MONTH);
				int date = today.get(Calendar.DATE);

				DatePickerDialog dlg = new DatePickerDialog(overlay_add_product_activity.this, new DatePickerDialog.OnDateSetListener() {
					@Override
					public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
						input_ek2.setText((month + 1) + "월 " + dayOfMonth + "일");
					}
				}, year, month, date);
				dlg.show();
			}
		});
		rectangle_43.setOnClickListener(v -> initiateScan());
	}
	private void initiateScan () { // 코드 스캔을 시작 하기 위한 메소드
		IntentIntegrator integrator = new IntentIntegrator(this);
		integrator.setPrompt("Scan a barcode or QR code"); //스캔 중 화면에 표시될 메시지
		integrator.setOrientationLocked(true); //화면 방향 고정 설정
		integrator.setCaptureActivity(CaptureActivityPortrait.class); //세로 방향 고정을 위한 사용자 정의 CaptureActivity 설정
		integrator.initiateScan(); //스캔 시작
	}
	@Override
	protected void onActivityResult ( int requestCode, int resultCode, Intent data) {
		IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
		if (result != null) {
			if (result.getContents() == null) {
				tvResult.setText(R.string.cancelled_text); // 스캔이 취소 되었을 경우
			} else {
				tvResult.setText(result.getContents()); // 스캔 결과 출력(바코드 값)
				barcodeValue = tvResult.getText().toString();
				// 만약 바코드가 비틀즈가 아니면 출력 오류 나오게 하기
				if(barcodeValue.equals(barcode)) {
					input.setText("비틀즈");
					tv_kcal.setText("162");
					tv_sugar.setText("25");
					tv_salt.setText("0");
					tv_tansuhwamul.setText("34");
					tv_fat.setText("2.9");
					tv_protein.setText("0");

					kcalValue = tv_kcal.getText().toString();
					sugarValue = tv_sugar.getText().toString();
					tansuhwamulValue = tv_tansuhwamul.getText().toString();
					saltValue = tv_salt.getText().toString();
					proteinValue = tv_protein.getText().toString();
					fatValue = tv_fat.getText().toString();
					Toast.makeText(this, "바코드를 통해 제품명과 사진, 영양정보를 가져왔습니다.", Toast.LENGTH_SHORT).show();
				}
				else{
					input_ek3.setText(barcodeValue);
					input.setText("네트워크 오류 : 직접 입력기능을 사용해주세요");
				}
			}
		} else {
			super.onActivityResult(requestCode, resultCode, data);
		}
	}

	private final ActivityResultLauncher<Intent> getNutrivalue = registerForActivityResult(
			new ActivityResultContracts.StartActivityForResult(),
			result -> {
				if(result.getResultCode()==RESULT_OK){
					tv_kcal.setText(result.getData().getStringExtra("kcalvalue"));
					tv_sugar.setText(result.getData().getStringExtra("sugarvalue"));
					tv_salt.setText(result.getData().getStringExtra("saltvalue"));
					tv_tansuhwamul.setText(result.getData().getStringExtra("tansuhwamulvalue"));
					tv_fat.setText(result.getData().getStringExtra("fatvalue"));
					tv_protein.setText(result.getData().getStringExtra("proteinvalue"));

					kcalValue = tv_kcal.getText().toString();
					sugarValue = tv_sugar.getText().toString();
					tansuhwamulValue = tv_tansuhwamul.getText().toString();
					saltValue = tv_salt.getText().toString();
					proteinValue = tv_protein.getText().toString();
					fatValue = tv_fat.getText().toString();
				}
			}
	);

	private final ActivityResultLauncher<Intent> getSearchNameValue = registerForActivityResult(
			new ActivityResultContracts.StartActivityForResult(),
			result -> {
				if(result.getResultCode()==RESULT_OK){
					image_path.setText(result.getData().getStringExtra("productpicture"));
					input.setText(result.getData().getStringExtra("productname"));
					tv_kcal.setText(result.getData().getStringExtra("kcalvalue"));
					tv_sugar.setText(result.getData().getStringExtra("sugarvalue"));
					tv_salt.setText(result.getData().getStringExtra("saltvalue"));
					tv_tansuhwamul.setText(result.getData().getStringExtra("tansuhwamulvalue"));
					tv_fat.setText(result.getData().getStringExtra("fatvalue"));
					tv_protein.setText(result.getData().getStringExtra("proteinvalue"));

					kcalValue = tv_kcal.getText().toString();
					sugarValue = tv_sugar.getText().toString();
					tansuhwamulValue = tv_tansuhwamul.getText().toString();
					saltValue = tv_salt.getText().toString();
					proteinValue = tv_protein.getText().toString();
					fatValue = tv_fat.getText().toString();
					Toast.makeText(this, "제품명을 통해 사진과 영양정보를 가져왔습니다.", Toast.LENGTH_SHORT).show();
				}
			}
	);

}
	
	