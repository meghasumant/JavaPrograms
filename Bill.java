import java.util.Scanner;

class Bill{
	int no;// instance heap
	public void show(){
		int no;//local  stack
	}
	public static void main(String [] args){
		Bill b1 = new Bill();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity ");
		int qty = sc.nextInt();
		System.out.println("Enter the rate ");
		float rate = sc.nextFloat();
		System.out.println("Enter the name of Product ");
		String productname = sc.next();
		float bill = rate * qty ;
		System.out.println("The quantity of : " +productname + ": " + qty );
		System.out.println("The Rate : " + rate );
		System.out.println("The Bill : Rs." + bill + "/-");
	}
}