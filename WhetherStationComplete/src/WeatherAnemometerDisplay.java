
public class WeatherAnemometerDisplay implements DisplayElement, WeatherObserver, AnemometerObserver {
	AnemometerData anemometerData; 
	WeatherData weatherData;
	float windSpeed = 0;
	float windDirecetion = 0;
	float temp = 0; 
	float humidity=0; 
	float pressure=0;
	
	public WeatherAnemometerDisplay(AnemometerData anemometerData, WeatherData weatherData){
		this.anemometerData = anemometerData;
		this.weatherData = weatherData;
		anemometerData.registerObserver(this);
		weatherData.registerObserver(this);
	}
	
	public void update(float windSpeed, float windDirecetion) {
		this.windDirecetion = windDirecetion;
		this.windSpeed = windSpeed;
		display();
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println(
				"All variables display: temperature = " + temp + "F°"
				+ " / humidity = " + humidity  + " %"
				+ " / pressure = " + pressure + " hectopascales"
				+ " / windSpeed = " + windSpeed + " Km/h"
				+ " / windDirecetion = " + windDirecetion + "  degrees"
		);
	}

}
