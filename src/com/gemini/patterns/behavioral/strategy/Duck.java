package com.gemini.patterns.behavioral.strategy;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public abstract void display();

	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
		
	public void setFlyBehaviour(FlyBehaviour fb ){
		flyBehaviour = fb; 		
	}
	
	public void setQuackBehaviour(QuackBehaviour qb){
		quackBehaviour = qb;		
	}	
}
