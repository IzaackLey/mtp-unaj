package dec;

public class AdicionalSeguimiento extends CostoEnvioDecorator{

	public AdicionalSeguimiento(Correo correo) {
		super(correo);
	}

	public double costo() {
		return 2 + this.correo.costo();
	}
	
	public String getDescripcion(){
		return this.correo.getDescripcion() + ", seguimiento";
	}
}
