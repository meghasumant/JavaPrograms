
public class Sample {
	public static void main(String[] args) {
		int roll=12;
		String name="Megha";
		float salary = 87652.866f;
		
		int roll2=12;
		String name2="Meena Gandhi";
		float salary2 = 8765.86f;
		//System.out.println(roll+"\t"+name+"\t"+salary);
		//System.out.println(roll2+"\t"+name2+"\t"+salary2);
		System.out.printf("\n%5d%20s%15.2f",roll,name,salary);
		System.out.printf("\n%5d%20s%15.2f",roll2,name2,salary2);
		
		//printf("format specifier",variable);
		// %d   int    %f   float     %c   char   %s  String
	}
}
