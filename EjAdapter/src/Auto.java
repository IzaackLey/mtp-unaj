
public class Auto implements Vehiculo{
	int direccion; 
	int velocidad;
	public Auto(int direccion, int velocidad){
		this.direccion = direccion;
		this.velocidad = velocidad;
	}
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
		
	}

	public int getVelocidad() {
		return velocidad;
	}
}
