package composite;


public abstract class ComponentExpresion {
	public abstract int calcular();
	
	public void add(ComponentExpresion componentExpresion, ComponentExpresion componentExpresion2){
		throw new UnsupportedOperationException();
	}
	public void remove(ComponentExpresion componentExpresion){
		throw new UnsupportedOperationException();
	}
	public ComponentExpresion getOperando(int i){
		throw new UnsupportedOperationException();
	}
}
