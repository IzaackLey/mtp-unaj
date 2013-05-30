public class Test {

	public static void main(String[] args) {
//		Bicycle BMXBicycle;
//		BMXBicycle = new Bicycle(new BMXBicyclePartsFactory());
//		BMXBicycle.name = "BMX";
//		System.out.println("Las partes de la bici son: " + BMXBicycle + "\n");
		
		BicycleFactory bicicletaFactory = new BicycleFactory();
		Bicycle bicycle = bicicletaFactory.createBicycle("BMX");
		System.out.println(bicycle + "\n");
		bicycle = bicicletaFactory.createBicycle("Ruta");
		System.out.println(bicycle + "\n");
		bicycle = bicicletaFactory.createBicycle("Mtb");
		System.out.println(bicycle + "\n");
	}

}
