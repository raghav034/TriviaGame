package use_case.select_answer;

import java.time.Duration;
import java.util.ArrayList;

public class SelectAnswerOutputData {
    private int playerPoints;
    private int compPoints;
    private ArrayList<String> questions;
    private int answer;
    private Duration timeLeft;
    private boolean correctness;

    public SelectAnswerOutputData(int playerPoints, int compPoints, ArrayList<String> questions, int answer,
                            Duration timeLeft, boolean correctness) {
        this.playerPoints = playerPoints;
        this.compPoints = compPoints;
        this.questions = questions;
        this.answer = answer;
        this.timeLeft = timeLeft;
        this.correctness = correctness;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getCompPoints() {
        return compPoints;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public int getAnswer() {
        return answer;
    }

    public Duration getTimeLeft() {
        return timeLeft;
    }

    public boolean getCorrectness() {
        return correctness;
    }
}
