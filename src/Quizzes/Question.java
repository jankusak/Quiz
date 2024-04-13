package Quizzes;


import java.util.List;


public class Question {

    private QuestionType questionType;
    private String questionText;
    private List<Answers> answer;

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

    public boolean checkAnswer(String playerAnswer) {
        boolean isSame = true;
        String[] stringArray = playerAnswer.trim().split("\\s+");


        for (int i = 0; i < stringArray.length; i++) {

            int[] playerNumbers = new int[stringArray.length];
            playerNumbers[i] = Integer.parseInt(stringArray[i]);


            for (int j = 0; j < playerNumbers.length; j++) {
                try {
                    if (!this.answer.get(j).isValid()) {
                        isSame = false;
                        System.out.println("You have not entered a answer number.");
                        break;
                    }

                } catch (Exception e) {
                    isSame = false;
                    System.out.println("Invalid input. Insert a answer number(s).");
                }
            }
        }
        return isSame;

    }

}
