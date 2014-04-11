
public interface AnemometerDataSubject {
	public void registerObserver(AnemometerObserver o);
	public void removeObserver(AnemometerObserver o);
	public void notifyObservers();
}
