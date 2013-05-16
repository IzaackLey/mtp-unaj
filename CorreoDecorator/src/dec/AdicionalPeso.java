package dec;

public class AdicionalPeso extends CostoEnvioDecorator{

	public AdicionalPeso(Correo correo) {
		super(correo);
	}

	public double costo() {
		return 4 + this.correo.costo();
	}
}
