package st1;

public class TestConjuntoFiguras {
	public static void main(String[] args) {
		ConjutoDeFiguras conjutoDeFiguras = new ConjutoDeFiguras();
		conjutoDeFiguras.addFigura(new Circulo(25));
		conjutoDeFiguras.addFigura(new Triangulo(12, 1, 25));
		conjutoDeFiguras.addFigura(new Cuadrado(25));
		
		System.out.println(conjutoDeFiguras.getFiguras());
		conjutoDeFiguras.setSortStrategy(new SortByName());
		System.out.println(conjutoDeFiguras.getFiguras());
		//System.out.println(conjutoDeFiguras.getFigurasPorArea());
	}

}
