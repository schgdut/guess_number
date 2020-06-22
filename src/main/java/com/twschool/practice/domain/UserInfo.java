package com.twschool.practice.domain;


public class UserInfo {
    private String id;
    private GuessNumberGame guessNumberGame;
    private int winCount;
    private int score;

    public UserInfo(String id, GuessNumberGame guessNumberGame, int winCount,int score) {
        this.id = id;
        this.guessNumberGame = guessNumberGame;
        this.winCount = winCount;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GuessNumberGame getGuessNumberGame() {
        return guessNumberGame;
    }

    public void setGuessNumberGame(GuessNumberGame guessNumberGame) {
        this.guessNumberGame = guessNumberGame;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public void addWinCount() {
        this.winCount++;
    }

    public void initWinCount() {
        this.winCount = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }
}