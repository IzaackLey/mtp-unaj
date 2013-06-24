package ejercicioUpdateEspecifico;

public interface WeatherDataSubject {
	public void registerObserver(WeatherDataObserver o);
	public void removeObserver(WeatherDataObserver o);
	public void notifyObservers();
}
