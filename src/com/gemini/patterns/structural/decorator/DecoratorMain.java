package com.gemini.patterns.structural.decorator;

public class DecoratorMain {
	public static void main(String args[]){
		BeverageComponent espresso = new Espresso();
		BeverageComponent milk1 = new MilkCondiment(espresso);
		BeverageComponent milk2 = new MilkCondiment(milk1);

		
		System.out.println(milk2.getDescription());
		System.out.println(milk2.cost());
double t = 10 +.2 ;
		System.out.println("Test:"+ t);

	}
}
