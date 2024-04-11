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


    public void questionPrint(String questionText, QuestionType type, List<String> possibilities) {
        System.out.println(questionText);

    }


    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public List<String> getPossibilities() {
        return possibilities;
    }

    public void setPossibilities(List<String> possibilities) {
        this.possibilities = possibilities;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
