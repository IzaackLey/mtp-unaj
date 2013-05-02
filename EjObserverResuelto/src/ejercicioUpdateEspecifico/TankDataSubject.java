package ejercicioUpdateEspecifico;

public interface TankDataSubject {
	public void registerObserver(TankDataObserver o);
	public void removeObserver(TankDataObserver o);
	public void notifyObservers();
}
