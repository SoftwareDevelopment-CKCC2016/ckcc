package com.vanna.myckccapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String word = getIntent().getExtras().getString("word");
        int buttonId = getIntent().getExtras().getInt("button");

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(word);
    }
}
