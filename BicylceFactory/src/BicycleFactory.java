
public class BicycleFactory {
	Bicycle createBicycle(String tipo){
		Bicycle bicycle = null;
		if (tipo.equals("BMX")){
			bicycle = new Bicycle(new BMXBicyclePartsFactory());
			bicycle.setName("BMX");
		}else if (tipo.equals("Ruta")){
			bicycle = new Bicycle(new RutaBicyclePartsFactory());
			bicycle.setName("Ruta");
		}else if (tipo.equals("Mtb")){
			bicycle = new Bicycle(new MtbBicyclePartsFactory());
			bicycle.setName("Mtb");
		}
		return bicycle;
	}
}
