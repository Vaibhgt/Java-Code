class operation
{
	int add ( int x, int y)
	{
		int z= x+y;
		return z;
	}
}
class sum1
{
	public static void main(String args[])
	{
		operation o1=new operation();
		System.out.println(o1.add(2,3));
		int a= o1.add(2,8);
		System.out.println(a);
	}
}