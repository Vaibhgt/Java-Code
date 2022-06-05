//program to mention instace variable
class function3
{
	int m;
	void display()
	{
		System.out.println("Userdefined method.....");
	}
	void display1()
	{
		System.out.println("Userdefined method...."+m);
	}
	public static void main(String args[])
	{
		function3 f1=new function3();
		f1.display1();
		f1.display();
	}
}
