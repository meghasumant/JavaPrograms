// Print factors of the number
// 24 = 2  2  2  3 
// 35 = 5 7 
// 36 = 2 2 3 3

import java.util.Scanner;

class PrimeFactors{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int no = sc.nextInt();
		int i = 2;

		// no    i 
		// 1     3
		while(no>1){
			if(no%i == 0){
				System.out.print(i+"  ");
				no = no / i;
			}
			else{
				i++;
			}
		}
	}
}