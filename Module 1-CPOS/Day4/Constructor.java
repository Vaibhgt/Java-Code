//Default and Parametrized constructor
class Constructor
{
	int m;
	double n;
	Constructor()//Default Constructor
	{
		System.out.println("default Constructor!!!!");
	}
	Constructor(int x,double y)//Parametrized Constructor
	{
		m=x;
		n=y;
		System.out.println("Parametrized Constructor"+m+" "+n);
	}
	Constructor(double y,int x)
	{
		m=x;
		n=y;
		System.out.println("Parameterized Constructor2"+m+" "+n);
	}
	Constructor(int x,int y,int z)
	{
		m=x;
		int n1=y;
		int k=z;
		System.out.println("Parametrized Constructor3 "+m+" "+n1+" "+k);
	}
		
	public static void main(String args[])
	{
		Constructor C1=new Constructor(20,20.11);
		Constructor C2=new Constructor();
		Constructor C3=new Constructor(20.12,20);
		Constructor C4=new Constructor(1,2,3);
		
	}
}