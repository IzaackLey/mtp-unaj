import java.util.Iterator;

public class Empleado extends JefeComponent {
	String nombre;
	String funcion;
    
	public Empleado(String nombre, String funcion)
	{ 
		this.nombre = nombre;
		this.funcion = funcion;
	}
  
	public String getNombre() {
		return nombre;
	}
	public String getFuncion() {
		return funcion;
	}
	
	public void print() {
		System.out.println(getNombre()+", " +getFuncion());
	}


	public Iterator<JefeComponent> createIterator() {
		return new NullIterator();
	}
}
