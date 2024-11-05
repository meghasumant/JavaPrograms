import java.util.Arrays;

class ArrayAdd{
	public static void main(String []args){
		int [] a = { 12,65,7,87,96,64};
		int [] b = { 12,65,75,98,989,965};
		int [] c = new int[a.length];
		if(a.length==b.length){
			for(int i=0;i<a.length;i++){
				c[i]= a[i]+ b[i];
			}
		}
		else{
			System.out.println("Both arrays are not of same length");
		}
		/*for(int i=0;i<6;i++) {
			System.out.println(c[i]);
		}*/
		System.out.println(Arrays.toString(c));
	}
}