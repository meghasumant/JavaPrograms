import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m1 = new HashMap();
		// Map(Key,Value)
		m1.put("Megha",98);
		m1.put("Uma",92);
		m1.put("Yashada",67);
		m1.put(null, 81);
		m1.put("Asha",85);
		m1.put("Isha",98);
		m1.put("Megha", 77);
		m1.put("Asha", 66);
		m1.put(null, 87);
		System.out.println(m1);
	}
}
