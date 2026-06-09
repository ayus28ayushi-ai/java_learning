package com.example.spring_framework_basics.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole game;

	public GameRunner(@Qualifier("pac") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Game running: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
