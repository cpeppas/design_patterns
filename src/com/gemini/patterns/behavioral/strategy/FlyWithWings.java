package com.gemini.patterns.behavioral.strategy;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("FlyBehaviour--> Flying...");			
	}

}
