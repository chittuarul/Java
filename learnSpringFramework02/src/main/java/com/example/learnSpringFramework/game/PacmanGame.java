package com.example.learnSpringFramework.game;

public class PacmanGame implements GamingConsole{
	public void up()
	{
		System.out.println("move up");
	}
	public void down()
	{
		System.out.println("move down");
	}
	public void right()
	{
		System.out.println("move front");
	}
	public void left()
	{
		System.out.println("move back");
	}
}
