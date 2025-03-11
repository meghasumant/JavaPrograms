import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// HashSet -> no duplicates but insertion order not preserved
//		HashSet  s1 = new HashSet();
//		s1.add("Mango");
//		s1.add("Apple");
//		s1.add("Banana");
//		s1.add("Mango");
//		s1.add("Strawberry");
//		s1.add("Cherry");
//		s1.add("Guava");
		
		// TreeSet will arrange in sorted order , no duplicates
//		TreeSet  s1 = new TreeSet();
//		s1.add("Mango");
//		s1.add("Apple");
//		s1.add("Banana");
//		s1.add("Mango");
//		s1.add("Strawberry");
//		s1.add("Cherry");
//		s1.add("Guava");
		
		LinkedHashSet s1 = new LinkedHashSet();
		s1.add("Mango");
		s1.add("Apple");
		s1.add("Banana");
		s1.add("Mango");
		s1.add("Strawberry");
		s1.add("Cherry");
		s1.add("Guava");
		
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
