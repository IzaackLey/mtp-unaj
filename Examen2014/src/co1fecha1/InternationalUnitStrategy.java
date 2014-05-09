package co1fecha1;

public class InternationalUnitStrategy implements UnitStrategy{

	public double getRain(double rain) {
		return rain*25.4;
	}

	public double getWindSpeed(double windSpeed) {
		return windSpeed*1.8520;
	}

	public double getTemperature(double temperature) {
		return ((temperature-32)/1.8);
	}

	public double getAtmPressure(double pressure) {
		return pressure*1000;
	}


}
