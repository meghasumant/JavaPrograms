class ContinueDemo{
	public static void main(String [] args){
		int no=1;
		while(no<10){
			if(no%2==0)	
				continue;
			else{
				System.out.println(no);
			}	
			no++;
		}
	}
}