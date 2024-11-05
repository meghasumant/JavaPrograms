/*

	if(condition){
		statements;
	}
	else{
		statements;
	}

*/
import java.util.Scanner;

class EvenOdd{
	public static void main(String [] args){
		int no;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		no=sc.nextInt();
		if(no%2==0){
			System.out.println("The number is Even");
		}
		else{
			System.out.println("The number is Odd");
		}
	}
}