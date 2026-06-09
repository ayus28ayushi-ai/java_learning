package com.example.spring_framework_basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_framework_basics.game.GameRunner;
import com.example.spring_framework_basics.game.GamingConsole;

public class App01GameBasicJava {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GameBasicConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();

		}
//context.close() will automatically happen
		
		 
		


	}

}
