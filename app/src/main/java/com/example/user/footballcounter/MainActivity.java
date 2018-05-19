package com.example.user.footballcounter;

import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.xgc1986.ripplebutton.widget.RippleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int myTotalA, myTotalB;
    int myScore = 0, myScore2 = 0, myScore3 = 0, myScore4 = 0;
    int myScoreA = 0, myScoreB = 0, myScoreC = 0, myScoreD = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();  //to hide actionBar

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.mycolor));
        }

        //Buttons for team A
        Button butt = findViewById(R.id.button);
        Button butt2 = findViewById(R.id.button2);
        Button butt3 = findViewById(R.id.button3);
        Button butt4 = findViewById(R.id.button4);

        butt.setOnClickListener(this);
        butt2.setOnClickListener(this);
        butt3.setOnClickListener(this);
        butt4.setOnClickListener(this);

        //Buttons for team B
        Button buttA = findViewById(R.id.buttonA);
        Button buttB = findViewById(R.id.buttonB);
        Button buttC = findViewById(R.id.buttonC);
        Button buttD = findViewById(R.id.buttonD);

        buttA.setOnClickListener(this);
        buttB.setOnClickListener(this);
        buttC.setOnClickListener(this);
        buttD.setOnClickListener(this);

        //reset Button
        ImageButton resetButton = findViewById(R.id.reset);
        resetButton.setOnClickListener(this);

    }//end of onCreate

    //team A
    private void totalA(){
        TextView team_a_total = findViewById(R.id.team_a_score);
        myTotalA = myScore + myScore2 + myScore3 + myScore4;
        team_a_total.setText("" + myTotalA);
    }

    private void display(int number){
        TextView score = findViewById(R.id.score);
        score.setText("" + number);
    }
    private void display2(int number){
        TextView score2 = findViewById(R.id.score2);
        score2.setText("" + number);
    }
    private void display3(int number){
        TextView score3 = findViewById(R.id.score3);
        score3.setText("" + number);
    }
    private void display4(int number){
        TextView score4 = findViewById(R.id.score4);
        score4.setText("" + number);
    }

    private void add6(){
        myScore = myScore + 6;
        display(myScore);
        totalA();
    }
    private void add3(){
        myScore2 = myScore2 + 3;
        display2(myScore2);
        totalA();
    }
    private void add1(){
        myScore3 = myScore3 + 1;
        display3(myScore3);
        totalA();
    }
    private void add2(){
        myScore4 = myScore4 + 2;
        display4(myScore4);
        totalA();
    }
    //end of team A

    //team B
    private void totalB(){
        TextView team_b_total = findViewById(R.id.team_b_score);
        myTotalB = myScoreA + myScoreB + myScoreC + myScoreD;
        team_b_total.setText(String.valueOf(myTotalB));
    }

    private void displayA(int number){
        TextView scoreA = findViewById(R.id.scoreA);
        scoreA.setText("" + number);
    }
    private void displayB(int number){
        TextView scoreB = findViewById(R.id.scoreB);
        scoreB.setText("" + number);
    }
    private void displayC(int number){
        TextView scoreC = findViewById(R.id.scoreC);
        scoreC.setText("" + number);
    }
    private void displayD(int number){
        TextView scoreD = findViewById(R.id.scoreD);
        scoreD.setText("" + number);
    }

    private void add6B(){
        myScoreA = myScoreA + 6;
        displayA(myScoreA);
        totalB();
    }
    private void add3B(){
        myScoreB = myScoreB + 3;
        displayB(myScoreB);
        totalB();
    }
    private void add1B(){
        myScoreC = myScoreC + 1;
        displayC(myScoreC);
        totalB();
    }
    private void add2B(){
        myScoreD = myScoreD + 2;
        displayD(myScoreD);
        totalB();
    }
    //end of team B

    private void reset(){
        //for team A
        myScore = 0; myScore2 = 0; myScore3 = 0; myScore4 = 0;
        display(myScore); display2(myScore2); display3(myScore3); display4(myScore4);
        totalA();

        //for team B
        myScoreA = 0; myScoreB = 0; myScoreC = 0; myScoreD = 0;
        displayA(myScoreA); displayB(myScoreB); displayC(myScoreC); displayD(myScoreD);
        totalB();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.button):
                add6();
                break;

            case (R.id.button2):
                add3();
                break;

            case (R.id.button3):
                add1();
                break;

            case (R.id.button4):
                add2();
                break;

            case (R.id.buttonA):
                add6B();
                break;

            case (R.id.buttonB):
                add3B();
                break;

            case (R.id.buttonC):
                add1B();
                break;

            case (R.id.buttonD):
                add2B();
                break;

            case (R.id.reset):
                reset();
                break;
        }
    }

}//end of public class
