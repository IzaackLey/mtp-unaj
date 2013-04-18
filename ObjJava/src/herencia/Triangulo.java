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
		return Math.pow(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3),2);
	}
	
    public String toString() {
        return String.format("figura:%s lado1:%f, lado2:%f, lado3:%f, area:%f",nombre, lado1, lado2, lado3, getArea());
    }
    
    public void print() {
        System.out.println(this.toString());
    }
    
}
