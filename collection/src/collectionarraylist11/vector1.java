package collectionarraylist11;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 
{
	public static void main (String args[]) 
	{
		Vector v1=new  Vector();
		
		v1.add("omkar");  
		v1.add(100);
        v1.add('A');		
		v1.add(100);
		v1.add(null);
		v1.add(null);
		v1.add(55.88f);
		v1.add("yadav");
		
		
		System.out.println(v1.isEmpty());
		System.out.println(v1.indexOf('A'));
		System.out.println(v1.size());
		System.out.println(v1.contains("omkar"));
		v1.add(4, "Bhilawadi");
		System.out.println(v1);
		v1.remove(4);
		System.out.println(v1);
		
		System.out.println(v1.get(2));
		System.out.println(v1.indexOf("omkar"));
		
		//Courser
		
		System.out.println("--------iterator courser------");
		
		
		Iterator d1=v1.iterator();
		
		while(d1.hasNext()) 
		{
			System.out.println(d1.next());
			
		}
		
		System.out.println("--------listIterator------------");
		
		
		
		ListIterator s1=v1.listIterator();
		
		while (s1.hasNext()) 
		{
			System.out.println(" "+s1.next());
			
			
		}
		
		
		System.out.println("----------for loop--------");
		
		
		for(Object s2:v1) {System.out.println(s2);}
		
		
		
		
		
		
		
	}


	

}
