//program to check working of static variable
import java.util.*;
class Employee2
{
	int a=102;
	static int id=101;
	void display()
	{
		System.out.println(a);
		System.out.println(id);
	}
	public static void main(String args[])
	{
		Employee2 e1=new Employee2();
		Employee2 e2=new Employee2();
		Employee2 e3=new Employee2();
		e1.display();
		e2.a=202;
		e1.display();
		e2.display();
		e3.display();
	}
}
		