package com.example.splash_screen_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_SCREEN = 2000;
    private ImageView bike_logo;
    private TextView text_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bike_logo = findViewById(R.id.bike_logo);
        text_title = findViewById(R.id.text_title);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(bike_logo,"bike_logo");
                pairs[1] = new Pair<View, String>(text_title,"text_title");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        pairs);
                startActivity(intent, options.toBundle());
            }
        };

        Handler h = new Handler(Looper.getMainLooper());
        h.postDelayed(r, SPLASH_SCREEN);
    }
}