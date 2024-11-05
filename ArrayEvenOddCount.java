
public class ArrayEvenOddCount {
	//public  void evenOddCount(int [] a) {
	public static void evenOddCount(int [] a) {
		int evencount=0;
		int oddcount=0;
		for(int i=0; i<a.length; i++) {
			if(a[i] %2==0) {
				evencount++;
			}
			else if(a[i]%2==1) {
				oddcount++;
			}
		}
		System.out.println("Total Even numbers : " + evencount);
		System.out.println("Total Odd numbers : " + oddcount);
	}
	
	public static void main(String[] args) {
		int [] a= {35,65,76,34,7,8,37,45,24};
		//ArrayEvenOddCount a1 = new ArrayEvenOddCount();
		//a1.evenOddCount(a);
		evenOddCount(a);
	}
}
