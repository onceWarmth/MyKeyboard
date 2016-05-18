package com.example.clover.mykeyboard;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private Context context;
    private Activity activity;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        context = this;

        editText = (EditText) findViewById(R.id.my_editText);
        editText.setInputType(InputType.TYPE_NULL);

        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                new KeyboardUtil(activity , context, editText).showKeyboard();
                return false;
            }
        });
    }
}
