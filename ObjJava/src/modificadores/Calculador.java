package modificadores;

public class Calculador {
	
	  public static double[] bascara(double a, double b, double c){
		  //ax^2+bx+c
		  double resultados[] = new double[2];
		  double b2m4ac = Math.pow(b, 2)-4*a*c;
		  double raiz = Math.sqrt(b2m4ac);
		  resultados[0]=(-b+raiz)/(2*a);
		  resultados[1]=(-b-raiz)/(2*a);
		  return resultados;
	  }
}
