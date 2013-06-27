package composite;

public class Test {
	public static void main(String[] args){
		ComponentExpresion exp1 = new ExpresionComposite(new NumeroLeaf(5), new NumeroLeaf(8), 1);
		ComponentExpresion numero = new NumeroLeaf(3);
		ComponentExpresion top = new ExpresionComposite(exp1, numero, 2);
		System.out.println(top.expresion()+"="+top.calcular());
	}
}
