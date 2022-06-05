interface Vehicle{
	void Engine();
	void Wheel();
	
}

abstract class FourWheeler implements Vehicle {
	
	public void Wheel(){
		
		System.out.println("4");
		
		
	}
	
}

abstract class TwoWheeler implements Vehicle{
	public void Wheel(){
		
		System.out.println("2");
	}
	
	
}
class I20 extends FourWheeler{
	public void Engine(){
		System.out.println("4000cc");
	}
	
	
}

class RoyalEnfield extends TwoWheeler{
	public void Engine(){
		System.out.println("500cc");
	}
	
	
}
class InterfaceDemo {
	public static void main(String args[]){
		Vehicle v1=new I20();
		v1.Engine();
		Vehicle v2=new RoyalEnfield();
		v2.Engine();
		
		FourWheeler fw=new I20();
		fw.Engine();
		fw.Wheel();
		
		TwoWheeler tw=new RoyalEnfield();
		tw.Engine();
		tw.Wheel();
		
		//TwoWheeler tw1=new TwoWheeler();
		//tw1.Engine();
		//Vehicle v3=new Vehicle();
		//v3.Engine();
		
		
	}
	
	
}