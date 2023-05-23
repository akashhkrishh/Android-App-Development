package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String TextMsg = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(View V){
        Intent i = new Intent(this, Output.class);
        EditText TextBox = (EditText)findViewById(R.id.TextBox);
        String TextValue = TextBox.getText().toString();
        i.putExtra(TextMsg,TextValue);
        startActivity(i);
    }
}