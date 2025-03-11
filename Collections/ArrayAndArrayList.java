import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAndArrayList {
	public static void main(String[] args) {
		// primitive array
		int [] a = new int[5];
		
		a[0] = 12;
		a[1] = 34;
		a[2] = 4;
		a[3] = 50;
		a[4] = 10;
		
		for(int n : a) {
			System.out.println(n);
		}
		Arrays.sort(a);
		
		System.out.println("After Sorting : ");
		for(int n : a) {
			System.out.println(n);
		}
		
		Integer [] a2 = {12,56,76,46,2,5,23,65};
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
		List<Integer> list1 = Arrays.asList(a2);
		Collections.reverse(list1);
		System.out.println(list1);
	}
}
