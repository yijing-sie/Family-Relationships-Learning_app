package com.example.educationlearntree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;


public class Test3 extends AppCompatActivity {
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    static int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3);
        r1 = findViewById(R.id.radio_q3_r1);
        r2 = findViewById(R.id.radio_q3_r2);
        r3 = findViewById(R.id.radio_q3_r3);
        r4 =  findViewById(R.id.radio_q3_r4);
    }


    public void back3(View view) {
        Intent intent = new Intent(this,Test2.class);
        grade = r4.isChecked()? 10 : 0;
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        this.startActivity(intent);
    }

    public void next3(View view) {
        Intent intent = new Intent(this,Test4.class);
        grade = r4.isChecked()? 10 : 0;
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        this.startActivity(intent);
    }
}