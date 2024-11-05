// WAP to print the amount according to type of movie ticket
// gold- 400 silver - 200  platinum - 600 prime- 800
import java.util.Scanner;

class MovieTicket{
	public static void main(String [] args){
		String type;
		System.out.println("Enter the type of movie ticket");
		Scanner sc = new Scanner(System.in);
		type = sc.next();
		if(type.equals("gold")){
			System.out.println("Movie Ticket Price : Rs. 400/-");
		}
		else if(type.equals("silver")){
			System.out.println("Movie Ticket Price : Rs. 200/-");
		}
		else if(type.equals("platinum")){
			System.out.println("Movie Ticket Price : Rs. 600/-");
		}
		else if(type.equals("prime")){
			System.out.println("Movie Ticket Price : Rs. 800/-");
		}
		else{
			System.out.println("Wrong type of movie ticket");	
		}

	}
}