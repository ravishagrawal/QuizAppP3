package com.example.android.quizappp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    /**
     * This method is called when the order button is clicked.
     */
    private RadioGroup radioSexGroup;
    private RadioGroup radioQ4Group;
    private RadioButton radioSexButton;
    private RadioButton radioQ4Button;
    private Button btnDisplay;
    int score;


    public void onCheckboxClicked(View view) {


        // Question 1 Ionic/covalent

        CheckBox question1a, question1b, question1c, question1d;

        question1a= (CheckBox) findViewById(R.id.a1_1_checkbox);
        question1b= (CheckBox) findViewById(R.id.a1_2_checkbox);
        question1c= (CheckBox) findViewById(R.id.a1_3_checkbox);
        question1d= (CheckBox) findViewById(R.id.a1_4_checkbox);

        if (question1a.isChecked() && question1b.isChecked() && question1d.isChecked() && !question1c.isChecked()) {
            score++;
            Log.v("MainActivity", "Q1 Score:" + Integer.toString(score));
        }
         else {
            score=score;
        }

    }

    public void addListenerOnButton() {

        final RadioButton genderMale, genderFemale, genderRays, genderWaves;

        genderMale = (RadioButton) findViewById(R.id.genderMale);
        genderFemale = (RadioButton) findViewById(R.id.genderFemale);
        genderRays = (RadioButton) findViewById(R.id.genderRays);
        genderWaves = (RadioButton) findViewById(R.id.genderWaves);

        radioSexGroup = (RadioGroup) findViewById(R.id.radioGender);
        radioQ4Group = (RadioGroup) findViewById(R.id.radioq4);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioSexGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioSexButton = (RadioButton) findViewById(selectedId);

                // if else loop radio button
                if(genderMale.isChecked())
                {
                    // is checked
                    score= score+1;
                    Toast.makeText(MainActivity.this,
                            "Score +1", Toast.LENGTH_SHORT).show();
                    Log.v("MainActivity","Radio Score:" +  Integer.toString(score));
                }
                else
                {
                    // not checked
                    Toast.makeText(MainActivity.this,
                            "Response Recorded", Toast.LENGTH_SHORT).show();
                }

                int selectId = radioQ4Group.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioQ4Button = (RadioButton) findViewById(selectedId);

                // if else loop radio button
                if(genderWaves.isChecked())
                {
                    // is checked
                    score= score+1;
                    Toast.makeText(MainActivity.this,
                            "Score +1", Toast.LENGTH_SHORT).show();
                    Log.v("MainActivity","Radio Score waves:" +  Integer.toString(score));
                }
                else
                {
                    // not checked
                    Toast.makeText(MainActivity.this,
                            "Response Recorded", Toast.LENGTH_SHORT).show();
                }


            }

        });

    }

    public void submit (View view) {

        EditText neutronDisplay = (EditText) findViewById(R.id.neutron);
        String neutronResult = neutronDisplay.getText().toString();
        neutronDisplay.setText(neutronResult);

        String sentence = neutronResult;
        String search = "Neutron";

        if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {

            score = score + 1;
            Toast.makeText(MainActivity.this,
                    "Score +1", Toast.LENGTH_SHORT).show();
            Log.v("MainActivity", "Input Score:" + Integer.toString(score));

        } else {

            Toast.makeText(MainActivity.this,
                    "Try Again", Toast.LENGTH_SHORT).show();

        }
    }

    public void getScore (View view) {

        EditText nameDisplay = (EditText)findViewById(R.id.name) ;
        String nameResult = nameDisplay.getText().toString();
        nameDisplay.setText(nameResult);


        String quizMessage= scoreSummary(score,nameResult);
        Toast.makeText(MainActivity.this,
                quizMessage, Toast.LENGTH_SHORT).show();

    }

    private String scoreSummary(int score, String nameInput) {
        String quizMessage= nameInput;
        quizMessage= quizMessage + " your total score is " + score;
        return quizMessage;

    }
}