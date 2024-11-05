import java.util.Arrays;

class RotateArray{
	public static void main(String [] args){
		int a[] = { 35,6,76,4,8,49,24,75};
		int k=4;
		/*for(int num : a){
			System.out.println(num);
		}*/
		System.out.println(Arrays.toString(a));
		rotate(a,k);
	}

	public static void rotate(int []a, int k){
		int []temp=new int[a.length];
		int i,j;
		for(i=0;k<a.length ;i++){
			temp[i]=a[k];
			k++;
		}
		for(j=i,k=0;j<a.length;j++){
			temp[j]=a[k];
			k++;
		}
		System.out.println("Array after rotating:");
		/*for(int num : temp){
			System.out.println(num);
		}*/
		System.out.println(Arrays.toString(temp));
	}
}