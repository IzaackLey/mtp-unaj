
public class LuxuryCar extends Car{
	public LuxuryCar(Location location){
		super(CarType.LUXURY, location);
		construct();
	}

	protected void construct() {
		System.out.println("Building luxury car");
	}
}
