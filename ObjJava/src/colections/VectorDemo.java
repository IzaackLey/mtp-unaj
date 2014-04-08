package colections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Persona> personas = new Vector<Persona>();
		personas.add(new Persona(1, "Mario"));
		personas.add(new Persona(2, "Fernando"));
		personas.add(new Persona(3, "Omar"));
		personas.add(new Persona(4, "Juana"));
		
		//usando indices
		for (int i=0;i<personas.size( );i++){
			System.out.println(personas.elementAt(i).nombre); 
		}
		
		//usando iterador
		Iterator<Persona> iter = personas.iterator();
		while(iter.hasNext()) {  
			System.out.println(iter.next().nombre); 
		}
		
		//
		Enumeration<Persona> e=personas.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement().nombre);
		}
		
		for (Persona per : personas){
			System.out.println(per.nombre);
		}
	}
}
