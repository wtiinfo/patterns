package patterns.wtiinfo.designs.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class WeatherForecast implements Subject {

	private int temperature;
	private Set<Observer> observers = new LinkedHashSet<>();
	
	//Singleton ////////////////////////////
	private static WeatherForecast instance;
	
	private WeatherForecast() {}
	
	public static WeatherForecast getInstance() {
		if(instance == null) {
			instance = new WeatherForecast();
		}
		return instance;
	}
	//Singleton ////////////////////////////

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unresisterObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
	
}
