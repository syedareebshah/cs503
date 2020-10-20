class WhileLoop{
	public static void main(String[] args) {
		//Variable Declaration
		int num,sum;
		//Variable Initialization
		num=0;
		sum=1;
		//While Loop
		System.out.println("Sum of first 10 numbers:");
		while(num<=10){
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
	}
}