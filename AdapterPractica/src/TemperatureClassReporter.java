//TemperatureClassReporter is a class adapter. It extends CelciusReporter (the adaptee) and 
//implements TemperatureInfo (the target interface). If a temperature is in Celcius, TemperatureClassReporter 
//utilizes the temperatureInC value from CelciusReporter. Fahrenheit requests are internally handled in Celcius.

public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo {
	public double getTemperatureInC() {
		return temperatureInC;
	}
	@Override
	public double getTemperatureInF() {
		return cToF(temperatureInC);
	}
	@Override
	public void setTemperatureInC(double temperatureInC) {
		this.temperatureInC = temperatureInC;
	}
	@Override
	public void setTemperatureInF(double temperatureInF) {
		this.temperatureInC = fToC(temperatureInF);
	}
	private double fToC(double f) {
		return ((f - 32) * 5 / 9);
	}
	private double cToF(double c) {
		return ((c * 9 / 5) + 32);
	}

}
