/*if(condition1){
	if(condition2){
		statements
	}
}*/

import java.util.Scanner;

class Grade{
	public static void main(String [] args){
		int m1,m2,m3;
		System.out.println("Enter the marks of 3 subjects");
		Scanner sc= new Scanner(System.in);
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		int total = m1+m2+m3;
		int avg = total/3;
		System.out.println("Total marks : " + total);
		System.out.println("Average marks : " + avg);

		if(avg >=80){
			System.out.println("Distinction ");
		}
		else{
			if(avg>=60){
				System.out.println("First Class");
			}
			else{
				if(avg>=50){
					System.out.println("Second Class");
				}
				else{
					if(avg>=40){
						System.out.println("Pass");
					}
					else{
						System.out.println("Fail");
					}
				}
			}
		}
	}
}