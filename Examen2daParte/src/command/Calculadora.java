package command;

import java.util.ArrayList;

public class Calculadora {
	ArrayList<BinaryOperatorCommand> calculos = new ArrayList<BinaryOperatorCommand>();
	int posicion = -1;
	int valor;
	
	public void calcular(BinaryOperatorCommand command){
		calculos.add(command);
		command.execute();
	}
}
