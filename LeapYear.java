class LeapYear{
	public void check(int year){
		if(year%4==0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not Leap Year");
		}
	}
	public static void main(String [] args){
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year");
		year = sc.nextInt();
		LeapYear p1 = new LaepYear();
		p1.check(year);
	}
}