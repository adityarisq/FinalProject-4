package com.hacktiv8.prepare_fp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class Passengers extends AppCompatActivity {
    TextView jumlahPnp;
    Slider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passengers);

//        jumlahPnp = findViewById(R.id.value);
//        slider = findViewById(R.id.slider);
//
//        slider.addOnChangeListener(new Slider.OnChangeListener() {
//            @Override
//            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
//                int valueInt = (int) value;
//                jumlahPnp.setText(Integer.toString(valueInt));
//            }
//        });
    }
}