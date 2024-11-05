import java.util.Scanner;

class Reverse{
	public static void main(String [] args){
		int no,d,rev;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();

		//   no     rev      d
		//  0      4321       1
		rev=0;
		for(; no>0 ; no=no/10){
		//while(no>0){
			d = no%10;
			rev = rev * 10 + d;
		}
		System.out.println("Reverse : " + rev );
	}
}







121

454
67
87

