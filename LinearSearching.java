import java.util.Scanner;

class LinearSearching{
	public static void main(String [] args){
		int [] a = new int[10];
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 10 numbers for array a ");
		// Accepting array elements 
		for(i=0;i<10; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number to search  ");
		int key = sc.nextInt();

		// a [12 65 76 45 78 34 23 7 342 458]
		// key = 50

		for(i=0;i<10;i++){
			if(key == a[i]){
				System.out.println("The number is found at position " + (i+1));
				break;
			}
		}
		if(i==10){
			System.out.println("The number is not found");
		}
	}
}