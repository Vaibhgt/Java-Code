//Encapsulation
class Oops{
	private int empid;
	private String name;
	
	public Oops(int empid, String name){
		this.empid=empid;
		this.name=name;
	}
	
	public void setempid(int empid){
		this.empid=empid;
		
	}
	public int getempid(){
		return this.empid;
	}
	public void setname(String name){
		this.name=name;
		
	}
	public String getname(){
		return this.name;
	}
	
	
	
}
class OopsDemo{
	public static void main (String[] args){
		Oops o=new Oops(2,"Vaibhav");
		o.setempid(1);
		System.out.println(o.getempid());
		System.out.println(o.getname());
		
		
	}
	
	
	
}