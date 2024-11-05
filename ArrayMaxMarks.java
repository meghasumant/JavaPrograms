/*
Array is a static collection of homogeneous elements.
Array elements are always stored in contiguous memory locations.
Array elements can be accessed by its index number
Index number always begins with zero
Syntax to create array 
datatype [] arrayname = new datatype[size];
datatype arrayname [] = new datatype[size];
*/

import java.util.Scanner;

class ArrayMaxMarks{
	public static void main(String [] args){
		int [] marks = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 10 students");
		
		for(int i=0;i<10;i++){
			marks[i] = sc.nextInt();
		}

		//int max = marks[0];
		int min = marks[0];
		for(int i=1; i<10; i++){
			/*if(marks[i] > max){
				max = marks[i];
			}*/
			if(marks[i] < min ){
				min = marks[i];
			}
		}		
		//System.out.println("Highest marks : " + max);

		System.out.println("Lowest marks : " + min);
				
	}
}
