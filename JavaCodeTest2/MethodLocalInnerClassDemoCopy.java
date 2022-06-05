class OuterClass{
	int a=1;
	void m1(){
		int b=2;
		System.out.println(b);
		class MLIC{
			int c=3;
			
		}
		//MLIC mlic=new MLIC();
		//System.out.println(mlic.c);
		
			
	}
		
}
	class MethodLocalICDemoCopy{
	public static void main(String[] args){
		OuterClass oc=new OuterClass();
		System.out.println(oc.a);
		//oc.m1();
		
		oc.m1();
		//OuterClass.MLIC mlic=oc.new MLIC();
		//System.out.println(mlic.c);
		
	
		
		
		
	}
	
	
}