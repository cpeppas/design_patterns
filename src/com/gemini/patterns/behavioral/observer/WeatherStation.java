package com.gemini.patterns.behavioral.observer;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay a = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(4, 30, 45.1f);
	}
}
