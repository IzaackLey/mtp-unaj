package herencia;

public class Circulo extends FiguraGeometrica{
	public double radio;
	
	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI*Math.sqrt(radio);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
