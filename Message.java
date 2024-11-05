/*class ClassName{
	access return methodname(){

	}
	
	public static void main(String [] args){
		ClassName objectname = new ClassName();
		objectname.methodname();
	}
}
*/
/*
12345
1234
123
12
1
*/
import java.util.Scanner;
class Message{
	public void showPattern(int n){ 
		for(int i=n;i>=1;i--){
			//here
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void showPattern2(int n){ 
		for(int i=1;i<=n;i++){
			//here
			for(int j=i;j<=n;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String [] args){
		Message m1 = new Message();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many lines pyramid to print?");
		int n = sc.nextInt();
		m1.showPattern(n);
		//m1.showPattern2(n);
	}
}