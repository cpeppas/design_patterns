package com.gemini.patterns.strategy;

public class StrategyPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		duck.setFlyBehaviour(new FlyNoWay());
		duck.performFly();

		

	}
}
