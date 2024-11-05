
public  class Swap {
	static int a,b;
	public static void set() {
		a=97;
		b=86;
	}
	public  void swap() {
		a=a+b;
		b=a-b;
		a=a-b;
	}
	public void show() {
		System.out.println("Ok");
	}
	 class Sample{
		void test() {
			set();
			show();
		}
	}
}
