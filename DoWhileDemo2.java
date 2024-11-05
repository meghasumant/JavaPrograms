import java.util.Scanner;

// Menu Driven program
class DoWhileDemo2{
	public static void main(String [] args){
		int ch,no;
		Scanner sc = new Scanner(System.in);
		do{
			sop("1. Print Square and Cube of any number ");
			sop("2. Print Square root of any number ");
			sop("3. Print the reverse of any number ");
			sop("4. Exit ");
			sop("Enter your choice ");
			ch = sc.nextInt();
			switch(ch){
				case 1: //logic to print square
					break;
				case 2: System.out.println("Enter any number");	
					no= sc.nextInt();
					System.out.println("Square root = " + Math.sqrt(no);
					break;
				case 3: //logic
					break;
				case 4:
					break;	
			}
			
		}while(ch!=4);
	}
}