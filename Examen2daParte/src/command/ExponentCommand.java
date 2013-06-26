package command;

public class ExponentCommand implements Command{
	Exponent exponent;
	
	public ExponentCommand(Exponent exponent){
		this.exponent = exponent;
	}

	public int execute(int arg1, int arg2) {
		return exponent.getExponente(arg1, arg2);
	}
}
