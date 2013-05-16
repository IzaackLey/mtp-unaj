package dec;

public class CorreoArgentino extends Correo{
	public CorreoArgentino() {
		this.descripcion = "Correo Argentino";
	}

	public double costo() {
		return 20;
	}
}
