package abstractClass;



public class Circulo extends FiguraGeometrica{
	
	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}


	public double radio;


	public double getArea() {
		return Math.PI*Math.pow(radio,2);
	}
	public String toString() {
		return String.format("figura:%s radio:%f, area:%f",nombre, radio, getArea());
	}
}
