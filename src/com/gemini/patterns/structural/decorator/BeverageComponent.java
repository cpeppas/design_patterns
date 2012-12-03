package com.gemini.patterns.structural.decorator;

public interface BeverageComponent {
	
	
	public abstract double cost();
	public abstract String getDescription();

	/*public String description = "The unknown beverage";
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}*/
}
