package ejercicioUpdateGenerico;

import java.util.ArrayList;

public class TankData implements Subject{
	private ArrayList<Observer> observers;
	private int nivel;
	private boolean lleno;
	private boolean vacio;
	
	public TankData(){
		observers = new ArrayList<Observer>();
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(int nivel, boolean lleno, boolean vacio) {
		this.nivel = nivel;
		this.lleno = lleno;
		this.vacio = vacio;
		measurementsChanged();
	}

	public int getNivel() {
		return nivel;
	}

	public boolean isLleno() {
		return lleno;
	}

	public boolean isVacio() {
		return vacio;
	}

}
