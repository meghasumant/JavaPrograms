import java.util.Scanner;
class InputDemo{
	public static void main(String [] args){
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		name = sc.next();
		System.out.println("Enter your age");
		age=sc.nextInt();
		float salary;
		System.out.println("Enter your salary ");
		salary = sc.nextFloat();
		System.out.println("Hello !! " +name +" Your age is : " + age + " your salary : " + salary);
	}
}