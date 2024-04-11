import Quizzes.*;

import java.util.ArrayList;
import java.util.List;

import static Quizzes.GreetPlayer.greetPlayer;

public class Main {
    public static void main(String[] args) {
        greetPlayer();

//
        Question question1 = new Question("What is the largest island in the world?",
                QuestionType.SINGLE, List.of("Green", "Iceland"), List.of(("Greenland")));
//        question1.questionPrint();

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question1);
        questions.add(new Question("What is the largest island in the world?",
                QuestionType.SINGLE, List.of("Green", "Iceland"), List.of(("Greenland"))));

        question1 = new Question("What is the largest icecream in the world?",
                QuestionType.SINGLE, List.of("Banana", "Kiwi", "Coconut"), List.of(("Banana")));
        questions.add(question1);

        for (Question question : questions) {
            question.questionPrint();
        }
    }
}