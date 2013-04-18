public class Cuadrado extends FiguraGeometrica{
	public double lado; 	
		
	public Cuadrado(double lado){
		super("Cuadrado");
		this.lado = lado;
	}

	public double getArea() {
		return Math.pow(this.lado,2);
	}

	public String toString() {
		return String.format("figura:%s lado:%f, area:%f",nombre, lado, getArea());
	}
}
