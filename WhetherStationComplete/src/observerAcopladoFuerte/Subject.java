package observerAcopladoFuerte;

import java.util.ArrayList;

public abstract class Subject {
	ArrayList<Observer> observers;
	public Subject(){
		this.observers = new ArrayList<Observer>();
	} 
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		if (observers.contains(o))
			observers.remove(o);
	}
	public void notifyObservers(){
		for (Observer observer:observers){
			observer.update(this);
		}
	}
	
}
