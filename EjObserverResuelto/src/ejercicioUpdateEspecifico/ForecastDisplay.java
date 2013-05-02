package ejercicioUpdateEspecifico;

import java.util.*;

public class ForecastDisplay implements WeatherDataObserver, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherDataSubject weatherDataSubject;
	
	
	public ForecastDisplay(WeatherDataSubject weatherDataSubject) {
	this.weatherDataSubject = weatherDataSubject;
	weatherDataSubject.registerObserver(this);
}

	
	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
