package dec;

public abstract class Correo {
	String descripcion;
	public String getDescripcion(){
		return this.descripcion;
	}
	public abstract double costo();
}
