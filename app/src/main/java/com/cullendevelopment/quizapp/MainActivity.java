package com.cullendevelopment.quizapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {




    public static final String SCORE = "SCORE_KEY";

   // int score is a global variable
     int score = 0;

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(SCORE, score);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Saves scores if screen rewritten
     *
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.

        score = savedInstanceState.getInt(SCORE);
    }


    public void quizOneHomeButtonClicked(View view) {
        // Create a new intent to open the {@link QuizOne}
        Intent quizOneIntent = new Intent(MainActivity.this, QuizOne.class);

        // Start the new activity
        startActivity(quizOneIntent); // opens up the Quiz One Activity

    }

    public void quizTwoHomeButtonClicked(View view) {
        // Create a new intent to open the {@link QuizTwo}
        Intent quizTwoIntent = new Intent(MainActivity.this, QuizTwo.class);

        // Start the new activity
        startActivity(quizTwoIntent); // opens up the QuizTwo Activity
    }

    public void quizThreeHomeButtonClicked(View view) {
        // Create a new intent to open the {@link QuizThree}
        Intent quizThreeIntent = new Intent(MainActivity.this, QuizThree.class);

        // Start the new activity
        startActivity(quizThreeIntent); // opens up the Quiz Three Activity
    }

    public void quizFourHomeButtonClicked(View view) {
        // Create a new intent to open the {@link QuizFour}
        Intent quizFourIntent = new Intent(MainActivity.this, QuizFour.class);

        // Start the new activity
        startActivity(quizFourIntent); // opens up the Quiz Four Activity
    }
}