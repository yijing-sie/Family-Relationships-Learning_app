package com.example.educationlearntree;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Submit extends AppCompatActivity {
    int grade[] = new int[10];
    int score = 0;
    String result;
    String wrong = "";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit);
        score += Test.grade;
        if(Test.grade == 0) wrong += "Q1 is wrong\n";

        score += Test2.grade;
        if(Test2.grade == 0) wrong += "Q2 is wrong\n";

        score += Test3.grade;
        if(Test3.grade == 0) wrong += "Q3 is wrong\n";

        score += Test4.grade;
        if(Test4.grade == 0) wrong += "Q4 is wrong\n";

        score += Test5.grade;
        if(Test5.grade == 0) wrong += "Q5 is wrong\n";

        score += Test6.grade;
        if(Test6.grade == 0) wrong += "Q6 is wrong\n";

        score += Test7.grade;
        if(Test7.grade == 0) wrong += "Q7 is wrong\n";

        score += Test8.grade;
        if(Test8.grade == 0) wrong += "Q8 is wrong\n";

        score += Test9.grade;
        if(Test9.grade == 0) wrong += "Q9 is wrong\n";

        score += Test10.grade;
        if(Test10.grade == 0) wrong += "Q10 is wrong\n";

        final TextView resultTextView = (TextView) findViewById(R.id.result);
        final TextView wrongTextView = (TextView) findViewById(R.id.wrong);
        if (score >= 60) {
            result = "Congratulations!!!\n\nYou've passed the test !\n\nYour final score is " + score + ".";
        } else {
            result = "Sorry...\n\n You didn't pass the test\nYou need to get over 60 to pass it\n\nYou've got " + score + ".";
        }
        resultTextView.setText(result);
        wrongTextView.setText(wrong);
    }

    public void learn(View view){
        Intent intent = new Intent(this,Learn.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        this.startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,0);
    }

    public void test(View view){
        Intent intent = new Intent(this,Test.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        this.startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,0);
    }
}
