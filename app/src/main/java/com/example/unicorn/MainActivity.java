package com.example.unicorn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button_01);

        Button button2 = (Button) findViewById(R.id.button_02);
        Button button3 = (Button) findViewById(R.id.button_03);
        Button button4 = (Button) findViewById(R.id.button_04);
        Button button5 = (Button) findViewById(R.id.button_05);
        Button button6 = (Button) findViewById(R.id.button_06);
        Button button7 = (Button) findViewById(R.id.button_07);
        Button button8 = (Button) findViewById(R.id.button_08);
        Button button9 = (Button) findViewById(R.id.button_09);
        Button button10 = (Button) findViewById(R.id.button_10);


        button1.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_1.class));
        });
        button2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_2.class));
        });
        button3.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_3.class));
        });
        button4.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_4.class));
        });
        button5.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_5.class));
        });
        button6.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_6.class));
        });
        button7.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_7.class));
        });
        button8.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_8.class));
        });
        button9.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_9.class));
        });
        button10.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity_10.class));
        });
    }
}
