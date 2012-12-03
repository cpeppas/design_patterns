package com.gemini.patterns.structural.decorator;

public class MochaCondiment implements Condiment {

	@Override
	public double cost(double value) {
		return value;
	}
	
}
