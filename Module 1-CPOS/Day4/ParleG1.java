class ParleG1
{
int id;
String name;
Double sal;
static String branchid="Transport";
void setdata(int empid, String empname,double empsal)
{
	id =empid;
	name=empname;
	sal=empsal;
}
void getdata()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(sal);
	System.out.println(branchid);
}
public static void main(String args[])
{
	ParleG e1=new ParleG();
	ParleG e2=new ParleG();
	ParleG e3=new ParleG();
	e1.setdata(111,"Vaibhav",100000);
	e1.getdata();
	e2.setdata(1,"Vivek",2200000);
	e2.getdata();
	e2.branchid="Production";
	e2.getdata();
	
}
}