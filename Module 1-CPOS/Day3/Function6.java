class Function6
{
	static int m=30;
	void display()
	{
		System.out.println("Userdefined....."+m);
	}
	void display(int x,float y)
	{
		int m=x;
		float n=y;
		System.out.println("Userdefined method1....."+(m+n));
	}
	void display(int x, int y, int z)
	{
		int m=x;
		int n=y;
		int p=z;
		System.out.println("Userdefined method2....."+(m+n+p));
	}
	public static void main(String args[])
	{
		Function6 f1=new Function6();
	    f1.display();
		f1.display(8,9);
		f1.display(8,9,10);
		System.out.println(f1.m);
	}
}
//Method overloading
//1.No of parameter
//2.Data types must matches
/*
add: addition is a purpose
-------------------------------
add(int, int);
add(float, float);
add(int, float);
add(int,int, flaot, string);*/

