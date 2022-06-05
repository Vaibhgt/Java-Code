import java.util.Scanner;
class CaseCheckDemo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (c>='A' && c<='Z'){
			System.out.println("UpperCase");
		}
		else{
			System.out.println("LowerCase");
		}
		
		
		
		
		
	}
	
	
}