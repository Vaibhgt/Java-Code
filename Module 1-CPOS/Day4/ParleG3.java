// Program to use of this keyword in method and use of setdata() and getdata() function
class ParleG2
{
	int id;
	String name;
	double sal;
	static String branchid="Transport";
	void setdata(int id,String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
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
		ParleG2 e1=new ParleG2();
		ParleG2 e2=new ParleG2();
		ParleG2 e3=new ParleG2();
		e1.setdata(100,"Vaibhav",100000);
		e1.getdata();
	}
}