package com.example.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("extraText")){
            TextView tv = (TextView) findViewById(R.id.secondActivityTextView);
            String text = getIntent().getExtras().getString("extraText");
            tv.setText(text);
        }
    }
}
