import java.util.Scanner;
class Array10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a1[][]=new int [3][3];
		int b1[][]=new int [3][3];
		int c1[][]=new int [3][3];
		
		//matrix input1
		for (int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				System.out.print("Array1 Elements:");
				a1[i][j]=sc.nextInt();
			}
		}
		//Matrix input2
		for (int i=0;i<b1.length;i++)
		{
			for(int j=0;j<b1.length;j++)
			{
				System.out.print("Array2 Elements:");
			    b1[i][j]=sc.nextInt();
			}
		}
		//addition of 1 and 2
		for (int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c1.length;j++)
			{
				
				c1[i][j]=a1[i][j]+b1[i][j];
			}
		}
		//for printing matrix1
		for(int x[]:a1)
		{
			for (int  y : x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//for printing matrix2
		for (int x[]:b1)
		{
			for (int y :x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//for Printing addition of matrix1 and matrix2
		for (int x[]:c1)
		{
			for(int y : x)
			{
				System.out.print(y+" ");
				{
					System.out.println();
				}
			}
		}
	}
}
		
				
		
		