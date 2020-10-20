class ConditionalStatement{
	public static void main(String[] args) {
		//Variable Declaration
		double desc,a,b,c;
		//Variable Initialization
		a=20;
		b=30;
		c=10;
		//Descriminent
		desc=(b*b)-(4*a*c);
		//Conditional Statements
		if(desc>0){
			System.out.println(desc);
			System.out.println("The root are real and unequal");
		}
		else if(desc<0){
			System.out.println(desc);
			System.out.println("The root are unequal and imaginary");
		}
		else if(desc==0){
			System.out.println(desc);
			System.out.println("The root are real and equal");
		}
	}
}