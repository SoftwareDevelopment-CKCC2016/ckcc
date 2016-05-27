package com.vanna.myckccapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View newButton =  findViewById(R.id.new_button);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // what happen when user click newButton
//                TextView textView = (TextView) findViewById(R.id.textView2);
//                textView.setText("Hi");

                Intent main2Intent = new Intent(getApplicationContext(), Main2Activity.class);
                Bundle extra = new Bundle();
                main2Intent.putExtras(extra);
                main2Intent.getExtras().putInt("button", 1);
                main2Intent.getExtras().putString("word", "student");
                startActivity(main2Intent);
            }
        });
    }
}
