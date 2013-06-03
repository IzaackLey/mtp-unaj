
public class EmbarcacionAdapter implements Vehiculo{
	Embarcacion embarcacion;
	public EmbarcacionAdapter(Embarcacion embarcacion){
		this.embarcacion = embarcacion;
	}
	
	public void setDireccion(int grados) {
		embarcacion.setRumbo(grados);
	}

	public int getDireccion() {
		return embarcacion.getRumbo();
	}

	public void setVelocidad(int kmhora) {
		double nudos;
		nudos = kmhora/1.852;
		embarcacion.SetVelocidad(nudos);
	}

	public int getVelocidad() {
		return (int)Math.floor(embarcacion.getVelocidad()*1.852);
	}
}
