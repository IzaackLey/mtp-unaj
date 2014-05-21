
public abstract class MensajeDecorator extends Mensaje{
	Mensaje mensaje;
	public MensajeDecorator(Mensaje mensaje){
		this.mensaje = mensaje;
	}
	public abstract String getTexto();
}
