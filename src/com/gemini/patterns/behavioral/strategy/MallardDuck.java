package com.gemini.patterns.behavioral.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Squeak();
	}
	
	public void display(){
		System.out.println("Duck--> MallardDuck");	
	}
}
