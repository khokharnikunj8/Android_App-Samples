package com.practice.screenrotation;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String TAG="VALUE";
    private EditText editText;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        editText=(EditText)findViewById(R.id.editText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(TAG,editText.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
//        Log.i("main",savedInstanceState.getString(TAG));
        editText.setText(savedInstanceState.getString(TAG));
        editText.setSelection(editText.getText().length());
    }
}
