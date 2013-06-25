package command;

public class Test {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.calcular(new AddOperationCommand(0, 4));
		
		calculadora.calcular(new AddOperationCommand(12, 4));
	}

}
