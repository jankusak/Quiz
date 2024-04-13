package Quizzes;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    private int points;
    private String name;
    private List<Question> questions;

    public Quiz(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
        this.points = 0;
    }

    Scanner scanner = new Scanner(System.in);

    private void pointCounter() {
        points++;
    }

    public void startQuiz(List<Question> questionsList) {
        System.out.println("Welcome to geography quiz");
        System.out.println("This uiz has " + questionsList.size() + " questions");
//
        for (Question question : questions) {
            question.printQuestion();
            String playerAnswer = scanner.nextLine();
            question.checkAnswer(playerAnswer);

            if (question.checkAnswer(playerAnswer)) {
                this.pointCounter();
            }
        }
        System.out.println("The end. You earned " + this.points + " points");
    }

}






