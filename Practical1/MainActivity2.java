package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String txt_msg = i.getStringExtra(MainActivity.ss_msg);
        TextView te = (TextView) findViewById(R.id.textView3);
        te.setText("Welcome "+txt_msg);


    }
}
