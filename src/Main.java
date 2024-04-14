import Quizzes.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Answers> answers1 = List.of(new Answers(1, "Greenland", true),
                new Answers(2, "Iceland", false));
        Question question1 = new Question("What is the largest island in the world? Choose number.", QuestionType.SINGLE, answers1);

        List<Answers> answers2 = List.of(new Answers(1, "India", true),
                new Answers(2, "Brazil", false),
                new Answers(3, "China", false));
        Question question2 = new Question("Which country has the largest population? Choose number.", QuestionType.SINGLE, answers2);

        List<Answers> answers3 = List.of(new Answers(1, "Niger", true),
                new Answers(2, "Egypt", true), new Answers(3, "Syria", false),
                new Answers(4, "Pakistan", false));
        Question question3 = new Question("Which country is in Africa? Choose number.", QuestionType.MULTIPLE, answers3);

        List<Question> questionList = List.of(question1, question2, question3);

        Quiz geographyQuiz = new Quiz("Geography quiz", questionList);
        geographyQuiz.startQuiz(questionList);
    }
}

