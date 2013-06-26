package command;

public class Add {
	int arg1;
	int arg2;
	public Add(){
		arg1=0;
		arg2=0;
	}
	
	public void setArguments(int arg1, int arg2){
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public int getResult(){
		System.out.println("La suma de :"+Integer.toString(arg1)+" y "+Integer.toString(arg2)+" da: "+ Integer.toString(arg1+arg2));
		return arg1 + arg2;
	}
}
