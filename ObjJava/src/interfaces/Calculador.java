package interfaces;

public class Calculador {
	public static double getPerimetro(Circulo circulo){
		return 2*circulo.radio*Math.PI;
	}
	public static double getPerimetro(Cuadrado cuadrado){
		return 4*cuadrado.lado;
	}
	public static double getPerimetro(Triangulo triangulo){
		return triangulo.lado1+triangulo.lado2+triangulo.lado3;
	}
}
