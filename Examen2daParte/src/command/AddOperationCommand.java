package command;

public class AddOperationCommand implements BinaryOperatorCommand{
	int prevResult;
	int nuevo;
	
	public AddOperationCommand(int prevResult, int nuevo){
		this.prevResult = prevResult;
		this.nuevo = nuevo;
	}

	public int execute() {
		System.out.println("El Resultaod es: "+ Integer.toString(prevResult + nuevo));
		return prevResult + nuevo;
	}
}
