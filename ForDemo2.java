class ForDemo2{
	public static void main(String [] args){
		int i=2;
		for(;;){
			System.out.println(i);
			i+=2;
			if(i>100){
				break;
			}
		}
	}
}