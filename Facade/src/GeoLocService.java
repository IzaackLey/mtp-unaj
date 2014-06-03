
public class GeoLocService {
	public Coordinates GetCoordinatesForZipCode(String zipCode){
		return new Coordinates(10, 20);
	}

	public String GetCityForZipCode(String zipCode)
	{
	    return "Seattle";
	}
	 
    public String GetStateForZipCode(String zipCode)
    {
        return "Washington";
	}
}
