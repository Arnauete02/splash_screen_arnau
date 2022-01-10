package com.example.splash_screen_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Calendar;

public class SignupActivity extends AppCompatActivity {

    private DatePickerDialog pickerDialog;
    private EditText birthdate;

    private Spinner bikeSpinnerClass;
    private ArrayList<BikeSpinner> mBikeSpinner;
    private SpinnerAdapter mAdapter;

    private TextView already;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        birthdate = findViewById(R.id.birthdate);
        bikeSpinnerClass = findViewById(R.id.spinner);
        already = findViewById(R.id.already);

        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        birthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                pickerDialog = new DatePickerDialog(SignupActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                birthdate.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                pickerDialog.show();
            }
        });

        mBikeSpinner = new ArrayList<>();
        mBikeSpinner.add(new BikeSpinner("Bike01", R.drawable.bike01));
        mBikeSpinner.add(new BikeSpinner("Bike02", R.drawable.bike02));
        mBikeSpinner.add(new BikeSpinner("Bike03", R.drawable.bike03));
        mBikeSpinner.add(new BikeSpinner("Bike04", R.drawable.bike04));
        mBikeSpinner.add(new BikeSpinner("Bike06", R.drawable.bike06));
        mBikeSpinner.add(new BikeSpinner("Bike08", R.drawable.bike08));

        mAdapter = new SpinnerAdapter(this, mBikeSpinner);
        bikeSpinnerClass.setAdapter(mAdapter);

        bikeSpinnerClass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                BikeSpinner selectedItem = (BikeSpinner) parent.getItemAtPosition(position);
                String selectedBikeName = selectedItem.getBikeName();
                Toast.makeText(SignupActivity.this, selectedBikeName, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(SignupActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}