package observerAcopladoFuerte;

import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;
	private float temperature;
	private float humidity;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(Subject obj) {
	    if (obj instanceof WeatherData) {
	        WeatherData weatherData = (WeatherData)obj;
	        this.temperature = weatherData.getTemperature();
	        this.humidity = weatherData.getHumidity();
	        display();
	    }
	    if (obj instanceof AnemometerData) {
	    	AnemometerData anemometerData = (AnemometerData)obj;
	        display();
	    }

	}
	
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
