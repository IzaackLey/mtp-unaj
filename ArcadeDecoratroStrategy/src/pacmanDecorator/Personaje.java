package pacmanDecorator;

public abstract class Personaje {
	String nombre;
	
	public String getNombre(){
		return "soy un "+ this.nombre;
	}
	
	//public abstract String getNombre();
	public abstract int getAvance();
}
