package com.gemini.patterns.strategy;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("FlyBehaviour--> Flying...");			
	}

}
