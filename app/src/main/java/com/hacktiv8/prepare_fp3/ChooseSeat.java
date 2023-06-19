package com.hacktiv8.prepare_fp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ChooseSeat extends AppCompatActivity {
    Button btn_book_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_seat);

        btn_book_now = findViewById(R.id.btn_book_now2);
        btn_book_now.setOnClickListener(v -> {
            final Intent intent;
            intent = new Intent(ChooseSeat.this, OrderActivity.class);
            startActivity(intent);
        });
    }
}