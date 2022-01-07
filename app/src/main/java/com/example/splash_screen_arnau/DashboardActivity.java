package com.example.splash_screen_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    private TextView new_user;
    private TextView text_forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        new_user = findViewById(R.id.new_user);
        text_forgot = findViewById(R.id.text_forgot);

        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        text_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ForgotpasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}