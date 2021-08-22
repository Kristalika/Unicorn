package com.example.unicorn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        Button button1 = (Button) findViewById(R.id.button_1);
        Button button2 = (Button) findViewById(R.id.button_2);
        EditText roll = (EditText) findViewById((R.id.edit_text));
        Button button3 = (Button) findViewById(R.id.button_3);
        TextView rain = (TextView) findViewById(R.id.text_view);

        button1.setOnClickListener(_button1 -> {
            int color1 = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            button2.setBackgroundColor(color1);
            rain.setTextColor(color1);
        });
        button2.setOnClickListener(_button2 -> {
            int color2 = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            button1.setBackgroundColor(color2);
            rain.setTextColor(color2);
        });
        button3.setOnClickListener(view -> {
            rain.setText(roll.getText().toString());
        });
    }
}