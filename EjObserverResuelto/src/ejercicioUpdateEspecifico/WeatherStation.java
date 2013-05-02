package ejercicioUpdateEspecifico;

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		TankData tankData = new TankData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		GenericDataDisplay genericDataDisplay = new GenericDataDisplay(weatherData, tankData);
				
		weatherData.setMeasurements(80, 65, 30.4f);
		tankData.setMeasurements(67,true,false);
	}
}
