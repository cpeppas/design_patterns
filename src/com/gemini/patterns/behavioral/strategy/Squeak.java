package com.gemini.patterns.behavioral.strategy;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("QuackBehaviour--> Squeak");		
	}
}
