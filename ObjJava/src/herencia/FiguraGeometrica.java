package herencia;

public abstract class FiguraGeometrica {
	public String nombre;
	public String color;
	public abstract double getArea();
	
	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
}
