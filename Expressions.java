class Expressions{
	public static void main(String[] args) {
		//Variable Declaration
		double x,y,a,b,c;
		//Variable Initialization
		a=20;
		b=30;
		c=10;
		//Quadratic Expression
		x=-b+Math.sqrt((b*b)-(4*a*c))/(2*a);
		y=-b-Math.sqrt((b*b)-(4*a*c))/(2*a);
		System.out.println("{"+x+","+y+"}");
	}
}