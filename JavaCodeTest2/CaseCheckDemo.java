import java.util.Scanner;
class CaseCheckDemo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//---------------------------------------------------
		System.out.println("Please enter a character");
		char c = sc.next().charAt(0);
		System.out.println("Please enter a character");
		if (c>='A' && c<='Z'){
			System.out.println("UpperCase");
		}
		else{
			System.out.println("LowerCase");
		}
		
		//-------------------------------------------
		
		System.out.println("Are you medically fit? Please enter 'Y' or 'N'");
		char c = sc.next().charAt(0);
		if(c=='Y'){
			System.out.println("You are allowed to sit");
		}
		else{
			System.out.println("You are not allowed to sit");

		}
		//--------------------------------------------------
		   
		/*System.out.println("Please enter number of class held");
		   float a=sc.nextInt();
		System.out.println("Please enter number of class atteneded");
		   float b=sc.nextInt();
		 float c=((b/a)*100);
		System.out.println("Attendance ="+c);
		if(c>=75){
		
		System.out.println("You are allowed for the exam");

		}
		else{
		System.out.println("You are not allowed for the exam");
		}*/
		//-----------------------------------------------------------
		
		/*System.out.println("Please enter ages");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b && a>c){
			System.out.println("a is oldest");
		}
		else if (b>a && b>c){
			System.out.println("b is oldest");
		}
		else{
			System.out.println("c is oldest");
		}
		if (a<b && a<c){
			System.out.println("a is youngest");
		}
		else if (b<a && b<c){
			System.out.println("b is youngest");
		}
		else{
			System.out.println("c is youngest");
		}*/
			
		
		//------------------------------------------------------
		System.out.println("Please enter a number");
		int a=sc.nextInt();
		if(a%2!=0){
			System.out.println("Weired");
		}
		else{
			if(a>=2 && a<=5){
			System.out.println("Not Weired");
			}
			else if (a>=6 && a<=20){
			System.out.println("Weired");
			}
			else{
			System.out.println("Not Weired");
			}
		}
			
		
		
	}
	
	
}