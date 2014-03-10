package ejercicioUpdateEspecifico;

public class GenericDataDisplay  implements WeatherDataObserver, TankDataObserver, DisplayElement {
	private int nivel;
	private boolean lleno;
	private boolean vacio;
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherDataSubject weatherDataSubject;
	private TankDataSubject tankDataSubject;
	
	public GenericDataDisplay(WeatherDataSubject weatherDataSubject, TankDataSubject tankDataSubject){
		this.weatherDataSubject = weatherDataSubject;
		weatherDataSubject.registerObserver(this);
		this.tankDataSubject = tankDataSubject;
		tankDataSubject.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions of the WeatherStation: " + temperature
				+ "F degrees and " + humidity + "% humidity");
		System.out.println("Current status of the Tank: " +  nivel
				+ " de litros");
	}

	public void update(int nivel, boolean lleno, boolean vacio) {
		this.lleno = lleno;
		this.vacio = vacio;
		this.nivel = nivel;
		display();
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}
	
}
