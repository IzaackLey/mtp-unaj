package co1fecha1;

public class Test {

	public static void main(String[] args) {
		MStation mStation = new MStation(1, 56, 56, 25);
		System.out.println("La presion en imperial es: "+mStation.getPressure());
		System.out.println("La temperatura en imperial es: "+mStation.getTemperature());
		mStation.setUnitStrategy(new InternationalUnitStrategy());
		System.out.println("La presion en imperial es: "+mStation.getPressure());
		System.out.println("La temperatura en imperial es: "+mStation.getTemperature());
	}

}
