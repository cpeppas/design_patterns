package com.gemini.patterns.behavioral.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	//This is the info tha only Subject object knows!
	private ArrayList<Observer> observers;

	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {		
		int i = observers.indexOf(o);
		if(i!=-1){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers){
			o.update(temp, humidity, pressure);
		}
		
	}
	
	//Change state of the Subject
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	/*public void measurementsChanged(){
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
		//What's wrong?
		//Area of Change - Should be encapsulated - Interface to talk to the displays
		//By coding to Concrete implementations - no way to add other displays
		//without making changes to the code
		currentConditionsDisplay.update(temp,humidity,pressure);
		statisticsDisplay.update(temp,humidity,pressure);
		forecastDisplay.update(temp,humidity,pressure);
	}*/
}
