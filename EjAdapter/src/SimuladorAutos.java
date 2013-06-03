
public class SimuladorAutos {
	Vehiculo vehiculo;

	public void moverVehiculo(int minutos){
		for (int i = 1; i<=minutos; i++){
			System.out.println("el vehiculo en "+i+" minuto avanzo "+String.valueOf((double)vehiculo.getVelocidad()/60*i) +" kilometros");
		}
	}
	public void setVehiculo(Vehiculo vehiculo){
		this.vehiculo = vehiculo;
	}
}
