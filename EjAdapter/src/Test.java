public class Test {

	
	public static void main(String[] args) {
		SimuladorAutos simuladorAutos = new SimuladorAutos();
		Auto auto = new Auto(0, 30);
		Velero velero = new Velero(0, 16.2);
		simuladorAutos.setVehiculo(auto);
		simuladorAutos.moverVehiculo(60);
		simuladorAutos.setVehiculo(new EmbarcacionAdapter(velero));
		simuladorAutos.moverVehiculo(60);
	}
}
