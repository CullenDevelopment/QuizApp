package com.cullendevelopment.quizapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class QuizOne extends AppCompatActivity{



    /**
     *
     * Checkbox counter as a global variable
     */

    int numberCheckedCheckbox = 0;

    /**
     *
     *  ScoreOne counter as a global variable
     */
    int scoreOne = 0;


    /**
     *  Declaration of variables
     *
     */
    RadioGroup RomanGroup;
    RadioGroup w_w_2Group;
    RadioGroup FlowersGroup;
    RadioGroup w_w_1Group;
    RadioGroup CubaGroup;
    RadioGroup HenryGroup;
    RadioGroup HastingsGroup;
    RadioGroup PresidentGroup;
    EditText enterAnswer;
    RadioButton Tarmac;
    RadioButton Straight;
    RadioButton Stones;
    RadioButton Clay;
    CheckBox Scotland;
    CheckBox Sweden;
    CheckBox Norway;
    CheckBox Rome;
    CheckBox Denmark;
    RadioButton Ford;
    RadioButton Blair;
    RadioButton Ferdinand;
    RadioButton Hitler;
    RadioButton Poppy;
    RadioButton Daffodil;
    RadioButton Rose;
    RadioButton Thistle;
    RadioButton Year1812;
    RadioButton Year1914;
    RadioButton Year1939;
    RadioButton Year1656;
    RadioButton Castro;
    RadioButton Raleigh;
    RadioButton Columbus;
    RadioButton Cook;
    RadioButton Two;
    RadioButton Three;
    RadioButton Six;
    RadioButton Eight;
    RadioButton Year1944;
    RadioButton Year1066;
    RadioButton Year1964;
    RadioButton Year1901;
    RadioButton Obama;
    RadioButton Kennedy;
    RadioButton Washington;
    RadioButton Nixon;




    public static final String SCOREONE = "SCORE_KEY";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_one);


        RomanGroup = findViewById(R.id.romanGroup);
        w_w_2Group = findViewById(R.id.w_w_2Group);
        FlowersGroup = findViewById(R.id.flowers_group);
        w_w_1Group = findViewById(R.id.w_w_1_group);
        CubaGroup = findViewById(R.id.cuba_group);

        enterAnswer = findViewById(R.id.egypt_answer);

        Tarmac = findViewById(R.id.tarmac);
        Straight = findViewById(R.id.straight);
        Stones = findViewById(R.id.stones);
        Clay = findViewById(R.id.clay);
        Scotland = findViewById(R.id.scotland);
        Sweden = findViewById(R.id.sweden);
        Norway = findViewById(R.id.norway);
        Denmark = findViewById(R.id.denmark);
        Ford = findViewById(R.id.ford);
        Blair = findViewById(R.id.blair);
        Ferdinand = findViewById(R.id.ferdinand);
        Hitler = findViewById(R.id.hitler);
        Poppy = findViewById(R.id.poppy);
        Daffodil = findViewById(R.id.daffodil);
        Rose = findViewById(R.id.rose);
        Thistle = findViewById(R.id.thistle);
        Year1812 = findViewById(R.id.year1812);
        Year1914 = findViewById(R.id.year1914);
        Year1939 = findViewById(R.id.year1939);
        Year1656 = findViewById(R.id.year1656);
        Castro = findViewById(R.id.castro);
        Raleigh = findViewById(R.id.raleigh);
        Columbus = findViewById(R.id.columbus);
        Cook = findViewById(R.id.cook);
        HenryGroup = findViewById(R.id.henry_group);
        Two = findViewById(R.id.two);
        Three = findViewById(R.id.three);
        Six = findViewById(R.id.six);
        Eight = findViewById(R.id.eight);
        HastingsGroup = findViewById(R.id.hastings_group);
        Year1944 = findViewById(R.id.year1944);
        Year1066 = findViewById(R.id.year1066);
        Year1964 = findViewById(R.id.year1964);
        Year1901 = findViewById(R.id.year1901);
        PresidentGroup = findViewById(R.id.president_group);
        Obama = findViewById(R.id.obama);
        Kennedy = findViewById(R.id.kennedy);
        Washington = findViewById(R.id.washington);
        Nixon = findViewById(R.id.nixon);
        Rome = findViewById(R.id.rome);

    }

    @Override
    public void onSaveInstanceState( Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(SCOREONE, scoreOne);

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

            scoreOne = savedInstanceState.getInt(SCOREONE);
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
     * Checks which Bones Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void romanGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.tarmac:
                if (checked)
                    // if tarmac is checked
                    break;
            case R.id.straight:
                if (checked)
                    // if straight is checked
                    break;

            case R.id.stones:
                if (checked)
                    //if stones is checked
                    break;
            case R.id.clay:
                if (checked)
                    //if clay is checked
                    break;
        }
    }

    /**
     * Scotland checkbox click handler
     */

    public void scotlandClick(View view) {
        //Checks if checkbox has been been clicked

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        if (checked && (numberCheckedCheckbox >= 3))
            Scotland.setChecked(false);


        else
            // the checkbox either got unchecked
            // or there are less than 2 other checkboxes checked
            // change your counter accordingly
            if (checked) {
                numberCheckedCheckbox++;
                // Scotland clicked
            }

            else {

                numberCheckedCheckbox--;
                //needs to be in as doesn't allow changing selection otherwise.
            }


        //Show pop-up message if number of checkboxes checked exceeds two
        if (numberCheckedCheckbox >= 3) {
            Toast.makeText(this, "You can check two boxes at most", Toast.LENGTH_SHORT).show();

        }

    }
    //sweden checkbox click handler
    public void swedenClick(View view) {
        //Checks if checkbox has been been clicked

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        if (checked && (numberCheckedCheckbox >= 3))
            Sweden.setChecked(false);


        else
            // the checkbox either got unchecked
            // or there are less than 2 other checkboxes checked
            // change your counter accordingly
            if (checked) {
                numberCheckedCheckbox++;
                // Sweden clicked
            }

            else {
                numberCheckedCheckbox--;
                //needs to be in as doesn't allow changing selection otherwise.
            }


        //Show pop-up message if number of checkboxes checked exceeds two
        if (numberCheckedCheckbox >= 3) {
            Toast.makeText(this, "You can check two boxes at most", Toast.LENGTH_SHORT).show();

        }

    }
    //Norway checkbox click handler
    public void norwayClick(View view) {
        //Checks if checkbox has been been clicked

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        if (checked && (numberCheckedCheckbox >= 3))
            Norway.setChecked(false);


        else
            // the checkbox either got unchecked
            // or there are less than 2 other checkboxes checked
            // change your counter accordingly
            if (checked) {
                numberCheckedCheckbox++;
                // Norway clicked
            }


            else {
                numberCheckedCheckbox--;
                //needs to be in as doesn't allow changing selection otherwise.
            }


        //Show pop-up message if number of checkboxes checked exceeds two
        if (numberCheckedCheckbox >= 3) {
            Toast.makeText(this, "You can check two boxes at most", Toast.LENGTH_SHORT).show();

        }

    }
    //Rome checkbox click handler
    public void romeClick(View view) {
        //Checks if checkbox has been been clicked

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        if (checked && (numberCheckedCheckbox >= 3))
            Rome.setChecked(false);


        else
            // the checkbox either got unchecked
            // or there are less than 2 other checkboxes checked
            // change your counter accordingly
            if (checked) {
                numberCheckedCheckbox++;
                // Rome clicked
            }

            else {
                numberCheckedCheckbox--;
                //needs to be in as doesn't allow changing selection otherwise.
            }


        //Show pop-up message if number of checkboxes checked exceeds two
        if (numberCheckedCheckbox >= 3) {
            Toast.makeText(this, "You can check two boxes at most", Toast.LENGTH_SHORT).show();

        }

    }
    //Denmark checkbox click handler
    public void denmarkClick(View view) {
        //Checks if checkbox has been been clicked

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        if (checked && (numberCheckedCheckbox >= 3))
            Denmark.setChecked(false);


        else
            // the checkbox either got unchecked
            // or there are less than 2 other checkboxes checked
            // change your counter accordingly
            if (checked) {
                numberCheckedCheckbox++;
                // Denmark clicked
            }

            else {
                numberCheckedCheckbox--;
                //needs to be in as doesn't allow changing selection otherwise.
            }


        //Show pop-up message if number of checkboxes checked exceeds three
        if (numberCheckedCheckbox >= 3) {
            Toast.makeText(this, "You can check three boxes at most", Toast.LENGTH_SHORT).show();

        }

    }

    /**
     * Checks which Spine Group Radio button is clicked
     */

    @SuppressLint("NonConstantResourceId")
    public void w_w_2GroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ford:
                if (checked)
                    // skull is checked
                    break;
            case R.id.blair:
                if (checked)
                    // neck is checked
                    break;
            case R.id.ferdinand:
                if (checked)
                    //lower back is checked
                    break;
            case R.id.hitler:
                if (checked)
                    //upper back is checked
                    break;

        }
    }

    // Checks which Flowers Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void flowersGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.poppy:
                if (checked)
                    // if poppy is checked
                    break;
            case R.id.daffodil:
                if (checked)
                    //if daffodil is checked
                    break;
            case R.id.rose:
                if (checked)
                    //if rose is checked
                    break;
            case R.id.thistle:
                if (checked)
                    //if thistle is checked
                    break;

        }
    }

    // Checks which w_w_1Group Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void w_w_1GroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.year1812:
                if (checked)
                    // if year1812 clicked
                    break;
            case R.id.year1914:
                if (checked)
                    // if year1914 checked
                    break;

            case R.id.year1939:
                if (checked)
                    // if year1939 checked
                    break;

            case R.id.year1656:
                if (checked)
                    // if year1656 checked
                    break;
        }
    }

    // Checks which Cuba Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void cubaGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.castro:
                if (checked)
                    // if castro clicked
                    break;
            case R.id.raleigh:
                if (checked)
                    // if raleigh checked
                    break;

            case R.id.columbus:
                if (checked)
                    // if columbus checked
                    break;

            case R.id.cook:
                if (checked)
                    // if cook checked
                    break;

        }
    }
    // Checks which Henry Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void henryGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.two:
                if (checked)
                    // if two clicked
                    break;
            case R.id.three:
                if (checked)
                    // if three checked
                    break;

            case R.id.six:
                if (checked)
                    // if six checked
                    break;

            case R.id.eight:
                if (checked)
                    // if eight checked
                    break;
        }
    }
    // Checks which Hastings Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void hastingsGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.year1944:
                if (checked)
                    // if year1944 clicked
                    break;
            case R.id.year1066:
                if (checked)
                    // if year1066 checked
                    break;

            case R.id.year1964:
                if (checked)
                    // if year1964 checked
                    break;

            case R.id.year1901:
                if (checked)
                    // if year1901 checked
                    break;
        }
    }
    // Checks which President Group Radio button is clicked
    @SuppressLint("NonConstantResourceId")
    public void presidentGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.obama:
                if (checked)
                    // if obama clicked
                    break;
            case R.id.kennedy:
                if (checked)
                    // if kennedy checked
                    break;

            case R.id.washington:
                if (checked)
                    // if washington checked
                    break;

            case R.id.nixon:
                if (checked)
                    // if nixon checked
                    break;
        }
    }


    //Checks correct answers and adds scores
    public void submitAnswersOne(View view) {
        if (Straight.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }

        if (Year1914.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }

        if (Hitler.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }

        if (Poppy.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }

        if (Columbus.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }


        if (Six.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }
        if (Year1066.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }
        if (Obama.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }
        if (Denmark.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }
        if (Sweden.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }
        if (Norway.isChecked()) {
            scoreOne += 2;
            //adds two points for a correct answer
        }
        //gets you the contents of edit text
        EditText enterAnswer = findViewById(R.id.egypt_answer);
        String inputAnswer = enterAnswer.getText().toString();
        //Checks to see if EditText answer was correct
        if (inputAnswer.equals("Egypt")) {
            scoreOne += 2;
            //adds two points for a correct answer
        }


        //Zeros score so that extra presses of the submit answers button doesn't multiply score if score less than maximum.
        if (scoreOne == 24) {
            Toast.makeText(this, "Congratulations you have scored a maximum twenty-four points!", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "You have scored " + scoreOne + " points!", Toast.LENGTH_LONG).show();
        }
        scoreOne = 0;//Zeros score so that extra presses of the submit answers button doesn't multiply score.
    }




    public void homeQuizOneButtonClicked(View view) {
        // Create a new intent to open the {@link MainActivity}
        Intent homeIntent = new Intent(QuizOne.this, MainActivity.class);

        // Start the new activity
        startActivity(homeIntent); // opens up the Main Activity/Home page
    }


    public void quiz2QuizOneButtonClicked(View view) {
        // Create a new intent to open the {@link QuizTwoActivity}
        Intent quiz2Intent = new Intent(QuizOne.this, QuizTwo.class);

        // Start the new activity
        startActivity(quiz2Intent); // opens up Quiz Two
    }

    public void quizThreeQuiz1ButtonClicked(View view) {
        // Create a new intent to open the {@link QuizThreeActivity}
        Intent quiz3Intent = new Intent(QuizOne.this, QuizThree.class);

        // Start the new activity
        startActivity(quiz3Intent); // opens up Quiz Three
    }

    public void quizFourQuiz1ButtonClicked(View view) {
        // Create a new intent to open the {@link QuizFourActivity}
        Intent quiz4Intent = new Intent(QuizOne.this, QuizFour.class);

        // Start the new activity
        startActivity(quiz4Intent); // opens up Quiz Four
    }

    public void reset_quiz_one(View view) {
        scoreOne = 0;
        //zeros score
        numberCheckedCheckbox = 0;
        //zeros number of check boxes clicked variable.

        //clears radiobutton
        RomanGroup.clearCheck();
        w_w_2Group.clearCheck();
        FlowersGroup.clearCheck();
        w_w_1Group.clearCheck();
        CubaGroup.clearCheck();
        PresidentGroup.clearCheck();
        HastingsGroup.clearCheck();
        HenryGroup.clearCheck();


        //clears checkboxes
        if (Scotland.isChecked()) {
            Scotland.setChecked(false);
        }

        if (Sweden.isChecked()) {
            Sweden.setChecked(false);
        }

        if (Norway.isChecked()) {
            Norway.setChecked(false);
        }

        if (Denmark.isChecked()) {
            Denmark.setChecked(false);
        }

        if (Rome.isChecked()) {
            Rome.setChecked(false);
        }
        //clears edit text field
        enterAnswer.setText("");


    }

}
