import java.util.Scanner;

class ArrayDemo4{
	int convertToNumber(int []a){
		//[1,6,8,0,3,7,4,8,4,8]
		// no    i 
		//  16803   4
		int no=0;
		for(int i=0; i<a.length ; i++){
			no = no*10 + a[i];
		}
		return no;
	}

	public static void main(String [] args){
		int [] a = new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(int i=0;i<10;i++){
			a[i] = sc.nextInt();
		}
		ArrayDemo4 a1 = new ArrayDemo4();
		int n = a1.convertToNumber(a);
		System.out.println("No: " + n);
	}
}