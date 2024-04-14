package Quizzes;

import java.util.HashSet;
import java.util.List;

public class Question {

    private QuestionType questionType;
    private String questionText;
    private List<Answers> answer;
    private int answerPoints;

    public int getAnswerPoints() {
        return answerPoints;
    }

    public Question(String questionText, QuestionType questionType, List<Answers> answers) {
        this.questionText = questionText;
        this.questionType = questionType;
        this.answer = answers;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Answers> getAnswer() {
        return answer;
    }

    public void printQuestion() {
        System.out.println(questionText + " Question type: " + questionType);
        for (int i = 0; i < answer.size(); i++) {
            System.out.println((i + 1) + ". " + this.answer.get(i).getAnswerText());
        }
    }

    public int checkAnswer(String playerAnswer, Question question) {
        boolean isSame = true;
        answerPoints = 0;
        String[] stringArray = playerAnswer.trim().split("\\s+");
        HashSet<Integer> rightAnswers = new HashSet<>();

        for (String s : stringArray) {
            try {
                int playerNumbers = Integer.parseInt(s) - 1;

                if (stringArray.length >= 2 && questionType == QuestionType.SINGLE) {
                    System.out.println("Invalid input. The question has only one answer");
                    isSame = false;
                    break;
                }
                if (!this.answer.get(playerNumbers).getIsValid()) {
                    isSame = false;
                    break;
                }
                if (isSame) {
                    if (!(rightAnswers.contains(playerNumbers))) {
                        rightAnswers.add(playerNumbers);
                        answerPoints++;
                    }
                }
            } catch (Exception e) {
                isSame = false;
                System.out.println("Invalid input.");
                break;
            }
        }
        return answerPoints;
    }

    public void printRightAnswer(Answers answers) {
        for (int i = 0; i < answer.size(); i++) {
            if (answers.getIsValid()) {
                System.out.println(answers.getAnswerText());
                break;
            }
        }
    }
}