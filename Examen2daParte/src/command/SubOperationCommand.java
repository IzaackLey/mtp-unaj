package command;

public class SubOperationCommand implements Command{
	Substract substract;
	public SubOperationCommand(Substract substract){
		this.substract = substract;
	}

	public int execute(int arg1, int arg2) {
		substract.setValues(arg1, arg2);
		return substract.getResultado();
	}
}
