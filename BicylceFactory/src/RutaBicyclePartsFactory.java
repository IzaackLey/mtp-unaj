
public class RutaBicyclePartsFactory implements BicyclePartsFactory{
	public Cuadro crearCuadro() {
		return new CuadroRuta();
	}

	public Rueda crearRueda() {
		return new RuedaRuta();
	}

	public Accesorios crearAccesorios() {
		return new AccesoriosRuta();
	}

}
