
public class BMXBicyclePartsFactory implements BicyclePartsFactory{
	
	
	public Cuadro crearCuadro() {
		return new CuadroBMX();
	}

	public Rueda crearRueda() {
		return new RuedaBMX() ;
	}

	public Accesorios crearAccesorios() {
		return new AccesoriosBMX();
	}
}
