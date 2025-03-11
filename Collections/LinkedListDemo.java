import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFirst(100);
		list1.addLast(300);
		list1.addFirst(874);
		list1.addLast(723);
		System.out.println(list1);
		list1.removeLast();
		System.out.println(list1);
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		list1.addAll(a1);
		System.out.println(list1);	
	}
}
