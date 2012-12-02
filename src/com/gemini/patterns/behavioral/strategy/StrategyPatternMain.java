package com.gemini.patterns.behavioral.strategy;

public class StrategyPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck duck = new DecoyDuck();
		duck.display();
		duck.setFlyBehaviour(new FlyNoWay());
		duck.performFly();
		duck.setQuackBehaviour(new MuteQuack());
		duck.performQuack();
		
		duck.setFlyBehaviour(new FlyNoWay());
		//duck.performFly();

		

	}
}
