import java.util.Scanner;

class WeekDay{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total days ");
		int days = sc.nextInt();
		System.out.println(days + " days = " + days/7 + " weeks and " + days%7 + " days");
	}
}

/*

days = 38
days/7
days%7

*/