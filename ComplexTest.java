class ComplexTest{
	public static void main(String [] args){
		Complex c1 = new Complex(1.2f,3.6f);
		Complex c2 = new Complex(3.9f, 6.4f);
		c1.show();
		c2.show();
		Complex c3=new Complex();
		c3= c3.add(c1,c2);
		c3.show();
	}
}