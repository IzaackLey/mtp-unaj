
public class Test {
	public static double frances(double monto, double interesAnual, int duracionAnual){
		double interesMensual  = interesAnual / 100 / 12;
		double numpagos  = duracionAnual * 12;
		double aux = Math.pow(1 + interesMensual, numpagos);
		double num = aux * interesMensual;
		double den = aux -1;
		return monto*num/den;
	}
	
	public static double aleman(double monto, double interesAnual, int duracionAnual, int numeroCuota){
		double interesMensual  = interesAnual / 100 / 12;
		double numpagos  = duracionAnual * 12;
		double aux = Math.pow(1 + interesMensual, numpagos);
		double num = aux * interesMensual;
		double den = aux -1;
		return monto*num/den;
	}
	
	public static void main(String[] args) {
		System.out.println(frances(15000, 30, 4));

	}

}
