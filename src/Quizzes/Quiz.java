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

    private void pointCounter(int answerPoints) {
        points = points + answerPoints;
    }

    public void startQuiz(List<Question> questionsList) {
        System.out.println("Welcome to " + name);
        System.out.println("This quiz has " + questionsList.size() + " questions.");
        System.out.println();

        for (Question question : questions) {

            question.printQuestion();

            String playerAnswer = scanner.nextLine();

            question.checkAnswer(playerAnswer, question);

            this.pointCounter(question.getAnswerPoints());

            System.out.println("Right answer: ");

            for (Answers answers : question.getAnswer()) {
                question.printRightAnswer(answers);
            }

            System.out.println();

        }
        System.out.println();
        System.out.println("The end. You earned " + this.points + " points");
    }

}






