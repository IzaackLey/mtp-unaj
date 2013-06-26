package command;

public class AddOperationCommand implements Command{
	Add add;
	public void setCommand(Add add){
		this.add = add;
	}
	
	public AddOperationCommand(Add add) {
		this.add = add;
	}

	public int execute(int arg1, int arg2) {
		add.setArguments(arg1, arg2);
		return add.getResult();
	}
}
