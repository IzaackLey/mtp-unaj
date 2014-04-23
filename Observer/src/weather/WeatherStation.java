package weather;

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		WeatherData weatherData2 = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		CurrentConditionsDisplay currentConditionsDisplay2 = new CurrentConditionsDisplay(weatherData2);

		//
		//weatherData.setMeasurements(80, 65, 30.4f);
		weatherData2.setMeasurements(30, 80, 1010);

//		weatherData.setMeasurements(82, 70, 29.2f);
//		weatherData.setMeasurements(78, 90, 29.2f);
//		
//		weatherData.removeObserver(currentDisplay);
//		
//		weatherData.setMeasurements(80, 65, 30.4f);
//		weatherData.setMeasurements(82, 70, 29.2f);
//		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
