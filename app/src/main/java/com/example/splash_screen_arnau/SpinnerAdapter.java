package com.example.splash_screen_arnau;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SpinnerAdapter extends ArrayAdapter<BikeSpinner> {
    public SpinnerAdapter(@NonNull Context context, ArrayList<BikeSpinner> bikeSpinnerArrayList){
        super(context,0, bikeSpinnerArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        return initView(position, convertView, parent);
    }

    public View initView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.spinner_layout,
                    parent,
                    false
            );
            ImageView imageView = convertView.findViewById(R.id.imageView);
            TextView textView = convertView.findViewById(R.id.textView);
            BikeSpinner currentItem = getItem(position);
            if (currentItem != null){
                imageView.setImageResource(currentItem.getBikeImg());
                textView.setText(currentItem.getBikeName());
            }
        }
        return convertView;
    }
}
