import java.util.Scanner;
/*
class IfDemo1{
	public static void main(String [] args){
		String feeling;
		System.out.println("How are you feeling?");
		Scanner sc = new Scanner(System.in);
		feeling = sc.next();
		if(feeling.equals("hungry")){
			System.out.println("Order 1 Pizza on Zomato");
			System.out.println("Order 1 Rice Plate on Swiggy");
			System.out.println("Order 1 Roti and Dish on Zomato"); 
		}
	} 
}
*/

class PositiveNegative{
	public static void main(String [] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any number ");
		int no = sc.nextInt();
		if(no>0){
			System.out.println("The number is Positive");
		}	
		else{
			System.out.println("The number is Negative ");
		}
	}
}


