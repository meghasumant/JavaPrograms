import java.util.Scanner;

class SwitchDemo2{
	public static void main(String [] args){
		String taste;
		Scanner sc = new Scanner(System.in);
		System.out.println("What kind of taste you like ?");
		taste = sc.next();
		switch(taste){
			case "sweet" : System.out.println("You can taste Ice cream, Gulab Jamun, Ladoo, Basundi, Jilebi ");
				break;
			case "spicy" : System.out.println("You can taste Batata Wada, Thecha, Misal Pav, Pav Bhaji");
			break;

			
		}
	
	}
}