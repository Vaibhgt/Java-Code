Class Oops{
	private int empid;
	private String name;
	
	
	public void setempid(empid){
		this.empid=empid;
		
	}
	public int getempid(){
		this.empid=empid;
	}
	public void setname(name){
		this.name=name;
		
	}
	public String getname(){
		this.name=name;
	}
	
	
	
}
class OopsDemo{
	public static void main (String[] args){
		Oops o=new Oops();
		o.setempid(1);
		o.getempid();
		
		
	}
	
	
	
}