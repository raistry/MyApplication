package com.example.myapplication;

import java.util.*;

public class MainActivity2 {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать!");
        System.out.println("Ваш начальный бюджет: $0.");

        while (currentQuestionIndex < QUESTIONS.length) {
            System.out.println("Вопрос " + (currentQuestionIndex + 1) + ": " + QUESTIONS[currentQuestionIndex]);
            System.out.println("Ваш выйгрыш: $" + currentPrizeMoney);

            System.out.println("Введите ответ:");
            String answer = scanner.nextLine();

            if (answer.equals(ANSWERS[currentQuestionIndex])) {
                System.out.println("Верно! Вы молодцы!");
                currentPrizeMoney += PRIZE_MONEY[currentQuestionIndex];
                currentQuestionIndex++;
            } else {
                System.out.println("К сожалению неверно.");
                System.out.println("Игра окончена. Ваш выйгрыш: $" + currentPrizeMoney);
                break;
            }
        }

        if (currentQuestionIndex == QUESTIONS.length) {
            System.out.println("Поздравляю! Вы выиграли 1 000 000 долларов! Вы прошли игру, ждите продолжения!");
        }
    }
}