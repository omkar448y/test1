package collectionarraylist11;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector2
{
	public static void main(String args[]) 
	{
		
		Vector n1=new Vector();
		
		n1.add("omkar");
		n1.add(55);
		n1.add('A');
		n1.add(null);
		n1.add(null);
		n1.add(55);
		
		System.out.println(n1.isEmpty());
		System.out.println(n1.indexOf('A'));
		System.out.println(n1.get(3));
		System.out.println(n1.size());
		System.out.println(n1.toString());
		n1.add(4, "yadav");
		System.out.println(n1);
		n1.remove(4);
		System.out.println(n1);
		
		System.out.println("------------iterator-----------------");
		
		Iterator n2=n1.iterator();
		while(n2.hasNext()) {System.out.println(n2.next());}
		
		ListIterator n3=n1.listIterator();
		
		while (n3.hasNext())
		{System.out.println(n3.next());}		
		
		
		System.out.println("---------------for loop-----------------");
		//for each loop
		
		
		for(Object b:n1) {System.out.println(b);}
		
		//enumuration
		System.out.println("------------enumeration---------------");
		
	Enumeration n4=n1.elements();
		
		while (n4.hasMoreElements())
		{
			System.out.println(n4.nextElement());
		}		
		
		
		
		
		
	}

}
