package colections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
	    set.add( new Integer( 6 ) );
	    set.add( new Integer( 1 ) );
	    set.add( new Integer( 4 ) );

	    Iterator<Integer> it=set.iterator();
        while(it.hasNext())
        {
            Integer value =it.next();
            System.out.println("Value :"+value);
        }
        // Remove element from hashSet :
        set.remove(new Integer(4));
        System.out.println(set);
        
		for (Integer entero : set){
			System.out.println(entero);
		}
	}
}