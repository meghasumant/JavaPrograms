import java.util.Scanner;

class ReverseNumber{
	public int reverse(int no){
		int d, rev=0;
		// no        d       rev
		// 0         8       6478
		while(no>0){
			d = no%10;
			rev = rev*10 + d;
			no = no/10;
		}
		return (rev);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int no =sc.nextInt();
		ReverseNumber r1 = new ReverseNumber();
		int r = r1.reverse(no);
		System.out.println("Reverse : " + r);
		if(r==no){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}