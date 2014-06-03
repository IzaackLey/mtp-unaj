
public class Main {

	public static void main(String[] args) {
		String zipCode = "SeattleZipCode";
		GeoLocService geoLookupService = new GeoLocService();
	
		String city = geoLookupService.GetCityForZipCode(zipCode);
		String state = geoLookupService.GetStateForZipCode(zipCode);
		Coordinates coords = geoLookupService.GetCoordinatesForZipCode(zipCode);
		 
		WeatherService weatherService = new WeatherService();
		double farenheit = weatherService.GetTempFarenheit(coords.latitude, coords.longitude);
		 
		MetricConverterService metricConverter = new MetricConverterService();
		double celcius = metricConverter.FarenheitToCelcius(farenheit);
		 
		System.out.println("The current temperature is " + farenheit + " ºF "+celcius+" ºC, ciudad: "+ city + ", estado: "+state);
	}
}
