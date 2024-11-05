import java.util.Scanner;

class EvenOddDemo2{
	/*void acceptNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		EvenOdd(no);
	}*/
	void EvenOdd(int num){
		if(num %2 == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
	public static void main(String [] args){
		EvenOddDemo2 e1 = new EvenOddDemo2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		e1.EvenOdd(no);
	}
}