package co1fecha1;

public class MStation {
	//context object
	UnitStrategy unitStrategy;
	double pressure = 1.02;
	double rain = 100;
	double temperature = 45;
	double windSpeed = 26;
	
	public MStation(double pressure, double rain, double temperature, double windSpeed){
		this.unitStrategy = new ImperialUnitStrategy();
		this.pressure = pressure;
		this.rain = rain;
		this.temperature = temperature;
		this.windSpeed = windSpeed;
	}

	public double getPressure() {
		return unitStrategy.getAtmPressure(pressure);
	}

	public double getRain() {
		return unitStrategy.getRain(rain);
	}

	public double getTemperature() {
		return unitStrategy.getTemperature(temperature);
	}

	public double getWindSpeed() {
		return unitStrategy.getWindSpeed(windSpeed);
	}

	public void setUnitStrategy(UnitStrategy unitStrategy) {
		this.unitStrategy = unitStrategy;
	}
}
