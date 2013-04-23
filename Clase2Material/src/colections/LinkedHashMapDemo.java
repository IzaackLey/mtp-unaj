package colections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// Create a hash map
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
		// Put elements to the map
		lhm.put("Zara", new Double(3434.34));
		lhm.put("Mahnaz", new Double(123.22));
		lhm.put("Ayan", new Double(1378.00));
		  
		Set<Entry<String, Double>> set = lhm.entrySet();
		Iterator<Entry<String, Double>> i = set.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
			
		System.out.println("Zara's balance: " + lhm.get("Zara"));
	}
}
