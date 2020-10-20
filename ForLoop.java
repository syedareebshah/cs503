class ForLoop{
	public static void main(String[] args) {
		//Variable Declaration
		int product;
		//Variable Initialization
		product=1;
		//For Loop
		System.out.println("Product of first 10 numbers:");
		for(int num=1;num<=10;num++){
			product=product*num;
		}
		System.out.println(product);
	}
}