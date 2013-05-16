package dec;

public abstract class CostoEnvioDecorator extends Correo{
	Correo correo;
	public CostoEnvioDecorator(Correo correo){
		this.correo = correo;
	}
	public abstract double costo();
	
	public String getDescripcion(){
		return this.correo.getDescripcion();
	}
}
