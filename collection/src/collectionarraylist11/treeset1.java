package collectionarraylist11;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset1 {
	
	public static void main(String args[]) 
	{
		
	
	TreeSet v1=new TreeSet();	
		v1.add(700);
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(400);
		v1.add(500);
		v1.add(300);
		System.out.println(v1);
		
		System.out.println(v1.isEmpty());
		System.out.println(v1.contains(300));
		System.out.println(v1.size());
		System.out.println(v1.first());
		System.out.println(v1.last());
		System.out.println(v1.pollFirst());
		System.out.println(v1.pollLast());
		
	Iterator n1=v1.iterator();	
	
		while(n1.hasNext()) {System.out.println();}
	}

}
