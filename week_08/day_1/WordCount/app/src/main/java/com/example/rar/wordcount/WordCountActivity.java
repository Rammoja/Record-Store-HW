package com.example.rar.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button countButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
    }


    public void onCountButtonClicked(View button){

        String question = questionEditText.getText().toString();


        WordCount wordCount = new wordCount(new wordCount());
        String answer = wordCount.();
        answerText.setText(answer);
}
