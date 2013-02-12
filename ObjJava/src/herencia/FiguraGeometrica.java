package herencia;

public abstract class FiguraGeometrica {
	private String nombre;
	private String color;
	
	public abstract double getArea();
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setColor(String Color){
		this.color = color;
	}
	
	
	public String getColor(){
		return this.color;
	}
	
}
