package com.example.onlinequiz;

public class QuestionData {
    private int id;
    private String question, choice1, choice2, choice3, choice4, answer;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getChoice1() { return choice1; }
    public void setChoice1(String choice1) { this.choice1 = choice1; }

    public String getChoice2() { return choice2; }
    public void setChoice2(String choice2) { this.choice2 = choice2; }

    public String getChoice3() { return choice3; }
    public void setChoice3(String choice3) { this.choice3 = choice3; }

    public String getChoice4() { return choice4; }
    public void setChoice4(String choice4) { this.choice4 = choice4; }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
}

