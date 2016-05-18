package com.example.clover.mykeyboard;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;
import android.widget.EditText;

/**
 * Created by clover on 2016/5/16.
 */
public class KeyboardUtil {
    private Context ctx;
    private Activity act;
    private KeyboardView keyboardView;
    private Keyboard k1;// 字母键盘

    private EditText ed;

    public KeyboardUtil(Activity act, Context ctx, EditText edit) {
        this.act = act;
        this.ctx = ctx;
        this.ed = edit;
        k1 = new Keyboard(ctx, R.xml.qwert);
        keyboardView = (KeyboardView) act.findViewById(R.id.my_keyboard);
        keyboardView.setKeyboard(k1);
        keyboardView.setEnabled(true);
        keyboardView.setPreviewEnabled(true);
        keyboardView.setOnKeyboardActionListener(listener);
    }

    private KeyboardView.OnKeyboardActionListener listener = new KeyboardView.OnKeyboardActionListener() {
        @Override
        public void onPress(int primaryCode) {

        }

        @Override
        public void onRelease(int primaryCode) {

        }

        @Override
        public void onKey(int primaryCode, int[] keyCodes) {

        }

        @Override
        public void onText(CharSequence text) {

        }

        @Override
        public void swipeLeft() {

        }

        @Override
        public void swipeRight() {

        }

        @Override
        public void swipeDown() {

        }

        @Override
        public void swipeUp() {

        }
    };

    public void showKeyboard() {
        int visibility = keyboardView.getVisibility();
        if (visibility == View.GONE || visibility == View.INVISIBLE) {
            keyboardView.setVisibility(View.VISIBLE);
        }
    }

    public void hideKeyboard() {
        int visibility = keyboardView.getVisibility();
        if (visibility == View.VISIBLE) {
            keyboardView.setVisibility(View.INVISIBLE);
        }
    }

    private boolean isword(String str){
        String wordstr = "abcdefghijklmnopqrstuvwxyz";
        if (wordstr.indexOf(str.toLowerCase())>-1) {
            return true;
        }
        return false;
    }
}
