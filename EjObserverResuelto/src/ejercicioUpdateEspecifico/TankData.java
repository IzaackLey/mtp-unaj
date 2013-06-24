package ejercicioUpdateEspecifico;

import java.util.ArrayList;

public class TankData implements TankDataSubject{
	private ArrayList<TankDataObserver> observers;
	private int nivel;
	private boolean lleno;
	private boolean vacio;
	
	public TankData(){
		observers = new ArrayList<TankDataObserver>();
	}
	public void registerObserver(TankDataObserver o) {
		observers.add(o);
	}

	public void removeObserver(TankDataObserver o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			TankDataObserver observer = observers.get(i);
			observer.update(nivel, lleno, vacio);
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
