//Program to check types of variable
import java.util.Scanner;
class Employee
{
	int a=102;//Instance or object variable
	static int id=101;//Static variable
	
	void display()
	{
		System.out.println(a);
		System.out.println(id);
	}
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.display();
		e2.id=23;//local Variable
		e1.display();
		e2.display();
	
	}
}
	