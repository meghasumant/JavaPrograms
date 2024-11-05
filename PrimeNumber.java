// Prime number is a number which is divisible by 1 and itself

import java.util.Scanner;

class PrimeNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		boolean flag= false;
		System.out.println("Enter any number ");
		int no = sc.nextInt();
		//   no      flag      i 
		//   25      true     5
		//for(int i = 2; i<no ; i++){
		for(int i = 2; i< Math.sqrt(no) ; i++){
			if(no%i==0){
				flag=true;
				break;
			}
		}
		if(flag==true)
			System.out.println("The number is Not Prime");
		else
			System.out.println("The number is Prime");
	}

}