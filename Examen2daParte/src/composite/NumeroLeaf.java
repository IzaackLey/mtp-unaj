package composite;

public class NumeroLeaf extends ComponentExpresion{
	int valor;
	public NumeroLeaf(int valor){
		this.valor = valor;
	}
	
	public int calcular() {
		return valor;
	}

	public String expresion() {
		return String.valueOf(valor);
	}
}
