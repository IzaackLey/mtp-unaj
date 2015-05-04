package abstractClass;



public abstract class FiguraGeometrica{
	public String nombre;
	
    public abstract double getArea();
	public abstract String toString();

	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
}
