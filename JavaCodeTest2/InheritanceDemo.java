//Inheritance

class Parent{
	
	void m1(int a){
		
		System.out.println("P:m1");
		
	}
	
}



class Child extends Parent{
	 protected void m1(int a){
		
	  System.out.println("C:m1");
		
	}
	
	
	
}



class InheritanceDemo{
	public static void main(String args[]){
		Parent p=new Parent();
		p.m1(1);
		Child c=new Child();
		c.m1(1);
		
		
	}
	
	
}