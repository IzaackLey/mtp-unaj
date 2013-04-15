package herencia;
import java.util.ArrayList;
import java.util.Iterator;
public class TestConjuntoFiguras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConjutoDeFiguras conjutoDeFiguras = new ConjutoDeFiguras();
		conjutoDeFiguras.addFigura(new Circulo(25));
		conjutoDeFiguras.addFigura(new Triangulo(12, 1, 25));
		conjutoDeFiguras.addFigura(new Cuadrado(25));
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(new Integer(3));
		arr.add(new Integer(4));
		arr.remove(new Integer(3));
		
		Iterator<Integer> iter = arr.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
		
		

	}

}
