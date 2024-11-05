import java.util.Scanner;

//Write a program to accept a number from user and print how many digits the //number is.
class NoOfDigits{
	public static void main(String [] args){
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		no = sc.nextInt();
		if(no >=0 && no<=9 ){
			System.out.println("1 Digit Number");
		}
		else if(no>=10 && no<=99){
			System.out.println("2 Digit number");
		}
		else if(no>=100 && no<=999){
			System.out.println("3 Digit number");
		}
		else {
			System.out.println("More than 3 digit number");
		}
	}

}