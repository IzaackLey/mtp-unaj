package herencia;

public class Cuadrado extends FiguraGeometrica{
	private double lado; 	
		
	public Cuadrado(double lado){
		this.lado = lado;
	}

	public double getArea() {
		return Math.sqrt(this.lado);
	}
}
