import java.util.Iterator;
import java.util.ArrayList;


public class Jefe extends JefeComponent {
	ArrayList<JefeComponent> jefeComponents = new ArrayList<JefeComponent>();
	String name;
	String funcion;
	String area;
  


	public Jefe(String name, String funcion, String area) {
		this.name = name;
		this.funcion = funcion;
		this.area = area;
	}
 
	public void add(JefeComponent jefeComponent) {
		jefeComponents.add(jefeComponent);
	}
	
	public void remove(JefeComponent jefeComponent) {
		jefeComponents.remove(jefeComponent);
	}
 
	public JefeComponent getChild(int i) {
		return (JefeComponent)jefeComponents.get(i);
	}
 
	public String getNombre() {
		return name;
	}
 
	public String getFuncion() {
		return funcion;
	}

	public String getArea() {
		return area;
	}
	
	public void print() {
		System.out.println("Jefe: "+getFuncion() + " , Nombre: " + getNombre()+" Area: "+ getFuncion());
		System.out.println("Gente a Cargo");
		System.out.println("---------------------");
		
  
		Iterator<JefeComponent> iterator = jefeComponents.iterator();
		while (iterator.hasNext()) {
			JefeComponent jefeComponent = iterator.next();
			jefeComponent.print();
		}
	}

	public Iterator<JefeComponent> createIterator() {
		return new CompositeIterator(jefeComponents.iterator());
	}
}
