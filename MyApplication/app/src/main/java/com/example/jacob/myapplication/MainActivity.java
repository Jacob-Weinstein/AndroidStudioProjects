package com.example.jacob.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "testMessage";
    public static final String EXTRA_MESSAGE = "hello world";
    public static final String EXTRA_COLOR = "COLOR";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        Switch sswitch = (Switch) findViewById(R.id.switch1);
        String message = editText.getText().toString();
        if (sswitch.isChecked()){
            intent.putExtra(EXTRA_COLOR,"Color.BLUE");
        }else{
            intent.putExtra(EXTRA_COLOR,"Color.GREEN");
        }
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
