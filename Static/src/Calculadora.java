
public class Calculadora {
	public static int numeroStatic;
	public int numero;
	
	public static int sumaStatic(int num1, int num2){
		return num1 + num2;
	}
	
	public int suma(int num1, int num2){
		return num1 + num2;
	}
	
	public Calculadora(int numero){
		this.numero = numero;
	}
	
}
