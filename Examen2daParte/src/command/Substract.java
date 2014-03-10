package command;

public class Substract {
	int arg1;
	int arg2;

	public void setValues(int arg1, int arg2){
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public int getResultado(){
		System.out.println("La resta de :"+Integer.toString(arg1)+" y "+Integer.toString(arg2)+" da: "+ Integer.toString(arg1-arg2));
		return arg1 - arg2;
	}
}
