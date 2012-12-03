package com.gemini.patterns.structural.decorator;

public class Espresso implements BeverageComponent{
	
	private static final double COST = 10;
	
	public Espresso(){
		//description = "this is a new espresso";
	}

	@Override
	public double cost() {
		return COST;
	}

	@Override
	public String getDescription() {
		return "this is a new espresso";
	}
}
