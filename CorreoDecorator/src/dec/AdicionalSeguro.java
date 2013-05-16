package dec;

public class AdicionalSeguro extends CostoEnvioDecorator{

	public AdicionalSeguro(Correo correo) {
		super(correo);
	}
	
	public double costo(){
		return 5 + this.correo.costo();
	}
	
	public String getDescripcion(){
		return this.correo.getDescripcion() + ", seguro";
	}
}
