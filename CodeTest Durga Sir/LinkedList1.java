import java.util.LinkedList;
public class LinkedList1{
	public static void main (String args[]){
		LinkedList l1=new LinkedList();
		l1.add(30);
		l1.add("a");
		l1.add("vaibhav");
		l1.add("kritika");
		l1.add(1,"b");
		l1.set(2,"Iti");
		l1.removeLast();
		l1.removeFirst();
		
		System.out.println(l1);

		
		
	}
}