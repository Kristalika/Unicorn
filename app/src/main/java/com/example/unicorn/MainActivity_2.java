package com.example.unicorn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton load =  findViewById(R.id.button_load);
        EditText input = findViewById(R.id.link);
        ImageView preview = findViewById(R.id.preview);


        load.setOnClickListener(view -> {
            String link = input.getText().toString();

            Glide.with(this).load(link).into(preview);

        });
    }
}