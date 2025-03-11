import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet s1 = new HashSet();
		s1.add(34);
		s1.add(90);
		s1.add(134);
		s1.add(613);
		s1.add(97);
		s1.add(513);
		s1.add(90);
		s1.add(134);
		s1.add(65);
		System.out.println(s1);
		s1.add(343);
		System.out.println(s1);
		
	}
}
