package com.cullendevelopment.quizapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class QuizThree extends AppCompatActivity{



    /*
     *
     */



    /**
     *
     */
    int scoreThree = 0;


    /**
     *
     */
    RadioGroup PenGroup;
    RadioButton Scribe;
    RadioButton Fountain;
    RadioButton Quill;
    RadioButton Biro;
    RadioGroup WilliamGroup;
    RadioButton France;
    RadioButton Germany;
    RadioButton Italy;
    RadioButton Britain;
    RadioGroup PresidentsGroup;
    RadioButton Trump;
    RadioButton Eisenhower;
    RadioButton Reagan;
    RadioButton Bush;
    RadioGroup WW2Group;
    RadioButton Vietnam;
    RadioButton Korean;
    RadioButton WW2;
    RadioButton Boer;
    RadioGroup CaesarGroup;
    RadioButton British;
    RadioButton Roman;
    RadioButton Salvation;
    RadioButton German;
    RadioGroup EinsteinGroup;
    RadioButton Einstein;
    RadioButton Finney;
    RadioButton Kahn;
    RadioButton Speer;
    RadioGroup MoonWalkerGroup;
    RadioButton Moon;
    RadioButton Row;
    RadioButton Fly;
    RadioButton Everest;
    RadioGroup CookGroup;
    RadioButton Spanish;
    RadioButton FromBritain;
    RadioButton Italian;
    RadioButton Portuguese;
    RadioGroup NightingaleGroup;
    RadioButton Miner;
    RadioButton Engineer;
    RadioButton Nurse;
    RadioButton Mathematician;
    EditText enterAnswer;


    /**
     *
     */


    public static final String SCORETHREE = "SCORE_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_three);


        /*
         *
         * @param Assigns RadioButtons CheckBoxes and EditTexts to corresponding variables
         */
        PenGroup = findViewById(R.id.pen_group);
        Scribe = findViewById(R.id.scribe);
        Fountain = findViewById(R.id.fountain);
        Quill = findViewById(R.id.quill);
        Biro = findViewById(R.id.biro);

        WilliamGroup = findViewById(R.id.william_group);
        France = findViewById(R.id.france);
        Germany = findViewById(R.id.germany);
        Italy = findViewById(R.id.italy);
        Britain = findViewById(R.id.britain);

        PresidentsGroup = findViewById(R.id.presidents_group);
        Trump = findViewById(R.id.trump);
        Eisenhower = findViewById(R.id.eisenhower);
        Reagan = findViewById(R.id.reagan);
        Bush = findViewById(R.id.bush);

        WW2Group = findViewById(R.id.w_w_2_group);
        Vietnam = findViewById(R.id.vietnam);
        Korean = findViewById(R.id.korean);
        WW2 = findViewById(R.id.wwii);
        Boer = findViewById(R.id.boer);

        CaesarGroup = findViewById(R.id.caesar_group);
        British = findViewById(R.id.british);
        Roman = findViewById(R.id.roman);
        Salvation = findViewById(R.id.salvation);
        German = findViewById(R.id.german);

        MoonWalkerGroup = findViewById(R.id.moonwalker_group);
        Moon = findViewById(R.id.moon);
        Row = findViewById(R.id.row);
        Fly = findViewById(R.id.fly);
        Everest = findViewById(R.id.everest);

        EinsteinGroup = findViewById(R.id.einstein_group);
        Einstein = findViewById(R.id.einstein);
        Finney = findViewById(R.id.finney);
        Kahn = findViewById(R.id.kahn);
        Speer = findViewById(R.id.speer);

        CookGroup = findViewById(R.id.cook_group);
        Spanish = findViewById(R.id.spanish);
        FromBritain = findViewById(R.id.fromBritain);
        Italian = findViewById(R.id.italian);
        Portuguese = findViewById(R.id.portuguese);

        NightingaleGroup = findViewById(R.id.nightingale_group);
        Miner = findViewById(R.id.miner);
        Engineer = findViewById(R.id.engineer);
        Nurse = findViewById(R.id.nurse);
        Mathematician = findViewById(R.id.mathematician);

        enterAnswer = findViewById(R.id.shakespeare_answer);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(SCORETHREE, scoreThree);

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

        scoreThree = savedInstanceState.getInt(SCORETHREE);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int[] scrcoords = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager) Objects.requireNonNull(this.getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * Checks which Pen Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void penGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.scribe:
                if (checked)
                    // if scribe is checked
                    break;
            case R.id.fountain:
                if (checked)
                    // if fountain is checked
                    break;

            case R.id.quill:
                if (checked)
                    //if quill is checked
                    break;
            case R.id.biro:
                if (checked)
                    //if biro is checked
                    break;
        }
    }

    /**
     * Checks which william Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void williamGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.france:
                if (checked)
                    // if france is checked
                    break;
            case R.id.germany:
                if (checked)
                    // if germany is checked
                    break;

            case R.id.italy:
                if (checked)
                    //if italy is checked
                    break;
            case R.id.britain:
                if (checked)
                    //if britain is checked
                    break;
        }
    }

    /**
     * Checks which Presidents Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void presidentsGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.trump:
                if (checked)
                    // trump is checked
                    break;
            case R.id.eisenhower:
                if (checked)
                    // eisenhower is checked
                    break;
            case R.id.reagan:
                if (checked)
                    //reagan is checked
                    break;
            case R.id.bush:
                if (checked)
                    //bush is checked
                    break;

        }
    }

    // Checks which WW2 Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void w_w_2GroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.vietnam:
                if (checked)
                    // if vietnam is checked
                    break;
            case R.id.korean:
                if (checked)
                    //if korean is checked
                    break;
            case R.id.wwii:
                if (checked)
                    //if wwii is checked
                    break;
            case R.id.boer:
                if (checked)
                    //if boer is checked
                    break;

        }
    }

    // Checks which Caesar Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void caesarGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.british:
                if (checked)
                    // if british clicked
                    break;
            case R.id.roman:
                if (checked)
                    // if roman checked
                    break;

            case R.id.salvation:
                if (checked)
                    // if salvation checked
                    break;

            case R.id.german:
                if (checked)
                    // if german checked
                    break;
        }
    }


    // Checks which Einstein Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void einsteinGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.einstein:
                if (checked)
                    // if einstein clicked
                    break;
            case R.id.finney:
                if (checked)
                    // if finney checked
                    break;

            case R.id.kahn:
                if (checked)
                    // if kahn checked
                    break;

            case R.id.speer:
                if (checked)
                    // if speer checked
                    break;
        }
    }
    // Checks which moonwalker Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void moonwalkerGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.moon:
                if (checked)
                    // if moon clicked
                    break;
            case R.id.row:
                if (checked)
                    // if row checked
                    break;

            case R.id.fly:
                if (checked)
                    // if fly checked
                    break;

            case R.id.everest:
                if (checked)
                    // if everest checked
                    break;
        }
    }
    // Checks which Cook Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void cookGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.spanish:
                if (checked)
                    // if spanish clicked
                    break;
            case R.id.fromBritain:
                if (checked)
                    // if fromBritain checked
                    break;

            case R.id.italian:
                if (checked)
                    // if italian checked
                    break;

            case R.id.portuguese:
                if (checked)
                    // if portuguese checked
                    break;
        }
    }
    // Checks which Nightingale Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void nightingaleGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.miner:
                if (checked)
                    // if miner clicked
                    break;
            case R.id.engineer:
                if (checked)
                    // if engineer checked
                    break;

            case R.id.nurse:
                if (checked)
                    // if nurse checked
                    break;

            case R.id.mathematician:
                if (checked)
                    // if mathematician checked
                    break;

        }
    }

    //Checks correct answers and adds scores
    public void submitAnswersThree(View view) {
        if (Quill.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }

        if (France.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }

        if (Trump.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }

        if (WW2.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }

        if (Roman.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }

        if (Einstein.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }
        if (Moon.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }
        if (FromBritain.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }
        if (Nurse.isChecked()) {
            scoreThree += 2;
            //adds two points for a correct answer
        }

        //gets you the contents of edit text
        EditText enterAnswer = findViewById(R.id.shakespeare_answer);
        String inputAnswer = enterAnswer.getText().toString();
        //Checks to see if EditText answer was correct
        if (inputAnswer.equals("William")) {
            scoreThree += 2;
            //adds two points for a correct answer
        }


        /*
         * Pops up score as toast message out of twenty-four - 2 points for each correct answer.
         */
        //Zeros score so that extra presses of the submit answers button doesn't multiply score if score less than maximum.
        if (scoreThree == 20) {
            Toast.makeText(this, "Congratulations you have scored a maximum twenty points!", Toast.LENGTH_LONG).show();

        }
        /*
         *  Pops up score if less than fourteen
         */
        else {
            Toast.makeText(this, "You have scored " + scoreThree + " points!", Toast.LENGTH_LONG).show();
        }
        scoreThree = 0;//Zeros score so that extra presses of the submit answers button doesn't multiply score.
    }

    //Resets all Check boxes, Radio Buttons and Text input answers and resets integer variables.
    public void reset_quiz_three(View view) {
        scoreThree = 0;
        //zeros score


        //clears radiobuttons
        PenGroup.clearCheck();
        WilliamGroup.clearCheck();
        PresidentsGroup.clearCheck();
        WW2Group.clearCheck();
        CaesarGroup.clearCheck();
        EinsteinGroup.clearCheck();
        MoonWalkerGroup.clearCheck();
        CookGroup.clearCheck();
        NightingaleGroup.clearCheck();

        //clears edit text field
        enterAnswer.setText("");


    }

    public void homeButtonQuiz3Clicked(View view) {
        // Create a new intent to open the {@link MainActivity}
        Intent homeIntent = new Intent(QuizThree.this, MainActivity.class);

        // Start the new activity
        startActivity(homeIntent); // opens up Home Page Main Activity
    }

    public void quizOneButtonQuiz3Clicked(View view) {
        // Create a new intent to open the {@link QuizOne}
        Intent quizOneIntent = new Intent(QuizThree.this, QuizOne.class);

        // Start the new activity
        startActivity(quizOneIntent); // opens up Quiz One
    }

    public void quizTwoButtonQuiz3Clicked(View view) {
        // Create a new intent to open the {@link QuizTwo}
        Intent quizTwoIntent = new Intent(QuizThree.this, QuizTwo.class);

        // Start the new activity
        startActivity(quizTwoIntent); // opens up Quiz One
    }

    public void quizFourButtonQuiz3Clicked(View view) {
        // Create a new intent to open the {@link Quiz Four}
        Intent quizFourIntent = new Intent(QuizThree.this, QuizFour.class);

        // Start the new activity
        startActivity(quizFourIntent); // opens up Quiz Four
    }
}

