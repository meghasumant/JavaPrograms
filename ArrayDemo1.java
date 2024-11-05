import java.util.Scanner;

class ArrayDemo1{
	public static void main(String [] args){
		int [] marks = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 5 subjects");
		for(i=0; i<5 ; i++){
			marks[i] = sc.nextInt();
		}

		int total=0;
		for(i=0;i<5;i++){
			System.out.println("Marks of subject " + (i+1) + " : " + marks[i]);
			total = total + marks[i];
		}
		System.out.println("Total marks : " + total);
	}
}