import java.util.Scanner;
class MatrixDemo1{
	
	public static void main(String [] args){
		//DataType [] arrayname = new DataType[size]; // Array Declaration
		// int [] a = new int [10];
		// [0,0,0,0,98,0,97,0,0,0,0]
		// a[4]=72;
		// a[4]=98;
		// DataType [] arrayname = {56,76,98,34,87}; // Array Initialization

		// String [] names = new String[5];
		// names[0]="Megha";
		// names[1]="Isha";
		// names[2]="Ojas";

		// String [] names = {"Megha","Isha","Ojas"};

		// Matrix -> multidimentional array
		// DataType[] a = new DataType[size];
		// DataType [][] m = new DataType[rowsize][colsize];


		int [][] m = new int [3][4];
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in 3x4 matrix");
		for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				m[i][j] = sc.nextInt();
			}
		}

		System.out.println("The given matrix is : ");
		for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				System.out.print(m[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("\nThe transpose of matrix is : ");
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				System.out.print(m[j][i]+"  ");
			}
			System.out.println();
		}

		
	}
}