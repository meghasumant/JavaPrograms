import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(45);
		a1.add(82);
		a1.add(23);
		a1.add(565);
		a1.add(51);
		a1.add(82);
		a1.add(45);
		//a1.add(4646.345345);
		//a1.add("Hello");
		System.out.println(a1);
		
		a1.remove(3);
		
		System.out.println(a1);
		
		a1.add(5,100);
		
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		System.out.println(a1.contains(82));
		
		Collections.sort(a1);
		
		System.out.println(a1);
	}
}
