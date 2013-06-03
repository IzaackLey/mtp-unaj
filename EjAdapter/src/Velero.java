
public class Velero implements Embarcacion{
	int rumbo;
	double velocidad;
	public Velero(int rumbo, double velocidad){
		this.rumbo = rumbo;
		this.velocidad = velocidad;
	}
	
	public void setRumbo(int rumbo) {
		this.rumbo = rumbo;
	}

	public int getRumbo() {
		return rumbo;
	}

	public void SetVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getVelocidad() {
		return velocidad;
	}
	

}
