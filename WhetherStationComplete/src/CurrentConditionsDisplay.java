	
public class CurrentConditionsDisplay implements WeatherObserver, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherDataSubject weatherData;
	
	public CurrentConditionsDisplay(WeatherDataSubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
