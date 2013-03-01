package herencia;

public class Triangulo extends FiguraGeometrica{

	public double lado1;
	public double lado2;
	public double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super("triangulo");
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public double getArea() {
		//formula de Heron
		double perimetro = lado1+lado2+lado3;
		double semiperimetro = perimetro/2;
		return Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
	}

}
