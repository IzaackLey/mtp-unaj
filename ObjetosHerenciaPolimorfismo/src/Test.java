import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

	public static void main(String[] args) throws IOException {
		int opcion = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("elija 0 para crear un l circulo, 1 para un cuadrado: ");
        try{
        	opcion = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
	      
        
        //
		FiguraGeometrica figuraGeometrica = null;
		
		if (opcion==0){
			figuraGeometrica = new FiguraGeometrica("figura Geometrica");
		}else 
		if (opcion==1){
			figuraGeometrica = new Circulo(10);
		}else 
		if (opcion==2){
			figuraGeometrica = new Cuadrado(10);
		}
		
		System.out.println(figuraGeometrica.getNombre() + ", " + figuraGeometrica.getArea());
	}

}
