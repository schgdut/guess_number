package com.twschool.practice.domain;


public class UserInfo {
    private String id;
    private GuessNumberGame guessNumberGame;


    public UserInfo(String id, GuessNumberGame guessNumberGame, int winCount,int score) {
        this.id = id;
        this.guessNumberGame = guessNumberGame;

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


}