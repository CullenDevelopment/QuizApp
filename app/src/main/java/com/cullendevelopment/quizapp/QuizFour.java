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

public class QuizFour extends AppCompatActivity{



    /**
     *
     */
    int scoreFour = 0;


    /**
     *
     */
    RadioGroup GizaGroup;
    RadioButton Chimp;
    RadioButton Snake;
    RadioButton Lion;
    RadioButton Zebra;
    RadioGroup WW1Group;
    RadioButton WW2_2;
    RadioButton Vietnam2;
    RadioButton WW1;
    RadioButton Korean2;
    RadioGroup DeadPresidentsGroup;
    RadioButton Garfield;
    RadioButton Reagan2;
    RadioButton Kennedy2;
    RadioButton McKinley;
    RadioButton Lincoln;
    RadioButton Trump2;
    RadioGroup CarsGroup;
    RadioButton Cent20;
    RadioButton Cent17;
    RadioButton Cent19;
    RadioButton Cent18;
    RadioGroup PyramidsGroup;
    RadioButton Babylon;
    RadioButton Giza;
    RadioButton Colossus;
    RadioButton Temple;
    RadioGroup MoonwalkersGroup;
    RadioButton Peake;
    RadioButton Lightyear;
    RadioButton Aldrin;
    RadioButton Gromit;
    RadioGroup AgesGroup;
    RadioButton Ironage;
    RadioButton Stoneage;
    RadioButton Enlightenment;
    RadioButton Bronzeage;
    RadioGroup TudorGroup;
    RadioButton HenryII;
    RadioButton Richard;
    RadioButton HenryVIII;
    RadioButton Charles;
    RadioGroup SpitfiresGroup;
    RadioButton FighterPlanes;
    RadioButton Cannon;
    RadioButton Tanks;
    RadioButton Dragons;
    EditText enterAnswer;


    /**
     *
     */


    public static final String SCOREFOUR = "SCORE_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_four);

        /*
         *
         * @param Assigns RadioButtons CheckBoxes and EditTexts to corresponding variables
         */
        GizaGroup = findViewById(R.id.gizaGroup);
        Chimp = findViewById(R.id.chimp);
        Snake = findViewById(R.id.snake);
        Lion = findViewById(R.id.lion);
        Zebra = findViewById(R.id.zebra);

        WW1Group = findViewById(R.id.wwiGroup);
        WW2_2 = findViewById(R.id.wwii2);
        Vietnam2 = findViewById(R.id.vietnam2);
        WW1 = findViewById(R.id.wwi);
        Korean2 = findViewById(R.id.korean2);

        DeadPresidentsGroup = findViewById(R.id.deadPresidentsGroup);
        Lincoln = findViewById(R.id.lincoln);
        Trump2 = findViewById(R.id.trump2);
        Garfield = findViewById(R.id.garfield);
        Reagan2 = findViewById(R.id.reagan2);
        Kennedy2 = findViewById(R.id.kennedy2);
        McKinley = findViewById(R.id.mckinley);

        CarsGroup = findViewById(R.id.carsGroup);
        Cent20 = findViewById(R.id.cent20);
        Cent17 = findViewById(R.id.cent17);
        Cent19 = findViewById(R.id.cent19);
        Cent18 = findViewById(R.id.cent18);

        PyramidsGroup = findViewById(R.id.pyramidsGroup);
        Babylon = findViewById(R.id.babylon);
        Giza = findViewById(R.id.giza);
        Colossus = findViewById(R.id.colossus);
        Temple = findViewById(R.id.temple);

        MoonwalkersGroup = findViewById(R.id.moonwalkersGroup);
        Peake = findViewById(R.id.peake);
        Lightyear = findViewById(R.id.lightyear);
        Aldrin = findViewById(R.id.aldrin);
        Gromit = findViewById(R.id.gromit);

        AgesGroup = findViewById(R.id.agesGroup);
        Ironage = findViewById(R.id.ironage);
        Stoneage = findViewById(R.id.stoneage);
        Enlightenment = findViewById(R.id.enlightenment);
        Bronzeage = findViewById(R.id.bronzeage);

        TudorGroup = findViewById(R.id.tudorGroup);
        HenryII = findViewById(R.id.henryii);
        Richard = findViewById(R.id.richard);
        HenryVIII = findViewById(R.id.henryviii);
        Charles = findViewById(R.id.charles);

        SpitfiresGroup = findViewById(R.id.spitfiresGroup);
        FighterPlanes = findViewById(R.id.fighter_planes);
        Cannon = findViewById(R.id.cannon);
        Tanks = findViewById(R.id.tanks);
        Dragons = findViewById(R.id.dragons);


        enterAnswer = findViewById(R.id.blackbeard_answer);


    }


    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(SCOREFOUR, scoreFour);

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

        scoreFour = savedInstanceState.getInt(SCOREFOUR);
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
     * Checks which Giza Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void gizaGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.chimp:
                if (checked)
                    // if chimp is checked
                    break;
            case R.id.snake:
                if (checked)
                    // if snake is checked
                    break;

            case R.id.lion:
                if (checked)
                    //if lion is checked
                    break;
            case R.id.zebra:
                if (checked)
                    //if zebra is checked
                    break;
        }
    }

    /**
     * Checks which WW1 Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void wwiGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.wwii2:
                if (checked)
                    // if wwii2 is checked
                    break;
            case R.id.vietnam2:
                if (checked)
                    // if vietnam2 is checked
                    break;

            case R.id.wwi:
                if (checked)
                    //if wwi is checked
                    break;
            case R.id.korean2:
                if (checked)
                    //if korean2 is checked
                    break;
        }
    }

    /**
     * Checks which Dead Presidents Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void deadPresidentsGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.lincoln:
                if (checked)
                    // lincoln is checked
                    break;
            case R.id.trump2:
                if (checked)
                    // trump2 is checked
                    break;
            case R.id.garfield:
                if (checked)
                    //garfield is checked
                    break;
            case R.id.reagan2:
                if (checked)
                    //reagan2 is checked
                    break;
            case R.id.kennedy2:
                if (checked)
                    //Kennedy2 is checked
                    break;
            case R.id.mckinley:
                if (checked)
                    //McKinley is checked
                    break;

        }
    }

    // Checks which Cars Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void carsGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.cent20:
                if (checked)
                    // if 20th Century is checked
                    break;
            case R.id.cent17:
                if (checked)
                    //if 17th Century is checked
                    break;
            case R.id.cent19:
                if (checked)
                    //if 19th Century is checked
                    break;
            case R.id.cent18:
                if (checked)
                    //if 18th Century is checked
                    break;

        }
    }

    // Checks which Pyramids Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void pyramidsGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.babylon:
                if (checked)
                    // if Babylon clicked
                    break;
            case R.id.giza:
                if (checked)
                    // if Giza checked
                    break;

            case R.id.colossus:
                if (checked)
                    // if Colossus checked
                    break;

            case R.id.temple:
                if (checked)
                    // if Temple checked
                    break;
        }
    }

    // Checks which Moonwalkers Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void moonwalkersGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.peake:
                if (checked)
                    // if Peake clicked
                    break;
            case R.id.lightyear:
                if (checked)
                    // if lightyear checked
                    break;

            case R.id.aldrin:
                if (checked)
                    // if aldrin checked
                    break;

            case R.id.gromit:
                if (checked)
                    // if Gromit checked
                    break;

        }
    }
    // Checks which Ages Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void agesGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.ironage:
                if (checked)
                    // if Ironage clicked
                    break;
            case R.id.stoneage:
                if (checked)
                    // if stoneage checked
                    break;

            case R.id.enlightenment:
                if (checked)
                    // if enlightenment checked
                    break;

            case R.id.bronzeage:
                if (checked)
                    // if bronzeage checked
                    break;
        }
    }
    // Checks which Tudor Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void tudorGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.henryii:
                if (checked)
                    // if Henry II clicked
                    break;
            case R.id.richard:
                if (checked)
                    // if Richard checked
                    break;

            case R.id.henryviii:
                if (checked)
                    // if henry viii checked
                    break;

            case R.id.charles:
                if (checked)
                    // if Charles checked
                    break;
        }
    }
    // Checks which Spitfires Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void spitfiresGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.fighter_planes:
                if (checked)
                    // if fighter planes clicked
                    break;
            case R.id.cannon:
                if (checked)
                    // if cannon checked
                    break;

            case R.id.tanks:
                if (checked)
                    // if tanks checked
                    break;

            case R.id.dragons:
                if (checked)
                    // if dragons checked
                    break;
        }
    }


    //Checks correct answers and adds scores
    public void submitAnswersFour(View view) {
        if (Lion.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }

        if (WW1.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }

        if (Lincoln.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }

        if (Garfield.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }
        if (McKinley.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }
        if (Kennedy2.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }
        if (Cent19.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }

        if (Giza.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }


        if (Aldrin.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }
        if (Stoneage.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }
        if (HenryVIII.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }
        if (FighterPlanes.isChecked()) {
            scoreFour += 2;
            //adds two points for a correct answer
        }
        //gets you the contents of edit text
        EditText enterAnswer = findViewById(R.id.blackbeard_answer);
        String inputAnswer = enterAnswer.getText().toString();
        //Checks to see if EditText answer was correct
        if (inputAnswer.equals("Pirate")) {
            scoreFour += 2;
            //adds two points for a correct answer
        }

        /*
         * Pops up score as toast message out of twenty-four - 2 points for each correct answer.
         */
        //Zeros score so that extra presses of the submit answers button doesn't multiply score if score less than maximum.
        if (scoreFour == 20) {
            Toast.makeText(this, "Congratulations you have scored a maximum twenty points!", Toast.LENGTH_LONG).show();

        }
        /*
         *  Pops up score if less than fourteen
         */
        else {
            Toast.makeText(this, "You have scored " + scoreFour + " points!", Toast.LENGTH_LONG).show();
        }
        scoreFour = 0;//Zeros score so that extra presses of the submit answers button doesn't multiply score.
    }

    //Resets all Check boxes, Radio Buttons and Text input answers and resets integer variables.
    public void reset_quiz_four(View view) {
        scoreFour = 0;
        //zeros score


        //clears radiobutton
        GizaGroup.clearCheck();
        WW1Group.clearCheck();
        DeadPresidentsGroup.clearCheck();
        CarsGroup.clearCheck();
        PyramidsGroup.clearCheck();
        MoonwalkersGroup.clearCheck();
        AgesGroup.clearCheck();
        TudorGroup.clearCheck();
        SpitfiresGroup.clearCheck();


        //clears edit text field
        enterAnswer.setText("");


    }

    public void homeButtonQuiz4Clicked(View view) {
        // Create a new intent to open the {@link MainActivity}
        Intent homeFourIntent = new Intent(QuizFour.this, MainActivity.class);

        // Start the new activity
        startActivity(homeFourIntent); // opens up Home Page Main Activity
    }

    public void quizOneButtonQuiz4Clicked(View view) {
        // Create a new intent to open the {@link Quiz One}
        Intent quizOneQ4Intent = new Intent(QuizFour.this, QuizOne.class);

        // Start the new activity
        startActivity(quizOneQ4Intent); // opens up Quiz One
    }

    public void quizTwoButtonQuiz4Clicked(View view) {
        // Create a new intent to open the {@link Quiz Two}
        Intent quizTwoQ4Intent = new Intent(QuizFour.this, QuizTwo.class);

        // Start the new activity
        startActivity(quizTwoQ4Intent); // opens up Quiz Two
    }

    public void quizThreeButtonQuiz4Clicked(View view) {
        // Create a new intent to open the {@link Quiz Three}
        Intent quizThreeQ4Intent = new Intent(QuizFour.this, QuizThree.class);

        // Start the new activity
        startActivity(quizThreeQ4Intent); // opens up Quiz Three
    }
}

