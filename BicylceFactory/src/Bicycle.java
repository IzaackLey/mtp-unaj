
public class Bicycle {
	String name;
	Rueda ruedaDelantera;
	Rueda ruedaTrasera;
	Cuadro cuadro;
	Accesorios accesorios;
	BicyclePartsFactory bicyclePartsFactory;
	String tipoDeBici;
	
	public Bicycle(BicyclePartsFactory bicyclePartsFactory){
		this.bicyclePartsFactory = bicyclePartsFactory;
		ensamblar();
	}
	
	public void ensamblar(){
		accesorios = bicyclePartsFactory.crearAccesorios();
		ruedaDelantera = bicyclePartsFactory.crearRueda();
		ruedaTrasera = bicyclePartsFactory.crearRueda();
		cuadro = bicyclePartsFactory.crearCuadro();
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (ruedaDelantera != null) {
			result.append(ruedaDelantera);
			result.append("\n");
		}if (ruedaTrasera!= null){
			result.append(ruedaTrasera);
			result.append("\n");
		}if (cuadro!= null){
			result.append(cuadro);
			result.append("\n");
		}if (accesorios!= null){
			result.append(accesorios);
			result.append("\n");
		}
		return result.toString();
	}
}