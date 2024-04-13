package Quizzes;

public class Answers {

    private int answerNumber;
    private String answerText;
    private boolean isValid;

    public Answers(int answerNumber, String answer, boolean isValid) {
        this.answerNumber = answerNumber;
        this.answerText = answer;
        this.isValid = isValid;
    }

    boolean isValid() {
        return isValid;
    }

    public String getAnswerText() {
        return answerText;
    }

    public int getAnswerNumber() {
        return  answerNumber;
    }



}