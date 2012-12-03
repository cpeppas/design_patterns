package com.gemini.patterns.structural.decorator;

public abstract class Beverage {
	
	
	/*
	 * REASONS FOR CHANGE
	 * 
	 * a) new condiments
	 * b) price of condiments change
	 * c) All condiments cannot not apply to all the beverages 
	 * 
	 * SOLUTION: Decorate it!
	 * */
	
	public String description;

	private boolean milk;
	private boolean soy;
	
	private static final int $MILK = 5;
	private static final int $SOY = 3;
	
	
	public void setMilk(boolean milk){
		this.milk = milk;
	}

	public void setSoy(boolean soy){
		this.soy = soy;
	}
	
	public boolean hasMilk(){
		return this.milk;
	}

	public boolean hasSoy(){
		return this.soy;
	}
		
	public double cost(){
		double cost = 0;
		if(hasMilk()){
			cost += this.$MILK;
		}

		if(hasSoy()){
			cost += this.$SOY;
		}
		
		return cost;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
}
