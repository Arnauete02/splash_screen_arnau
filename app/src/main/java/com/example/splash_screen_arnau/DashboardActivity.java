package com.example.splash_screen_arnau;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    private TextView new_user;
    private TextView text_forgot;
    private ConstraintLayout dash_layout;

    private ObjectAnimator objectAnimator1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        new_user = findViewById(R.id.new_user);
        text_forgot = findViewById(R.id.text_forgot);
        dash_layout = findViewById(R.id.dash_layout);

        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*objectAnimator1 = ObjectAnimator.ofFloat(new_user, "pivotY", 0f, 1f);
                objectAnimator1.start();*/
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