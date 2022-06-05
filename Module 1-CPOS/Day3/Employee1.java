//Program to check working of static variable
import java.util.Scanner;
class Employee1
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
	Employee1 e1=new Employee1();
	Employee1 e2=new Employee1();
	Employee1 e3=new Employee1();
	e1.display();
	e2.display();
	e3.id=10;
	e3.display();
	e1.display();
}
}