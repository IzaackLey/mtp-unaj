package dec;

public class AdicionalDistancia extends CostoEnvioDecorator{
	public AdicionalDistancia(Correo correo) {
		super(correo);
	}
	public double costo(){
		return 20 + this.correo.costo();
	}
}
