//Array print using for each loop
import java.util.Scanner;
class Array4
{
	public static void main(String args[])
	{
		int a1[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<=4;i++)
		{
			a1[i]=sc.nextInt();
		}
		//For each loop
		for (int x: a1)
		{
			System.out.println(x);
		}
	}
}
