class Laptop{
	int ram;
	String brand;
	float price;

	public void setRam(int r){
		ram = r;
	}
	public int getRam(){
		return ram;
	}
	//Constructor 
	public Laptop(){
		System.out.println("Constructor has called automatically");
	}
}

class TestLaptop{
	public static void main(String [] args){
		Laptop t1 = new Laptop();
		//t1.setRam(2);
		//t1.setBrand("Dell");
		//t1.setPrice(50000);
		System.out.println("MY LAPTOP Ram : " + t1.getRam() + " GB ");
	}
}