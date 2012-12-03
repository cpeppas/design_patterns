package com.gemini.patterns.structural.decorator;

public class MilkCondiment extends CondimentDecorator{
	
	BeverageComponent beverage;
	
	public MilkCondiment(BeverageComponent beverage){
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " Milk";
	}

	public double cost() {
		return beverage.cost() + .20;
	}


}
