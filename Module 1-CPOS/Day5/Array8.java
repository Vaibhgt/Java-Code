import java.util.Scanner;
class Array8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a1[][]=new int[3][3];
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				System.out.print("Array Elements:");
				a1[i][j]=sc.nextInt();
			}
		}
		//Printing with for each loop
		for (int x[]:a1)
		{
			for (int y : x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}