package herencia;
public class Test{
	public static void main(String[] args) {
		FiguraGeometrica figuraGeometrica;
		
		if (ClaseAbstracta.opcion==0){
			figuraGeometrica = new Circulo(10);//downcasting
		}else if (ClaseAbstracta.opcion==1){
			figuraGeometrica = new Cuadrado(10);//downcasting
		}else{
			figuraGeometrica = new Triangulo(6,6,6);//downcasting
		}
		
		Double perimetro = 0.0;
		if (figuraGeometrica instanceof Triangulo) {
			Triangulo triangulo  = (Triangulo) figuraGeometrica;//upcasting
			perimetro = Calculador.getPerimetro(triangulo);
			triangulo.print();
		}else if (figuraGeometrica instanceof Cuadrado){
			Cuadrado cuadrado = (Cuadrado) figuraGeometrica;//upcasting
			perimetro = Calculador.getPerimetro(cuadrado);
		}else if (figuraGeometrica instanceof Circulo){
			Circulo circulo = (Circulo) figuraGeometrica;//upcasting
			perimetro = Calculador.getPerimetro(circulo);
		}
		System.out.println("el perimetro es " + perimetro.toString());
		
	}
}
