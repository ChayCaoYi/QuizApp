package com.example.android.quizapp;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;

import static android.R.attr.id;
import static android.R.id.edit;
import static android.R.id.inputExtractEditText;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static com.example.android.quizapp.R.id.editText_View;

public class MainActivity extends AppCompatActivity {
    EditText Question5 = null;
    int score = 0;
    EditText Q5_ans = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        Q5_ans = (EditText) super.findViewById(R.id.editText_View);
        boolean Q5_ans_checked = (Q5_ans.getText().toString().equals("Study"));
        if (Q5_ans_checked) {
            score += 10;
        }
        if (score < 25) {
            displayScore(score);
            Toast.makeText(this, R.string.quote1, Toast.LENGTH_SHORT).show();
        } else {
            displayScore(score);
            Toast.makeText(this, R.string.quote2, Toast.LENGTH_SHORT).show();
        }
        //grading logic for Question No. 5.
        Question5 = (EditText) super.findViewById(editText_View);
    }

    public void clickedQuestion1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer1:
                if (checked)
                    // answer1 is checked
                    score += 5;
                break;
            case R.id.answer2:
                if (checked)
                    // answer2 is checked
                    score += 3;
                break;
            case R.id.answer3:
                if (checked)
                    // answer3 is checked
                    score += 1;
                break;
        }
    }

    public void clickedQuestion2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer4:
                if (checked)
                    // answer1 is checked
                    score += 7;
                break;
            case R.id.answer5:
                if (checked)
                    // answer2 is checked
                    score += 5;
                break;
            case R.id.answer6:
                if (checked)
                    // answer3 is checked
                    score += 3;
                break;
            case R.id.answer7:
                if (checked)
                    // answer3 is checked
                    score += 1;
                break;
        }
    }

    public void clickedQuestion3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer8:
                if (checked)
                    // answer1 is checked
                    score += 1;
                break;
            case R.id.answer9:
                if (checked)
                    // answer2 is checked
                    score += 5;
                break;
            case R.id.answer10:
                if (checked)
                    // answer3 is checked
                    score += 3;
                break;
            case R.id.answer11:
                if (checked)
                    // answer3 is checked
                    score += 7;
                break;
        }
    }

    public void clickedQuestion4(View view) {
        // Is the button now checked?
        CheckBox answer1CheckBox = (CheckBox) findViewById(R.id.answer12);
        boolean isCheckedanswer1 = answer1CheckBox.isChecked();
        CheckBox question2CheckBox = (CheckBox) findViewById(R.id.answer13);
        boolean isCheckedanswer2 = question2CheckBox.isChecked();
        CheckBox question3CheckBox = (CheckBox) findViewById(R.id.answer14);
        boolean isCheckedanswer3 = question3CheckBox.isChecked();
        CheckBox question4CheckBox = (CheckBox) findViewById(R.id.answer15);
        boolean isCheckedanswer4 = question4CheckBox.isChecked();
        // Check which checkBox was clicked
        if (isCheckedanswer1) {
            score += 1;
        }
        if (isCheckedanswer2) {
            score += 3;
        }
        if (isCheckedanswer3) {
            score += 5;
        }
        if (isCheckedanswer4) {
            score += 7;
        }
    }

    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.result1);
        scoreView.setText(String.valueOf(score));
    }
}