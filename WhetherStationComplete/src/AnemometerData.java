import java.util.ArrayList;


public class AnemometerData implements AnemometerDataSubject{
	float windSpeed ;
	float windDirection;
	
	private ArrayList<AnemometerObserver> observers;
	public AnemometerData(){
		observers = new ArrayList<AnemometerObserver>();
	}
	
	public void registerObserver(AnemometerObserver o) {
		observers.add(o);
		
	}

	public void removeObserver(AnemometerObserver o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public float getWindDirecetion() {
		return windDirection;
	}

	public ArrayList<AnemometerObserver> getObservers() {
		return observers;
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			AnemometerObserver observer = (AnemometerObserver)observers.get(i);
			observer.update(windSpeed, windDirection);
		}
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
