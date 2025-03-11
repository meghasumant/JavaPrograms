import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		/*ArrayList a1 = new ArrayList();
		a1.add(124);
		a1.add(464);
		a1.add(13);
		a1.add(87);
		a1.add(6132);
		a1.add(34);
		a1.add(464);
		a1.add(24);
		a1.add(13);
		a1.add(87);*/
		
		ArrayList<String> a1 =new ArrayList<String>();
		//Creating arraylist  
		a1.add("Harry");//Adding object in arraylist  
		a1.add("Gina");
		a1.add("Luna");
		a1.add("Ron");
		//Traversing list through Iterator  
	
		// 1st Way to print
		System.out.println(a1);
		
		// 2nd way to print using for loop
		System.out.println("Printing the elements using normal for loop");
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		// 3rd way to print using for each loop
		//for(datatype varname: collection)
		// while reading the loop we can say 
		// for each String x in a1
		System.out.println("Using for each loop :");
		for(String x : a1) {
			System.out.println(x);
		}
		// 4 th way to print the arraylist using Iterator
		System.out.println("Printing using Iterator");
		Iterator i1 = a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
