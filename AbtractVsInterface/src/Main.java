
public class Main {
	public static void main(String[] args) {
		Poligono poligono = new Cuadrado();
		((Cuadrado)poligono).setLogitud(10);
		System.out.println("el area de la figura es "+ poligono.getArea());
	}

}
