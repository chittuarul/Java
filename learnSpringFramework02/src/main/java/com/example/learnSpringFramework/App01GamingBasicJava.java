package com.example.learnSpringFramework;

import com.example.learnSpringFramework.game.GameRunner;
import com.example.learnSpringFramework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var marioGame = new MarioGame();
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner=new GameRunner(game);
		gameRunner.run();
		}

}
