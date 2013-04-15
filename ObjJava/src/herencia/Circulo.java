package herencia;

public class Circulo extends FiguraGeometrica{
	
	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}


	public double radio;


	public double getArea() {
		return Math.PI*Math.sqrt(radio);
	}
}
