package colections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet <Integer>tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(45);
		tree.add(23);
		tree.add(34);
		Iterator<Integer> iterator = tree.iterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
	}

}
