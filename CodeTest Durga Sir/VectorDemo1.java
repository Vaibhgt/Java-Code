import java.util.*;
class VectorDemo1{
	public static void main(String args[]){
		Vector v=new Vector(20);
		System.out.println(v.capacity());
		for (int i=1;i<=20;i++){
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement(21);
		System.out.println(v);
		System.out.println(v.capacity());
		
	}
	
}