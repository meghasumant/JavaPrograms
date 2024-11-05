import java.util.Arrays;

public class ArrayReverse {
	public static void arrayReverse(int [] a) {
		// [24,45,37,34,7,8,67,65,35]
		int start = 0;
		int end = a.length - 1;
		//start   end
		// 0      8
		
		while(start < end) {
			int temp;
			temp = a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int [] a= {35,65,76,34,7,8,37,45,24};
		//ArrayEvenOddCount a1 = new ArrayEvenOddCount();
		//a1.evenOddCount(a);
		System.out.println(Arrays.toString(a));
		arrayReverse(a);
	}
}
