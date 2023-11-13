package org.techtown.a1023_food_guard;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import static com.google.firebase.messaging.Constants.MessageNotificationKeys.TAG;


public class main_menu_activity extends AppCompatActivity {

	private View _bg__main_menu;
	private View rectangle_19;
	private TextView main;
	private View rectangle_8;
	private View _rectangle_21;
	private View _rectangle_23;
	private View _rectangle_24;
	private View _rectangle_22;
	private View _rectangle_20;
	private TextView category;
	private TextView today_nutri;
	private View _bg__ic_menu_ek1;
	private ImageView icon;
	private TextView freezer;
	private TextView veget;
	private TextView table;
	private TextView cold_storage;
	private ImageView veget_picture;
	private ImageView cold_storage_picture;
	private ImageView freezer_picture;
	private ImageView table_picture;
	private ImageView nutri_picture;
	private View _bg__tabs_icon_5_tabs_ek1;
	private ImageView tab_bg;
	private View _bg__tabs_icon_active_ek1;
	private View indicator;
	private View _bg__icons_actions_home_ek1;
	private ImageView home;
	private View _bg___tabs_icon_inactive_ek1;
	private View _bg__icon_freezer_ek1;
	private ImageView cold_storage_icon;
	private ImageView freezer_icon;
	private ImageView veget_icon;
	private ImageView table_icon;
	private View _bg___tabs_icon_inactive_ek3;
	private View _bg__icon_cold_storage_ek1;
	private View _bg___tabs_icon_inactive_ek5;
	private View _bg__icon_veget_ek1;
	private View ellipse_1;
	private View _bg___tabs_icon_inactive_ek7;
	private View _bg__icon_table_ek1;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		Context context = this;


		_bg__main_menu = (View) findViewById(R.id._bg__main_menu);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		main = (TextView) findViewById(R.id.main);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		_rectangle_21 = (View) findViewById(R.id._rectangle_21);
		_rectangle_23 = (View) findViewById(R.id._rectangle_23);
		_rectangle_24 = (View) findViewById(R.id._rectangle_24);
		_rectangle_22 = (View) findViewById(R.id._rectangle_22);
		_rectangle_20 = (View) findViewById(R.id._rectangle_20);
		category = (TextView) findViewById(R.id.category);
		today_nutri = (TextView) findViewById(R.id.today_nutri);
		freezer = (TextView) findViewById(R.id.freezer);
		veget = (TextView) findViewById(R.id.veget);
		table = (TextView) findViewById(R.id.table);
		cold_storage = (TextView) findViewById(R.id.cold_storage);
		veget_picture = (ImageView) findViewById(R.id.veget_picture);
		cold_storage_picture = (ImageView) findViewById(R.id.cold_storage_picture);
		freezer_picture = (ImageView) findViewById(R.id.freezer_picture);
		table_picture = (ImageView) findViewById(R.id.table_picture);
		nutri_picture = (ImageView) findViewById(R.id.nutri_picture);
		_bg__tabs_icon_5_tabs_ek1 = (View) findViewById(R.id._bg__tabs_icon_5_tabs_ek1);
		tab_bg = (ImageView) findViewById(R.id.tab_bg);
		_bg__tabs_icon_active_ek1 = (View) findViewById(R.id._bg__tabs_icon_active_ek1);
		indicator = (View) findViewById(R.id.indicator);
		_bg__icons_actions_home_ek1 = (View) findViewById(R.id._bg__icons_actions_home_ek1);
		home = (ImageView) findViewById(R.id.home);
		_bg___tabs_icon_inactive_ek1 = (View) findViewById(R.id._bg___tabs_icon_inactive_ek1);
		_bg__icon_freezer_ek1 = (View) findViewById(R.id._bg__icon_freezer_ek1);
		freezer_icon = (ImageView) findViewById(R.id.freezer_icon);
		_bg___tabs_icon_inactive_ek3 = (View) findViewById(R.id._bg___tabs_icon_inactive_ek3);
		_bg__icon_cold_storage_ek1 = (View) findViewById(R.id._bg__icon_cold_storage_ek1);
		cold_storage_icon = (ImageView) findViewById(R.id.cold_storage_icon);
		_bg___tabs_icon_inactive_ek5 = (View) findViewById(R.id._bg___tabs_icon_inactive_ek5);
		_bg__icon_veget_ek1 = (View) findViewById(R.id._bg__icon_veget_ek1);
		veget_icon = (ImageView) findViewById(R.id.veget_icon);
		_bg___tabs_icon_inactive_ek7 = (View) findViewById(R.id._bg___tabs_icon_inactive_ek7);
		_bg__icon_table_ek1 = (View) findViewById(R.id._bg__icon_table_ek1);
		table_icon = (ImageView) findViewById(R.id.table_icon);



		_rectangle_23.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), cold_storage_activity.class);
				startActivity(nextScreen);


			}
		});

		_rectangle_21.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), freezer_activity.class);
				startActivity(nextScreen);


			}
		});

		_rectangle_24.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), table_activity.class);
				startActivity(nextScreen);


			}
		});


		_rectangle_22.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), veget_activity.class);
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

		_bg___tabs_icon_inactive_ek3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent nextScreen = new Intent(getApplicationContext(), cold_storage_activity.class);
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
				Intent nextScreen = new Intent(getApplicationContext(), table_activity.class);
				startActivity(nextScreen);
			}
		});

		_rectangle_20.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View view) {
				
				Intent nextScreen = new Intent(getApplicationContext(), today_nutri_activity.class);
				startActivity(nextScreen);
			}
		});

		// 파이어베이스와 연결하기 위해 토큰값을 받는다.
		FirebaseMessaging.getInstance().getToken()
				.addOnCompleteListener(new OnCompleteListener<String>() {
					@Override
					public void onComplete(@NonNull Task<String> task) {
						if (!task.isSuccessful()) {
							Log.w(TAG, "Fetching FCM registration token failed", task.getException());
							return;
						}

						// Get new FCM registration token
						String token = task.getResult();

						// Log and toast
						String msg = getString(R.string.msg_token_fmt, token);
						Log.d(TAG, msg);
					}

				});

	}
}
	
	