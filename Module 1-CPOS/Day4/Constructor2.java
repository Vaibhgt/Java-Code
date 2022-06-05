//program to use this keyword in constructor
class Constructor2
{
	int m;
	double n;
	Constructor2()
	{
		m=5;
		System.out.println("Default Constructor"+m);
	}
	Constructor2(int m, int n)
	{
		this.m=m;
		this.n=n;
		System.out.println("Parametrized Constructor "+m+" "+n);
	}
	void Vaibhav()
	{
		System.out.println("Method...."+m);
	}
	public static void main(String Args[])
	{
		Constructor2 c1=new Constructor2();
		Constructor2 C2=new Constructor2(5,8);
		c1.Vaibhav();
	}
}
		