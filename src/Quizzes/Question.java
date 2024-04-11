package Quizzes;

import java.util.List;

public class Question {

    private QuestionType questionType;
    private String questionText;

    private List<String> possibilities;

    private List<String> answers;


    public Question(String questionText,
                    QuestionType questionType,
                    List<String> possibilities,
                    List<String> answers) {
        this.questionText = questionText;
        this.possibilities = possibilities;
        this.answers = answers;
        this.questionType = questionType;
    }

    public void questionPrint() {

        System.out.println(questionText + " Question type: " + questionType);
        int count = 0;
        for (String possibility : possibilities) {
            count++;
            System.out.println(count + ". " + possibility);
        }

    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public List<String> getPossibilities() {
        return possibilities;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }


}
