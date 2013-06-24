
public class SedanCar extends Car{
	public SedanCar(Location location){
		super(CarType.LUXURY, location);
		construct();
	}

	protected void construct() {
		System.out.println("Building luxury car");
	}
}
