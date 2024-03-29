package composite;

public class ExpresionComposite extends ComponentExpresion{
	int tipo;//suma 1, resta 2
	ComponentExpresion componentExpresion;
	ComponentExpresion componentExpresion2;
	
	public ExpresionComposite(ComponentExpresion componentExpresion, ComponentExpresion componentExpresion2, int tipo){
		this.componentExpresion = componentExpresion;
		this.componentExpresion2 = componentExpresion2;
		this.tipo = tipo;
	}
	
	public int calcular() {
		int resultado=0;
		switch (tipo) {
		case 1:
			resultado= componentExpresion.calcular() + componentExpresion2.calcular(); 
			break;
		case 2:
			resultado= componentExpresion.calcular() - componentExpresion2.calcular(); 
			break;
		}
		return resultado;
	}

	public String expresion() {
		String signo="";
		if (tipo == 1) 
			signo = "+";
		else if (tipo == 2) 
			signo = "-";
		return "(" + componentExpresion.expresion() + signo + componentExpresion2.expresion() + ")";
	}
}
