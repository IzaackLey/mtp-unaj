package herencia;

import java.util.ArrayList;
import java.util.Iterator;

public class TestConjuntoFiguras {
	public static void main(String[] args) {
		//ConjutoDeFiguras conjutoDeFiguras = new ConjutoDeFiguras();
		//conjutoDeFiguras.addFigura(new Circulo(25));
		//conjutoDeFiguras.addFigura(new Triangulo(12, 1, 25));
		//conjutoDeFiguras.addFigura(new Cuadrado(25));
		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
		figuras.add(new Circulo(50));
		figuras.add(new Triangulo(2, 22, 23));
		for (FiguraGeometrica f: figuras){
			System.out.println(f.toString());
		}
	}

}
