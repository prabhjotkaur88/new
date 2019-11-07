package com.example.newdiceroller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




             final TextView textTwo = (TextView)findViewById(R.id.textView2);
             Button rollTheDice= (Button) findViewById(R.id.rollTheDiceID);
                final TextView guessID = (TextView)findViewById(R.id.textView3);

             final EditText userGuess = (EditText) findViewById(R.id.editText1);
             final TextView scoreID = (TextView) findViewById(R.id.scoreID);



     rollTheDice.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String randText = "";
                score = 0;
             Random randGen= new Random();
             int rando =randGen.nextInt(7);
int userNUmber= Integer.parseInt(userGuess.getText().toString());

    if (userNUmber < 1 || userNUmber > 6) {

        guessID.setText("Please enter a number between 1-6");
    }

            else if (userNUmber == rando)
                {
                    guessID.setText(" You got it right!");
score++;
scoreID.setText("Score:" + score++);
                }

             else
                 {
                     guessID.setText("Not quite, GUESS again!");
                 }


             randText= Integer.toString(rando);
             textTwo.setText((randText));

userGuess.setText("");

         }
     });


    }



}