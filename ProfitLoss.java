// Write a java class to accept cost price and selling price and print profit or loss amount using
// class and object concept
import java.util.Scanner;
class ProfitLoss{
	public void check(float cp, float sp){
		if(sp>cp){
			System.out.println("Profit : " + ( sp-cp));
		}
		else if(sp<cp){
			System.out.println("Loss : " +  (cp - sp ));
		}
		else{
			System.out.println("No Profit No Loss ");
		}
	}
	public static void main(String [] args){
		float cp,sp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost price and selling price ");
		cp = sc.nextFloat();
		sp = sc.nextFloat();
		// cp = 50     sp = 80   profit
		// cp = 50     sp = 40   loss
		// ClassName objectname = new ClassName();
		ProfitLoss p1 = new ProfitLoss();
		p1.check(cp,sp);
	}
}