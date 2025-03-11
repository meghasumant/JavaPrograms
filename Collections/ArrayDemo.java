
public class ArrayDemo {
	public static void main(String[] args) {
		// datatype [] arrayname = new datatype[size];
		// int [] a1 = new int[8];
		// String [] friends = new String[10];
		// Array of Product
		
		Product []cart = new Product[10];
		
		// Limitation of array is that it can store only similar elements
		// Another limitation is that the size if fixed.
		Product p1 = new Product(101,"Mobile",50000);
		Product p2 = new Product(102,"Laptop",70000);
		Product p3 = new Product(103,"Vaccum Cleaner",10000);
		Product p4 = new Product(104,"Iron",7000);
		Product p5 = new Product(105,"Blutooth Speaker",3000);
		Product p6 = new Product(106,"Shoes",700);
		Product p7 = new Product(107,"TShirt",800);
		Product p8 = new Product(108,"Tv",100000);
		Product p9 = new Product(109,"Watch",7000);
		Product p10 = new Product(110,"Cricket Kit",40000);
		
		cart[0]=p1;
		cart[1]=p2;
		cart[2]=p3;
		cart[3]=p4;
		cart[4]=p5;
		cart[5]=p6;
		cart[6]=p7;
		cart[7]=p8;
		cart[8]=p9;
		cart[9]=p10;
		/*
		for(int i=0; i<10; i++) {
			System.out.println(cart[i]);
		}*/
		
		// for each loop or enhanced for loop
		for(Product p : cart) {
			System.out.println(p);
		}
	}
}
