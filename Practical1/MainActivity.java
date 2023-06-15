package com.example.program1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public final static String ss_msg =null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void nextpage(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        EditText txt_msg = (EditText)findViewById(R.id.txt_content);
        String str = txt_msg.getText().toString();
        i.putExtra(ss_msg,str);
        startActivity(i);
    }
}
