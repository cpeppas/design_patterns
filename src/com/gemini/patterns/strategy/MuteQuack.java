package com.gemini.patterns.strategy;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("QuackBehaviour--> Muted!");
	}
}
