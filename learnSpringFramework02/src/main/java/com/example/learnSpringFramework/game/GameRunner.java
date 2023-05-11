package com.example.learnSpringFramework.game;

public class GameRunner {
	//MarioGame game;
	//private SuperContraGame game;
	GamingConsole game;
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running game : " +game);
		game.right();
		game.left();
		game.up();
		game.down();
		
	}

}
