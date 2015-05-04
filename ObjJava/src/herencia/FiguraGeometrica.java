package herencia;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>{
	public String nombre;
	public String color;
    public static int cantidadFiguras=0;	
	
    public abstract double getArea();
	public abstract String toString();

	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
		cantidadFiguras++;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public int compareTo(FiguraGeometrica f) {
		return	Double.compare(this.getArea(), f.getArea());
	}
	public static int getCantidadFiguras() {
		return cantidadFiguras;
	}
}
