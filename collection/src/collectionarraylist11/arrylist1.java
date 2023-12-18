package collectionarraylist11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrylist1 {
	


	public static void main(String args[]) 
	{
		
		//create objrct 
		
		ArrayList al=new ArrayList();
		
		//add information
		
		al.add("Omkar");
		al.add(100);
		al.add('A');
		al.add(99.6f);
		al.add(100);
		al.add(null);
		al.add(null);

		
		//veryfy array list emptyor not
		System.out.println(al.isEmpty());
		//find size of arrylist
		System.out.println(al.size());
		//verify info present or not
		System.out.println(al.contains(100));
		//add info between arrylist
		al.add(4, 66.55f);
		System.out.println(al);
		//remove info
		System.out.println(al.remove(4));
		System.out.println(al);
	    //update info
		al.set(4, 500);
		System.out.println(al);
		//to find index using deta
		System.out.println(al.indexOf("Omkar"));
		//to find data by usinf index
		System.out.println(al.get(4));
		//iterator curser
		System.out.println("--------iterator courser----------");
		Iterator n1=al.iterator();
		while(n1.hasNext())
		{
			System.out.println(n1.next());
		}		
		
		System.out.println("----------list Iterator-----------------");
	ListIterator n2=al.listIterator();
		while(n2.hasNext()) 
		{
		System.out.println(n2.next());	
			
			
		}
		System.out.println("=====for each loop===========");
		//foe each loop
		
		for(Object a1:al) 
		{
			System.out.println(a1);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	

}
