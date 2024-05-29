package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btnNextQuestion;
    private TextView questionText;
    private int currentQuestion = 0;
    private String[] questions = {"Какой самый большой континент?", "Кто был первым человеком в космосе?", "Сколько лет длилась Великая Отечественная война?"};
    private String[] answers = {"Азия", "Юрий Гагарин", "4 года"};
    private boolean[] isAnswered = new boolean[questions.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnNextQuestion = findViewById(R.id.btnNextQuestion);
        questionText = findViewById(R.id.questionText);
        showQuestion();

        btnNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isAnswered[currentQuestion]) {
                    showQuestion();
                } else {
                    currentQuestion++;
                    if (currentQuestion < questions.length) {
                        showQuestion();
                    } else {

                        questionText.setText("Вы выиграли!");
                    }
                }
            }
        });
    }

    private void showQuestion() {
        questionText.setText(questions[currentQuestion]);
        isAnswered[currentQuestion] = false;
    }
}
