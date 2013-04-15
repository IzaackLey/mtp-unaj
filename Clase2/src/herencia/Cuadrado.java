package herencia;

public class Cuadrado extends FiguraGeometrica{
	public double lado; 	
		
	public Cuadrado(double lado){
		super("Cuadrado");
		this.lado = lado;
	}

	public double getArea() {
		return Math.sqrt(this.lado);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
