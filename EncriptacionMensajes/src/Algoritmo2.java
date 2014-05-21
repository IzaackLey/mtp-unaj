
public class Algoritmo2 extends MensajeDecorator{

	public Algoritmo2(Mensaje mensaje) {
		super(mensaje);
	}
	public String getTexto() {
		return "encriptado con algoritmo 2: (" +this.mensaje.getTexto() + ")";
	}

}
