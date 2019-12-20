package com.example.vibrater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnshort,btnlong;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlong=findViewById(R.id.btn_long);
        btnshort=findViewById(R.id.btn_short);
        vibrator= (Vibrator) getSystemService(VIBRATOR_SERVICE);

        btnshort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(50);

            }
        });


        btnlong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(5000);
            }
        });
    }
}
