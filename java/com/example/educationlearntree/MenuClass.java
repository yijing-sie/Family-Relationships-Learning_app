package com.example.educationlearntree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void learn(View view){
        Intent intent = new Intent(this,Learn.class);
        this.startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,0);
    }

    public void test(View view){
        Intent intent = new Intent(this,Test.class);
        this.startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,0);
    }

}
