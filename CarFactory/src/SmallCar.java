
public class SmallCar extends Car{
	public SmallCar(Location location){
		super(CarType.LUXURY, location);
		construct();
	}

	protected void construct() {
		System.out.println("Building small car");
	}
}
