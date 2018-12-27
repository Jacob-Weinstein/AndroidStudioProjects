package com.example.jacob.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        final TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        String ccolor = intent.getStringExtra(MainActivity.EXTRA_COLOR);
        if (ccolor.equals("Color.BLUE")){
            textView.setTextColor(Color.BLUE);
        }else{
            textView.setTextColor(Color.GREEN);
        }
    }
}
