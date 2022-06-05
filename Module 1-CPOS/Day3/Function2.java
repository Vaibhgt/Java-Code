//program to use 2 method within a class
class Function2
{
	void display()
	{
		System.out.println("Userdefined method....");
	}
	static void display1()
	{
		int k=1;
		System.out.println("Userdefined method...."+k);
	}
	public static void main(String args[])
	{
		Function2 f1=new Function2();
		f1.display();
		f1.display1();
	}
}