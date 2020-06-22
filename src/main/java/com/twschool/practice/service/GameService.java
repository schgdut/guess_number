package com.twschool.practice.service;


import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;

    }
    public String guess(String userAnserString){
        GuessNumberGame guessNumberGame = gameRepository.find();
        return guessNumberGame.guess(userAnserString);
    }








}