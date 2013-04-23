package colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> edades = new Hashtable<Integer, String>();
		edades.put(45, "Pedro");
		edades.put(2, "Matias");
		edades.put(18, "Javier");
		
		//set de claves
		Set<Integer> set = edades.keySet();
		
		//recorro todo el hashTable, usando las claves para acceder a los Objetos
		Integer edad;
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
		  edad = itr.next();
		  System.out.println(edad.toString() + ": " + edades.get(edad));
		}
		
		//recorro los Objetos del hashTable
		Enumeration e = edades.elements();
	    while (e.hasMoreElements()) {
	        String key = (String) e.nextElement();
	        System.out.println("nombre: "+key.toString());
	    }
	    
	    //creo un arrayList con los indices
	    ArrayList<Integer> arr = new ArrayList<Integer>(edades.keySet());
	    Collections.sort(arr); 
	    //recibe list, osea segun el grafico se cual es list
	    
	    //los ordeno
	    Iterator<Integer> itArr = arr.iterator();
	    while (itArr.hasNext()){
	    	edad = itArr.next();
	    	System.out.println("edad: "+edad.toString()+", nombre: "+edades.get(edad));
	    }
	}
}
