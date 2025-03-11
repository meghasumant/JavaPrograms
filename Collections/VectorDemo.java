import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		System.out.println("Vector capacity : " + v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		v1.add(70);
		v1.add(80);
		v1.add(90);
		v1.add(100);
		System.out.println("Vector capacity : " + v1.capacity());
		v1.add(110);
		System.out.println("Vector capacity : " + v1.capacity());
		System.out.println("Vector Size : " + v1.size());
		
	}
}
