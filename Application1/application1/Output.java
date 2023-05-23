package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        Intent i = getIntent();
        String TextMsgg = i.getStringExtra(MainActivity.TextMsg);
        TextView text = (TextView)findViewById(R.id.textViewMsg);
        text.setText(TextMsgg);
    }
}