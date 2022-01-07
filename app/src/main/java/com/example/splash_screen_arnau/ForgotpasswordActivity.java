package com.example.splash_screen_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ForgotpasswordActivity extends AppCompatActivity {

    private TextView new_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        new_user = findViewById(R.id.new_user);

        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotpasswordActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}