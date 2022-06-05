interface I1{
	void m1(int a, int b);
	
	
	
}
interface I2{
	void m2(int a, float b);
	void m2(int n1, double n2);
}






class LambdaExpressionDemo{
	public static void main(String[] args){
		I1 x=(c,d) -> {
			System.out.println("sum ");
			
		};
		x.m1(1,2);
		
		I2 y=(c,d) -> {
			System.out.println("sum1 ");
		};
		y.m2(1,1.1f);
	}
}