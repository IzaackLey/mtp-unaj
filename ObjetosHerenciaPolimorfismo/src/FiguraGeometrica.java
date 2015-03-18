

public class FiguraGeometrica{
	public String nombre;
	
	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
    public double getArea(){
    	return 0;
    };
    
	public String toString() {
		return String.format("figura:%s, area:%f",nombre, getArea());
	}
	

}
