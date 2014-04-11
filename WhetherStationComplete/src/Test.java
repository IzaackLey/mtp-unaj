import java.util.*;

public class Test {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		AnemometerData anemometerData = new AnemometerData();
		
		WeatherAnemometerDisplay weatherAnemometerDisplay = new WeatherAnemometerDisplay(anemometerData, weatherData);
		
		weatherData.setMeasurements(80, 65, 1050);
		anemometerData.setMeasurements(40, 87);
		
		weatherData.setMeasurements(82, 70, 1020);

	}
}
