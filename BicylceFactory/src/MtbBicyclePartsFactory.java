
public class MtbBicyclePartsFactory implements BicyclePartsFactory{

	public Cuadro crearCuadro() {
		return new CuadroMtb();
	}

	public Rueda crearRueda() {
		return new RuedaMtb();
	}

	public Accesorios crearAccesorios() {
		return new AccesoriosMtb();
	}

}
