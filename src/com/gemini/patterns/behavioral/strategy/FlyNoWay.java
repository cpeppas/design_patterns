package com.gemini.patterns.behavioral.strategy;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("FlyBehaviour--> No fly");			
	}

}
