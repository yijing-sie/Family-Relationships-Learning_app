package com.example.educationlearntree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menu (View view){
        Intent intent = new Intent(this,MenuClass.class);
        this.startActivity(intent);
        overridePendingTransition( R.anim.fade_in_and_scale, 0 );

    }
}
