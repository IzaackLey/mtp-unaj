package herencia;

public class Circulo extends FiguraGeometrica{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI*Math.sqrt(radio);
	}
}
