package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.repository.GameRepository;

import org.junit.Test;
import org.mockito.Mockito;

public class GameServiceTest {
    @Test
    public void should_return_result_when_guess_number(){
        GameRepository gameRepository = Mockito.mock(GameRepository.class);
        GuessNumberGame guessNumberGame  = Mockito.mock(GuessNumberGame.class);
        Mockito.when(gameRepository.find()).thenReturn(guessNumberGame);
        GameService gameService = new GameService(gameRepository);

    }
}
