class Outer{
	int a=1;
	void m1(){
		System.out.println("m1");
		
	}
	
class Inner{
	int a=2;
	void m2(){
		System.out.println("m2");
	}
class Inner2{
	int a=3;
	void m3(){
		System.out.println("m3");
	}
	
	
}
	
	
}	
	
}


class RegularInnerClassDemo1{
	public static void main(String args[]){
		Outer oc=new Outer();
		//Outer.Inner ic=oc.new Inner();
		Outer.Inner ic=new Outer().new Inner();
		Outer.Inner.Inner2 ic2=ic.new Inner2();
		
		oc.m1();
		ic.m2();
		
		
		System.out.println(oc.a);
		System.out.println(ic.a);
		ic2.m3();
		System.out.println(ic2.a);
		
		
		
		
	}
	
	
}