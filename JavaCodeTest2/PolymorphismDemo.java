//Overloading and overriding
class Parent{
	int a=2;
	public void m1(){
		
		System.out.println("1");
		
	}
	public void m2(int a){
		
	  System.out.println("3");
	}
	
	
}
class Child extends Parent{
	public void m1(){
		
		System.out.println("2");
		
	}
	public void m2(int a, int b){
		
		System.out.println("4");
	}
	
}

class PolymorphismDemo{
	
	public static void main(String args[]){
		
		Parent p=new Parent();
		p.m1();
		Child c=new Child();
		c.m1();
		Parent p1=new Child();
		p1.m1();
		//Child c= new Parent(p1);
		c.m2(1,2);
		
		
		
	}
	
	
}