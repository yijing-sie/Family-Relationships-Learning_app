package com.example.educationlearntree;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Learn extends AppCompatActivity{
    private Button buttonHenry;
    private Button buttonJames;
    private Button buttonSarah;
    private Button buttonAndrew;
    private Button buttonSusan;
    private Button buttonOliver;
    private Button buttonEmma;
    private Button buttonMichael;
    private Button buttonFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn);

        buttonHenry = findViewById(R.id.buttonHenry);
        buttonHenry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                henryDialog();
            }
        });

        buttonJames = findViewById(R.id.buttonJames);
        buttonJames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jamesDialog();
            }
        });

        buttonSusan =  findViewById(R.id.buttonSusan);
        buttonSusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                susanDialog();
            }
        });

        buttonAndrew = findViewById(R.id.buttonAndrew);
        buttonAndrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                andrewDialog();
            }
        });

        buttonSarah =  findViewById(R.id.buttonSarah);
        buttonSarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sarahDialog();
            }
        });

        buttonOliver = findViewById(R.id.buttonOliver);
        buttonOliver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oliverDialog();
            }
        });

        buttonEmma =  findViewById(R.id.buttonEmma);
        buttonEmma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emmaDialog();
            }
        });

        buttonMichael = findViewById(R.id.buttonMichael);
        buttonMichael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                michaelDialog();
            }
        });

        buttonFinal = findViewById(R.id.button10);
        buttonFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTest();
            }
        });
    }

    public void henryDialog() {
        henryDialog pop = new henryDialog();
        pop.show(getSupportFragmentManager(), "henry");
    }

    public void jamesDialog() {
        jamesDialog pop = new jamesDialog();
        pop.show(getSupportFragmentManager(), "james");
    }

    public void susanDialog() {
        susanDialog pop = new susanDialog();
        pop.show(getSupportFragmentManager(), "susan");
    }

    public void andrewDialog() {
        andrewDialog pop = new andrewDialog();
        pop.show(getSupportFragmentManager(), "andrew");
    }

    public void sarahDialog() {
        sarahDialog pop = new sarahDialog();
        pop.show(getSupportFragmentManager(), "sarah");
    }

    public void oliverDialog() {
        oliverDialog pop = new oliverDialog();
        pop.show(getSupportFragmentManager(), "oliver");
    }

    public void emmaDialog() {
        emmaDialog pop = new emmaDialog();
        pop.show(getSupportFragmentManager(), "emma");
    }

    public void michaelDialog() {
        michaelDialog pop = new michaelDialog();
        pop.show(getSupportFragmentManager(), "michael");
    }

    public void toTest() {
        Intent startTest = new Intent(this, Test.class);
        startActivity(startTest);
    }
}
