//Program to print constructor and method in a single program
class Constructor1

{
	Constructor1()//Default Constructor
	{
		System.out.println("Welcome to CDAC Mumbai");
	}
	Constructor1(int x, int y)//Parametrized Constructor
	{
		int m=x;
		int n=y;
	    System.out.println("Vaibhav "+m+" "+n);
	}
	void display()
	{
		System.out.println("Welcome to display method");
	}
	public static void main(String args[])
	{
		Constructor1 c1=new Constructor1();
		Constructor1 c2=new Constructor1(2,3);
		c1.display();
		c2.display();
	}
}
	
	