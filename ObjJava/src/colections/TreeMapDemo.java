package colections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(); 
		// Pongo los elementos en el HashMap
		tm.put("Juan", new Integer(3434)); 
		tm.put("Alberto", new Integer(123)); 
		tm.put("Rodrigo", new Integer(1378)); 
		tm.put("Santiago", new Integer(99)); 
		// Tomo el conjunto de elementos
		Set set = tm.entrySet(); 
		Iterator i = set.iterator(); 
		// Display elements 
		while(i.hasNext()) { 
			Map.Entry me = (Map.Entry)i.next(); 
			System.out.println(me.getKey() + ": "+me.getValue()); 
		}
		// Deposito 1000 en la cuenta de Santiago
		Integer balance = tm.get("Santiago"); 
		tm.put("Santiago", new Integer(balance + 1000)); 
		System.out.println("el nuevo balance de Santiago es: " + tm.get("Santiago")); 
	}

}
