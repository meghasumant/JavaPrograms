// Write a program to accept two numbers and print welcome if the first number is 3 digit number
// and print good bye if the second number is 2 digit number otherwise print Hello

class Test{
	public static void main(String [] args){
		int a,b;
		System.out.println("Enter any 2 numbers ");
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	
		if(a>=100 && a<=999){
			System.out.println("welcome");
		}
		else if(b>=10 && b<=99){
			System.out.println("good bye");
		}
		else{
			System.out.println("hello");

		}
	}
	
}