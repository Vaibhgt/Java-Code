import java.util.*;
class ArrayListDemo{
	public static void main (String Args[]){
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		l.add("1");
		l.add("2");
		l.add("2");

		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(null);
		System.out.println(l);
		l.add(4,"Vaibhav");
		System.out.println(l);
		
		
		
	}
	
	
}