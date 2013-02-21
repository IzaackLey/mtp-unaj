package herencia;

public class Calculador {
	public static double getPerimetro(Circulo circulo){
		return 2*circulo.radio*Math.PI;
	}
	public static double getPerimetro(Cuadrado cuadrado){
		return 4*cuadrado.lado;
	}
}
