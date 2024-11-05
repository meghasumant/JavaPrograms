// Reverse number
// Palindrome
// Armstrong
// factorial
// prime number
// Fibonacci series
import java.util.Scanner;

class Armstrong{
	public static void check(int no){
		int temp=no;
		int d,sum=0;

		// no     d     sum
		// 0      1     153
		while(no>0){
			d = no%10;
			sum = sum+ d*d*d;
			no = no/10;
		} 
		if(sum==temp){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("Not Armstrong");
		}
	}
	public static void main(String [] args){
		// 153   1*1*1 + 5*5*5 + 3*3*3 = 1+ 125+ 27=153
		// If the summation of cubes of every digit is same as that number
		// then it is called as Armstrong

		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		no=sc.nextInt();
		check(no);
	}
}