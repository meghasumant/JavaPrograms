// dynamically typed language : no=8
// statically typed language : int no=8;
import java.util.Scanner;

class Armstrong{
	public void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int no = sc.nextInt();
		checkArmstrong(no);
	}

	// Method prototype
	void checkArmstrong(int no){
		// 153  1*1*1 + 5*5*5 + 3*3*3 = 153 
		// 241  2*2*2 + 4*4*4 + 1*1*1 = 8+64+1 = 73
		// 370  27+ 343+ 0 = 370
		// 0  27+343+1 = 371 
		int sum = 0 ;
		int org = no;
		int d;
		while(no>0){
			d = no % 10 ;
                        sum = sum + d*d*d;
			no = no/10;
		}
		System.out.print("Sum of cubes of every digit = " + sum);
		if(sum == org){
			System.out.print("The number "+ org + " is Armstrong");
		}
		else{
			System.out.println("The number " + org + " is not Armstrong ");
		}
	}
	public static void main(String [] c){
		// Create an instance of class
		Armstrong a1 = new Armstrong();
		a1.accept();
	}
}