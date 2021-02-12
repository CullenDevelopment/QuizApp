package com.cullendevelopment.quizapp;

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

public class QuizTwo extends AppCompatActivity{

    private View view;

    /**
     *
     * @param Checkbox counter as a global variable
     */

    int numberCheckedCheckbox = 0;

    /**
     *
     *@param  ScoreTwo counter as a global variable
     */
    int scoreTwo = 0;


    /**
     * @param Declaration of variables
     *
     */
    RadioGroup HenryBirthdayGroup;
    RadioGroup CastleConstructionGroup;
    RadioGroup VictoriaGroup;
    RadioGroup VikingGroup;
    RadioGroup ArthurGroup;
    RadioGroup SpitfireGroup;
    RadioGroup HadesGroup;
    RadioGroup AmericanGroup;
    RadioGroup BabylonGroup;
    EditText enterAnswer;
    RadioButton Plastic;
    RadioButton Stone;
    RadioButton Wood;
    RadioButton Iron;
    RadioButton True;
    RadioButton False;
    RadioButton TwentyThree;
    RadioButton ThirtyThree;
    RadioButton FortyThree;
    RadioButton SixtyThree;
    RadioButton Horse;
    RadioButton Foot;
    RadioButton Boat;
    RadioButton Plane;
    RadioButton Dragon;
    RadioButton Crown;
    RadioButton Table;
    RadioButton Sword;
    RadioButton FighterPlane;
    RadioButton Tank;
    RadioButton Explosives;
    RadioButton Gun;
    RadioButton Groundhog;
    RadioButton Independence;
    RadioButton Liberty;
    RadioButton Thanksgiving;
    RadioButton BabylonTrue;
    RadioButton BabylonFalse;
    RadioButton Parthenon;
    RadioButton Clouds;
    RadioButton Underworld;
    RadioButton RomeHades;


    /**
     *
     * @param Checkbox counter as a global variable
     */


    public static final String SCORETWO = "SCORE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_two);




        /**
         *
         * @param Assigns RadioButtons CheckBoxes and EditTexts to corresponding variables
         */
        HenryBirthdayGroup = findViewById(R.id.henry_birthday_group);
        True = findViewById(R.id.True);
        False = findViewById(R.id.False);
        CastleConstructionGroup = findViewById(R.id.castle_construction);
        Plastic = findViewById(R.id.plastic);
        Wood = findViewById(R.id.wood);
        Iron = findViewById(R.id.iron);
        Stone = findViewById(R.id.stone);
        VictoriaGroup = findViewById(R.id.victoria_group);
        TwentyThree =findViewById(R.id.twenty_three);
        ThirtyThree = findViewById(R.id.thirty_three);
        FortyThree = findViewById(R.id.forty_three);
        SixtyThree = findViewById(R.id.sixty_three);
        VikingGroup = findViewById(R.id.viking_group);
        Horse = findViewById(R.id.horse);
        Foot = findViewById(R.id.foot);
        Boat = findViewById(R.id.boat);
        Plane = findViewById(R.id.plane);
        ArthurGroup = findViewById(R.id.arthurGroup);
        Dragon = findViewById(R.id.dragon);
        Crown = findViewById(R.id.crown);
        Table = findViewById(R.id.table);
        Sword = findViewById(R.id.sword);
        SpitfireGroup = findViewById(R.id.spitfireGroup);
        FighterPlane = findViewById(R.id.fighter_plane);
        Tank = findViewById(R.id.tank);
        Explosives = findViewById(R.id.explosives);
        Gun = findViewById(R.id.gun);
        AmericanGroup = findViewById(R.id.americanGroup);
        Groundhog = findViewById(R.id.groundhog);
        Independence = findViewById(R.id.independence);
        Liberty = findViewById(R.id.liberty);
        Thanksgiving = findViewById(R.id.thanksgiving);
        BabylonGroup = findViewById(R.id.babylonGroup);
        BabylonTrue = findViewById(R.id.babylon_true);
        BabylonFalse = findViewById(R.id.babylon_false);
        HadesGroup = findViewById(R.id.hadesGroup);
        Parthenon = findViewById(R.id.parthenon);
        Clouds = findViewById(R.id.clouds);
        Underworld = findViewById(R.id.underworld);
        RomeHades = findViewById(R.id.rome_hades);
        enterAnswer = findViewById(R.id.anagram_answer);

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(SCORETWO, scoreTwo);

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

        scoreTwo = savedInstanceState.getInt(SCORETWO);
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
     * Checks which Henry Birthday Group Radio button is clicked
     */

    public void henryBirthdayGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.True:
                if (checked)
                    // if True is checked
                    break;
            case R.id.False:
                if (checked)
                    // if False is checked
                    break;
        }
    }

    public void castleConstructionGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.plastic:
                if (checked)
                    // if plastic is checked
                    break;
            case R.id.wood:
                if (checked)
                    // if wood is checked
                    break;

            case R.id.iron:
                if (checked)
                    //if iron is checked
                    break;
            case R.id.stone:
                if (checked)
                    //if stone is checked
                    break;
        }
    }

    /**
     * Checks which Victoria Group Radio button is clicked
     */

    public void victoriaGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.twenty_three:
                if (checked)
                    // twenty_three is checked
                    break;
            case R.id.thirty_three:
                if (checked)
                    // thirty_three is checked
                    break;
            case R.id.forty_three:
                if (checked)
                    //forty_three is checked
                    break;
            case R.id.sixty_three:
                if (checked)
                    //upper sixty_three is checked
                    break;

        }
    }

    // Checks which Viking Group Radio button is clicked
    public void vikingGroupClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.horse:
                if (checked)
                    // if horse is checked
                    break;
            case R.id.foot:
                if (checked)
                    //if foot is checked
                    break;
            case R.id.boat:
                if (checked)
                    //if boat is checked
                    break;
            case R.id.plane:
                if (checked)
                    //if plane is checked
                    break;

        }
    }

    // Checks which Arthur Group Radio button is clicked
    public void arthurGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.dragon:
                if (checked)
                    // if dragon clicked
                    break;
            case R.id.crown:
                if (checked)
                    // if crown checked
                    break;

            case R.id.table:
                if (checked)
                    // if table checked
                    break;

            case R.id.sword:
                if (checked)
                    // if sword checked
                    break;
        }
    }

    // Checks which Spitfire Group Radio button is clicked
    public void spitfireGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.fighter_plane:
                if (checked)
                    // if fighter_plane clicked
                    break;
            case R.id.tank:
                if (checked)
                    // if tank checked
                    break;

            case R.id.explosives:
                if (checked)
                    // if explosives checked
                    break;

            case R.id.gun:
                if (checked)
                    // if gun checked
                    break;

        }
    }
    // Checks which American Group Radio button is clicked
    public void americanGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.groundhog:
                if (checked)
                    // if groundhog clicked
                    break;
            case R.id.independence:
                if (checked)
                    // if indepndence checked
                    break;

            case R.id.liberty:
                if (checked)
                    // if liberty checked
                    break;

            case R.id.thanksgiving:
                if (checked)
                    // if thanksgiving checked
                    break;
        }
    }
    // Checks which Babylons Group Radio button is clicked
    public void babylonGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.babylon_true:
                if (checked)
                    // if babylon_true clicked
                    break;
            case R.id.babylon_false:
                if (checked)
                    // if babylon_false checked
                    break;
        }
    }
    // Checks which Hades Group Radio button is clicked
    public void hadesGroupClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which Radio Button was clicked
        switch (view.getId()) {
            case R.id.parthenon:
                if (checked)
                    // if parthenon clicked
                    break;
            case R.id.clouds:
                if (checked)
                    // if clouds checked
                    break;

            case R.id.underworld:
                if (checked)
                    // if washington checked
                    break;

            case R.id.rome_hades:
                if (checked)
                    // if rome_hades checked
                    break;
        }
    }


    //Checks correct answers and adds scores
    public void submitAnswersTwo(View view) {
        if (True.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }

        if (Wood.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }

        if (SixtyThree.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }

        if (Boat.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }

        if (Sword.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }

        if (FighterPlane.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }
        if (Independence.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }
        if (BabylonTrue.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }
        if (Underworld.isChecked()) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }

        //gets you the contents of edit text
        EditText enterAnswer = findViewById(R.id.anagram_answer);
        String inputAnswer = enterAnswer.getText().toString();
        //Checks to see if EditText answer was correct
        if (inputAnswer.equals("Julius")) {
            scoreTwo += 2;
            //adds two points for a correct answer
        }


        /**
         * Pops up score as toast message out of twenty - 2 points for each correct answer.
         */
        if (scoreTwo == 20) {
            Toast.makeText(this, "Congratulations you have scored a maximum twenty points!", Toast.LENGTH_LONG).show();
            scoreTwo = 0;//Zeros score so that extra presses of the submit answers button doesn't multiply score.

        }
        /**
         *  Pops up score if less than twenty
         */
        else {
            Toast.makeText(this, "You have scored " + scoreTwo + " points!", Toast.LENGTH_LONG).show();
            scoreTwo = 0;//Zeros score so that extra presses of the submit answers button doesn't multiply score if score less than maximum.
        }
    }

    //Resets all Check boxes, Radio Buttons and Text input answers and resets integer variables.
    public void reset_quiz_two(View view) {
        scoreTwo = 0;
        //zeros score
        numberCheckedCheckbox = 0;
        //zeros number of check boxes clicked variable.

        //clears radiobuttons
        HenryBirthdayGroup.clearCheck();
        CastleConstructionGroup.clearCheck();
        VictoriaGroup.clearCheck();
        VikingGroup.clearCheck();
        ArthurGroup.clearCheck();
        SpitfireGroup.clearCheck();
        AmericanGroup.clearCheck();
        BabylonGroup.clearCheck();
        HadesGroup.clearCheck();

        //clears edit text field
        enterAnswer.setText("");


    }

    public void homeButtonQuiz2Clicked(View view) {
        // Create a new intent to open the {@link MainActivity}
        Intent homeIntent = new Intent(QuizTwo.this, MainActivity.class);

        // Start the new activity
        startActivity(homeIntent); // opens up the Main Activity/Home page
    }

    public void quizOneButtonQuiz2Clicked(View view) {
        // Create a new intent to open the {@link MainActivity}
        Intent quizOneIntent = new Intent(QuizTwo.this, QuizOne.class);

        // Start the new activity
        startActivity(quizOneIntent); // opens up the Quiz One
    }

    public void quizThreeButtonQuiz2Clicked(View view) {
        // Create a new intent to open the {@link MainActivity}
        Intent quizThreeIntent = new Intent(QuizTwo.this, QuizThree.class);

        // Start the new activity
        startActivity(quizThreeIntent); // opens up Quiz Three
    }

    public void quizFourButtonQuiz2Clicked(View view) {
        // Create a new intent to open the {@link MainActivity}
        Intent quizFourIntent = new Intent(QuizTwo.this, QuizFour.class);

        // Start the new activity
        startActivity(quizFourIntent); // opens up Quiz Three
    }
}

