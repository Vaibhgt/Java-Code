Interface I1{
	void m1();//method inside the interface are by default public and abstract
	void m2();
	
	
}


class Parent{
	m3(){
		System.out.println("method: m3");
		
	}
	
}


class AnnonymusInnerClassDemo{
	public static void main(String[] args){
		I1 i=new I1(){
			
			public void m1(){
			System.out.println("method: m1");
			}
			public void m2(){
			System.out.println("method: m2");
			}
			
			
		};
		Parent p=new Parent();
		p.m3();
		i.m1();
		i.m2();
		
		
	}
	
	
	
}

