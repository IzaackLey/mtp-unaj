package observerAcopladoFuerte;
import java.util.ArrayList;


public class AnemometerData extends Subject{
	float windSpeed ;
	float windDirection;
	

	public float getWindSpeed() {
		return windSpeed;
	}

	public float getWindDirecetion() {
		return windDirection;
	}

	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float windSpeed, float windDirecetion) {
		this.windSpeed = windSpeed;
		this.windDirection = windDirecetion;
		measurementsChanged();
	}


}
