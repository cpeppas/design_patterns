package com.gemini.patterns.behavioral.strategy;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("QuackBehaviour--> Muted!");
	}
}
