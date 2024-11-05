import java.util.Scanner;

public class BubbleSortDemo {
	public void show1() {
		try {
		show2();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	public void show2() {
		show3();
	}
	public String toString() {
		return "";
	}
	public void show3() {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		BubbleSortDemo b1 = new BubbleSortDemo();
		b1.show1();
		Scanner sc = new Scanner(System.in);
		System.out.println("End");
		sc.close();
	}
}
