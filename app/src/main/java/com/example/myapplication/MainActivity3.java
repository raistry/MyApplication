package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView question = findViewById(R.id.questionText);
        question.setText(QUESTIONS[currentQuestionIndex]);

        Button button1 = findViewById(R.id.button10);
        button1.setText(ANSWERS[currentQuestionIndex]);

        Button button2 = findViewById(R.id.button9);
        button2.setText(ANSWERS[currentQuestionIndex]);

        Button button3 = findViewById(R.id.button11);
        button3.setText(ANSWERS[currentQuestionIndex]);

        Button button4 = findViewById(R.id.button12);
        button4.setText(ANSWERS[currentQuestionIndex]);
    }
    private static final String[] QUESTIONS = {
            "Кто является нынешним президентом Соединенных Штатов?",
            "Столица Франции?",
            "Какой океан самый большой в мире?",
            "Кто нарисовал Мону Лизу?",
            "Какое химическое обозначение золота в таблице Менделеева?"
    };

    private static final String[] ANSWERS = {
            "Джо Байден",
            "Париж",
            "Тихий океан",
            "Леонардо да Винчи",
            "Au"
    };

    private static final int[] PRIZE_MONEY = {
            100,
            200,
            300,
            500,
            1000
    };

    private static int currentQuestionIndex = 0;
    private static int currentPrizeMoney = 0;


}