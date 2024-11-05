import java.util.Scanner;

class Palindrome{
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
		/*System.out.println("Enter any number ");
		int no =sc.nextInt();*/
		Palindrome r1 = new Palindrome();
		for(int no=1;no<=100;no++){
			int r = r1.reverse(no);
			if(r==no){
				System.out.println(no);
			}
		}
	}
}