package interfaces;

public class Cuadrado implements FiguraGeometrica{
	public double lado; 	
		
	public Cuadrado(double lado){
		this.lado = lado;
	}

	public double getArea() {
		return Math.sqrt(this.lado);
	}

	public String getNombre() {
		return "Cuadrado";
	}
}
