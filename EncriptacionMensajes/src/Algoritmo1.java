
public class Algoritmo1 extends MensajeDecorator{

	public Algoritmo1(Mensaje mensaje) {
		super(mensaje);
	}

	public String getTexto() {
		return "encriptado con algoritmo 1: (" +this.mensaje.getTexto() +")";
	}

}
