

public class Circulo extends FiguraGeometrica{
	
	public double radio;

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI*Math.pow(radio,2);
	}
	
	public double getRadio(){
		return radio;
	}
}
