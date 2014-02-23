package command;

public class Test {
	public static void main(String[] args) {
		//Clase cliente
		
		Add add = new Add(); //el receiver
		AddOperationCommand addOperationCommand = new AddOperationCommand(add); //command
		
		Substract substract = new Substract();//el receiver
		SubOperationCommand subOperationCommand = new SubOperationCommand(substract);//command
		
		Exponent exponent = new Exponent();//el receiver
		ExponentCommand exponentCommand = new ExponentCommand(exponent);//command
		
		
		Calculadora calculadora = new Calculadora(); // invoker
		
		calculadora.setCommand(addOperationCommand); 
		calculadora.setCommand(subOperationCommand);
		calculadora.setCommand(exponentCommand);
		
		calculadora.invoke(3,4,0); 
		calculadora.invoke(7,4,0);
		calculadora.invoke(5,2,1);
		calculadora.invoke(7,4,1);
		calculadora.invoke(7,2,2);
	}

}
