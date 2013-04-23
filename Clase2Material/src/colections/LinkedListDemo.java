package colections;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> link=new LinkedList<Integer>();
		link.add(new Integer(12));
        link.add(new Integer(13));
        link.add(new Integer(14));
        link.add(2,new Integer(15));
        
        System.out.println("Primer elemento : "+link.element());
        System.out.println("The contents of array is " + link);
        
        for (int i=0;i<link.size( );i++){
            Integer elemento = link.get(i);
            int posicion = link.indexOf(elemento);
            System.out.println("posicion: "+posicion+", elemento: "+elemento);
        }
        
        link.addFirst(new Integer(1));
        link.addLast(new Integer(100));
        
        //usando iterador
        Iterator<Integer> iter = link.iterator();
        while(iter.hasNext()) {  

            Integer elemento = iter.next();
            int posicion = link.indexOf(elemento);
            System.out.println("posicion: "+posicion+", elemento: "+elemento);
        }
        
        link.remove(3);
        
        iter = link.iterator();
        while(iter.hasNext()) {  

            Integer elemento = iter.next();
            int posicion = link.indexOf(elemento);
            System.out.println("posicion: "+posicion+", elemento: "+elemento);
        }
	}
}
