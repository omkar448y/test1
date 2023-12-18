package collectionarraylist11;

import java.util.LinkedList;
import java.util.ListIterator;

import collection.Linked_list;

public class linked_list 
{
	public static void main(String args[]) 
	{
		
	 LinkedList v1=new LinkedList();
	
	 v1.add("omkar");
	 v1.add("Yadav");
	 v1.add('A');	
	v1.add(100);
	v1.add(200);
	v1.add(100);	
	v1.add(null);
	v1.add(null);
	
	System.out.println(v1.indexOf('A'));
	System.out.println(v1.contains(100));
	System.out.println(v1.isEmpty());
	System.out.println(v1.get(5));
	System.out.println(v1.size());
	v1.add(3, 500);
	System.out.println(v1);
	v1.remove(3);
	System.out.println(v1);
	
	System.out.println("--------iterator------");
	
	
	ListIterator v2=v1.listIterator();
	while(v2.hasNext()) {System.out.println(v2.next());}
	
	
	System.out.println("-----------list iterator------------");
	
	ListIterator w1=v1.listIterator();
	while(w1.hasNext()) {System.out.println(w1.next());}
	
//for reach loop
	
	for(Object b:v1) {System.out.println(b);}
	
	
	
	
	
	
	}
	
	

}
