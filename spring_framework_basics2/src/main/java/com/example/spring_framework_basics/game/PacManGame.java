package com.example.spring_framework_basics.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pac")
public class PacManGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Jump and hang!");
	}

	@Override
	public void down() {
		System.out.println("wait!");
	}

	@Override
	public void left() {
		System.out.println("Jump Left!");
	}

	@Override
	public void right() {
		System.out.println("Jump right!");
	}
}
