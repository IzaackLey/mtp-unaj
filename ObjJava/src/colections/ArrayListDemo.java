package colections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(1, "Mario"));
        personas.add(new Persona(2, "Fernando"));
        personas.add(new Persona(3, "Omar"));
        personas.add(new Persona(4, "Juana"));
        
        //usando indices
        for (int i=0;i<personas.size( );i++){
        	System.out.println(personas.get(i).nombre); 
        }
        
        //usando iterador
		Iterator<Persona> iter = personas.iterator();
		while(iter.hasNext()) {  
			System.out.println(iter.next().nombre); 
		}
		
		//usando foreach nuevo
		for (Persona per:  personas){
			System.out.println(per.nombre);
		}
	}
}
