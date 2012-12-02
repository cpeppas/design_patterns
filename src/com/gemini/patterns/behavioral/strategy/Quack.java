package com.gemini.patterns.behavioral.strategy;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("QuackBehaviour--> Quack quack!");		
	}
}
