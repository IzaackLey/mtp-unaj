package colections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lnkHs = new LinkedHashSet<Integer>();  
		lnkHs.add(new Integer(3));  
		lnkHs.add(new Integer(5));  
		lnkHs.add(new Integer(2));  
		//este no se agrega
		lnkHs.add(new Integer(3));  

		
		Iterator<Integer> iterator = lnkHs.iterator();  
		while(iterator.hasNext())  
		{  
		    Integer number = iterator.next();  
		    System.out.println(number.toString());  
		}
	}

}
