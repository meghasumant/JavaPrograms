class Car{
	private String brand;
	private int price;
	private String color;

	//setter method or mutator method
	public void setBrand(String b){
		brand=b;
	}

	public void setPrice(int p){
		price=p;
	}
	public void setColor(String c){
		color=c;
	}
	//getter method or accessor method
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
	public String getColor(){
		return color;
	}
}