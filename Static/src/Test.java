
public class Test {

	public static void main(String[] args) {
		
		System.out.println(Calculadora.sumaStatic(2, 4));
		
		Calculadora calculadora1 = new Calculadora(1);
		
		Calculadora calculadora2 = new Calculadora(1);
		Calculadora calculadora3 = calculadora2;
		if (calculadora3 == calculadora2)
			System.out.println("son iguales");
		Calculadora cal = new Calculadora(8);
		
		System.out.println("Calculadora 1 numero: "+calculadora1.numero + ", numero static: "+calculadora1.numeroStatic);
		System.out.println("Calculadora 2 numero: "+calculadora2.numero + ", numero static: "+calculadora2.numeroStatic);
		System.out.println(Calculadora.numeroStatic);
	}

}
