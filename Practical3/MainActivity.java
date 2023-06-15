package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLData;

public class MainActivity extends AppCompatActivity {
    EditText sname,sroll;
    TextView textView;
    String name,roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sname = findViewById(R.id.sname);
        sroll = findViewById(R.id.sroll);
        textView = findViewById(R.id.textBox);
    }

    public void insert(View view) {
        name = sname.getText().toString();
        roll = sroll.getText().toString();
        SQLiteDatabase DB = this.openOrCreateDatabase("Student",MODE_PRIVATE,null);
        DB.execSQL("CREATE TABLE IF NOT EXISTS STUDENT_DETAILS(NAME VARCHAR,ROLL VARCHAR)");
        DB.execSQL("INSERT INTO STUDENT_DETAILS(NAME,ROLL) VALUES ('"+name+"','"+roll+"')");
        Cursor C = DB.rawQuery("SELECT * FROM STUDENT_DETAILS", null);
        C.moveToLast();
        textView.setText("\n Name : " + C.getString(0) + "\n Rollno : " + C.getString(1) + "\n");
    }

    public void update(View view) {
        name = sname.getText().toString();
        roll = sroll.getText().toString();
        SQLiteDatabase DB = this.openOrCreateDatabase("Student",MODE_PRIVATE,null);
        DB.execSQL("UPDATE STUDENT_DETAILS SET NAME='"+name+"' WHERE ROLL='"+roll+"'");
        Cursor C = DB.rawQuery("SELECT * FROM STUDENT_DETAILS", null);
        C.moveToLast();
        textView.setText("\n Name : " + C.getString(0) + "\n Rollno : " + C.getString(1) + "\n");
    }

    public void clear(View view) {
        sname.getText().clear();
        sroll.getText().clear();
    }

    public void delete(View view) {
        name = sname.getText().toString();
        roll = sroll.getText().toString();
        SQLiteDatabase DB = this.openOrCreateDatabase("Student",MODE_PRIVATE,null);
        DB.execSQL("DELETE FROM STUDENT_DETAILS WHERE ROLL='"+roll+"'");
        Cursor C = DB.rawQuery("SELECT * FROM STUDENT_DETAILS", null);
        C.moveToLast();
        textView.setText("\n Name : " + C.getString(0) + "\n Rollno : " + C.getString(1) + "\n");
        Toast.makeText(getBaseContext(),"Deleted successfully...",Toast.LENGTH_LONG).show();
    }
}
