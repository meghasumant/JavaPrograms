// Array Sort [ 45 , 76  , 87 , 89,  86,   82,  43, 56, 15 ,575 ]
// temp  =575
// j = 4  a[j] =575     a[j+1]= 86
// i = 1
import java.util.Scanner;

class ArraySortDemo1{
	/*void sort(int []a){
		int temp;
		for(int i=0; i<10; i++){
			for(int j=0; j<9-i; j++){
				if(a[j] > a[j+1]){
					temp=a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}*/

	//  [ 6 , 15  , 87 , 89,  43,   575,  76, 56, 45 ,82 ]
	// i   j 
	// 1   2
	void sort(int []a){
		int temp;
		for(int i=0; i<10; i++){
			for(int j=i+1; j<10; j++){
				if(a[i] > a[j]){
					temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	void print(int [] a){
		for(int i=0;i<a.length; i++){
			System.out.print(a[i]+ "  ");
		}	
	}
	public static void main(String [] args){
		int []a = new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 10 numbers ");
		for(int i=0; i<10; i++){
			a[i] = sc.nextInt();
		}
		ArraySortDemo1 a1 = new ArraySortDemo1();
		a1.sort(a);
		a1.print(a);
		
	}
}