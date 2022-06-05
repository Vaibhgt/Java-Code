//program to mention instace variable
class function4
{
	static int m=20;
	void display()
	{
		System.out.println("Userdefined method.....");
	}
    void display1()
	{
	    int m=30;
		System.out.println("Userdefined method...."+m);
	}
	public static void main(String args[])
	{
		function4 f1=new function4();
		f1.display();
		f1.display1();
	}
}