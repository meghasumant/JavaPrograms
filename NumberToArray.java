import java.util.Scanner;
import java.util.Arrays;

class NumberToArray{
	// [0,0,0,0,0]
	public void ConvertToArray(int no){
		int temp =no;
		int digits=0;
		int d;
		while(no>0){
			d=no%10;
			digits++;
			no=no/10;
		}
		System.out.println("Total digits =" + digits);
		no=temp;
		int [] a = new int[digits];
		while(no>0){
			d=no%10;
			a[digits-1]=d;
			no=no/10;
			digits--;
		}
		/*for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}*/
		System.out.println(Arrays.toString(a));
	}
	public static void main(String [] args){
		NumberToArray a1 = new NumberToArray();
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		no=sc.nextInt();
		a1.ConvertToArray(no);
	}
}