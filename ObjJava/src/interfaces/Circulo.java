package interfaces;

public class Circulo implements FiguraGeometrica{
	public double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI*Math.sqrt(radio);
	}

	public String getNombre() {
		return "Circulo";
	}
}
