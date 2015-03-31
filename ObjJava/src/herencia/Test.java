package herencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("opcion 0, 1, 2:");
        try{
        	ClaseAbstracta.opcion = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
	        	    
		FiguraGeometrica figuraGeometrica;

		
		
		if (ClaseAbstracta.opcion==0){
			figuraGeometrica = new Circulo(10);
		}else if (ClaseAbstracta.opcion==1){
			figuraGeometrica = new Cuadrado(10);
		}else{
			figuraGeometrica = new Triangulo(6,6,6);
		}
	
		System.out.println(figuraGeometrica.toString());
		
		FiguraGeometrica f1 = new Circulo(23);
		FiguraGeometrica f2 = new Cuadrado(34);
		if (f1.compareTo(f2)==1)
			System.out.println("f1 es mayor que f2");
		else
			System.out.println("f2 es mayor que f1");
		
//		if (figuraGeometrica instanceof Triangulo) {
//			Triangulo triangulo  = (Triangulo) figuraGeometrica; //downcasting
//			perimetro = Calculador.getPerimetro(triangulo);
//			triangulo.print();
//		}else if (figuraGeometrica instanceof Cuadrado){
//			Cuadrado cuadrado = (Cuadrado) figuraGeometrica; //downcasting
//			perimetro = Calculador.getPerimetro(cuadrado);
//		}else if (figuraGeometrica instanceof Circulo){
//			Circulo circulo = (Circulo) figuraGeometrica; //downcasting
//			perimetro = Calculador.getPerimetro(circulo);
//		}
//		System.out.println("el perimetro es " + perimetro.toString());
	};	
}
