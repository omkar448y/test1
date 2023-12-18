package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list {
	public static void main(String[] args) 
	{    
		LinkedList l1=new LinkedList();
		// To add information
		l1.add("Rahul");
		l1.add(100);
		l1.add('A');
		l1.add(65.5f);//80.2
		l1.add(100); //200
		l1.add(null);
		l1.add(null);
		l1.add(200);
		
		System.out.println(l1);
		
		//size
		System.out.println(l1.size());
		//verify linked list is empty or not
		System.out.println(l1.isEmpty());
		//to verify data/information
		System.out.println(l1.contains('A'));
		
		//to add information in between linked list---->Right shift operation
		l1.add(4, 200);
		System.out.println(l1);
		
		//to remove information-->left shift operations 
		l1.remove(4);
		System.out.println(l1);
		
		//update information
		l1.set(3, 80.2f);
		System.out.println(l1);
		
		//to find index of information
		System.out.println(l1.indexOf("Rahul"));
		
		//to get the data by providing index
		System.out.println(l1.get(2));
		
		System.out.println("----iterator curser-----");
		
		         Iterator  itr=l1.iterator();
		         
		         while(itr.hasNext())
		         {
		        	System.out.println(itr.next()); 
		         }
		
		System.out.println("----Listiterator curser-----");       
		
		          ListIterator litr=l1.listIterator();
		
		       while(litr.hasNext()) 
		       {
		    	  System.out.println(litr.next()); 
		       }
		
		System.out.println("-------for each loop------------");
		
		for(Object S2:l1)
		{
			System.out.println(S2);
		}
		
		
	}
	
	
	
	

}
