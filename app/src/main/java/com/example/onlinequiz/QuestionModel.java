package com.example.onlinequiz;

public class QuestionModel {
    private String question, choice1, choice2, choice3, choice4;

    public QuestionModel(String question, String choice1, String choice2, String choice3, String choice4) {
        this.question = question;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }

    public String getQuestion() { return question; }
    public String getChoice1() { return choice1; }
    public String getChoice2() { return choice2; }
    public String getChoice3() { return choice3; }
    public String getChoice4() { return choice4; }
}

