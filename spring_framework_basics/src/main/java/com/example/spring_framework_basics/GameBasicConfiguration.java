package com.example.spring_framework_basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.spring_framework_basics.game.GameRunner;
import com.example.spring_framework_basics.game.GamingConsole;
import com.example.spring_framework_basics.game.MarioGame;
import com.example.spring_framework_basics.game.PacManGame;
import com.example.spring_framework_basics.game.SuperContraGame;

@Configuration
public class GameBasicConfiguration {
	@Bean
	@Qualifier("mario")
	public GamingConsole marioGame() {
		var game = new MarioGame();
		return game;
	}

	@Bean
	@Qualifier("super")
	public GamingConsole superContraGame() {
		var game = new SuperContraGame();
		return game;
	}

	@Bean
	@Primary
	public GamingConsole pacManGame() {
		var game = new PacManGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(@Qualifier("super") GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
