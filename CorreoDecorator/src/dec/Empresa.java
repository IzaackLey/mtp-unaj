package dec;

public abstract class Empresa {
	String descripcion;
	
	public String getDescripcion(){
		return descripcion;
	}
	public abstract double getCostoEnvio(); 
}
