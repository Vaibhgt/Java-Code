//Addition Program using 2 classes
class operation
{
	void add(int x, int y)
	{
		int z= x + y;
		System.out.println(z);
	}
}
class sum
{
	public static void main(String args[])
{
	operation O1=new operation();
	O1.add(8,9);
}
}
	
		
