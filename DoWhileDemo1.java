import java.util.Scanner;

class DoWhileDemo1{
	public static void main(String [] args){
		int no,sum=0;
		char opt;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter any number ");
			no = sc.nextInt();
			sum = sum + no ;
			System.out.println("Do you want to add another number ? y/n ");
			opt = sc.next().charAt(0);
			//opt = (char) System.in.read();
		}while(opt=='y' || opt=='Y');
		System.out.println("Sum of all entered number : " + sum);
	}
}