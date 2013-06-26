package command;

public class Exponent {
	public int getExponente(int arg1, int arg2){
		System.out.println("El exponente de :"+Integer.toString(arg1)+" y "+Integer.toString(arg2)+" da: "+ Integer.toString((int)Math.pow(arg1,arg2)));
		return  (int)Math.pow(arg1,arg2);
	}
}
