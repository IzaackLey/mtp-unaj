
public class CurrentConditionsDisplay  implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData; //esta para poder registrase y desregistrarse
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditions: "+temperature +" C celsius and "+humidity+" % humidity");
		
	}
}
