package herencia;
public class Test{
	public static void main(String[] args) {
		FiguraGeometrica figuraGeometrica;
		int opcion = 0;
		
		if (opcion==0){
			figuraGeometrica = new Circulo(10);//upcasting
		}else if (opcion==1){
			figuraGeometrica = new Cuadrado(10);//upcasting
		}else{
			figuraGeometrica = new Triangulo(6,6,6);//upcasting
		}
		System.out.println("el aread de el " + figuraGeometrica.nombre + " es " + figuraGeometrica.getArea());
		
	}
}
