//Array by taking user input
import java.util.Scanner;
class Array1
{
	public static void main(String Args[])
	{
		int a1[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter Array Elements");
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<=4;i++)
		{
			System.out.println(a1[i]);
		}
	}
}
