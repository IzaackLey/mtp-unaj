package ejercicioUpdateGenerico;

public class GenericDataDisplay  implements Observer, DisplayElement {
	private int nivel;
	private boolean lleno;
	private boolean vacio;
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	private Subject tankData;
	
	public GenericDataDisplay(WeatherData weatherData, TankData tankData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		this.tankData = tankData;
		tankData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions of the WeatherStation: " + temperature
				+ "F degrees and " + humidity + "% humidity");
		System.out.println("Current status of the Tank: " +  nivel
				+ " de litros");
	}

	public void update(Subject subject) {
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)subject;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getHumidity();
		}
		if (subject instanceof TankData) {
			TankData tankData = (TankData)subject;
			this.lleno = tankData.isLleno();
			this.vacio = tankData.isVacio();
			this.nivel = tankData.getNivel();
		}
		display();
	}
	public void removeSubject(Subject s){
		s.registerObserver(this);
	}
}
