//Constructor Chaining
class MEssage
{
	MEssage()
	{
		this ("Arvind");
		System.out.println("Default Constructor....");
	}
	MEssage(String Name)
	{
		System.out.println("Parametrised Constructor..... "+Name);
	}
	public static void main(String Args[])
	{
		MEssage m1=new MEssage();
		MEssage m2=new MEssage("radha");
	}
}
		