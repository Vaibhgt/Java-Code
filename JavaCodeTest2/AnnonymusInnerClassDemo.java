interface I1{
	void m1();//method inside the interface are by default public and abstract
	void m2();
	
	
}


class Parent{
	void m3(){
		System.out.println("method: m3");
		
	}
	
}
abstract class Vehicle{
	abstract void engine();
	
	
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
		Parent p=new Parent(){
			void m3(){
				System.out.println("Childmethod: m3");
			}
			
			
		};
		Vehicle v=new Vehicle(){
			void engine(){
			System.out.println("Vehicle: V");
			}
		};
		p.m3();
		i.m1();
		i.m2();
		v.engine();
		
		
	}
	
	
	
}

