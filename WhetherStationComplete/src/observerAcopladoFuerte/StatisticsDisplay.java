package observerAcopladoFuerte;

import java.util.*;

public class StatisticsDisplay extends Observer implements DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	private float temperature;
	private float humidity;

	public StatisticsDisplay(WeatherData weatherData) {
		super(weatherData);
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
