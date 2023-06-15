package com.example.program1;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt ;
    int i=30;
    int ch=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Display1(View view) {
        i=i+5;
        txt = (TextView)findViewById(R.id.view1);
        txt.setTextSize(i);
        if(i==50){
            i=30;
        }
    }

    public void Display2(View view) {
        txt = (TextView)findViewById(R.id.view1);
        switch (ch){
            case 1:txt.setTextColor(Color.GREEN);
                   break;
            case 2:txt.setTextColor(Color.RED);
                break;
            case 3:txt.setTextColor(Color.GRAY);
                break;
            case 4:txt.setTextColor(Color.BLUE);
                break;
        }
        ch++;
        if(ch==5){
            ch=1;
        }
    }
}
