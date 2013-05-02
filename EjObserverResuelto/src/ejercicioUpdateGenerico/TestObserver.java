package ejercicioUpdateGenerico;

import java.util.*;

public class TestObserver {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		TankData tankData = new TankData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		GenericDataDisplay genericDataDisplay = new GenericDataDisplay(weatherData, tankData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		tankData.setMeasurements(50, true, false);
		tankData.setMeasurements(150, true, false);
		
	}
}
