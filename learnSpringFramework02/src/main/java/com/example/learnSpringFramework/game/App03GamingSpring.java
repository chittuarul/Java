package com.example.learnSpringFramework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learnSpringFramework.game.GameRunner;
import com.example.learnSpringFramework.game.PacmanGame;

public class App03GamingSpring {

	public static void main(String[] args) {
		
			try(var context = 
					new AnnotationConfigApplicationContext(
							GamingConfiguration.class))
				{
				context.getBean(GamingConsole.class).up();
				context.getBean(GameRunner.class).run();
				};
				
		
		// TODO Auto-generated method stub
		//var marioGame = new MarioGame();
		//var game = new MarioGame();
		//var game = new SuperContraGame();
//		var game = new PacmanGame();
//		var gameRunner=new GameRunner(game);
//		gameRunner.run();
		}

}
