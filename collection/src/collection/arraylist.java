package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist 
{
	public static void main(String[] args) 
	{
		//create object of arraylist	
		ArrayList al=new ArrayList();
		//add the information
		   al.add("Rahul");
		   al.add(100);
		   al.add('A');
		   al.add(65.5f);
		   al.add(100);
		   al.add(null);
		   al.add(null);
		   
		System.out.println(al);
		//verify arraylist is empty or not
		System.out.println(al.isEmpty());//false
		//size
		System.out.println(al.size());//7
		
		//verify information is present in the object or not
		System.out.println(al.contains(100));//true
		
		//add information inbetween arraylist-->Right shift operation
		al.add(4, 200);
		System.out.println(al);
		
		//remove information-->Left shift operation
		al.remove(4);
		System.out.println(al);
		
		//update information
		al.set(3, 80.2f);
		System.out.println(al);
		
		//to find index of data
		System.out.println(al.indexOf("Rahul"));
		
		//to get data/information by providing index
		System.out.println(al.get(2));
	
		System.out.println("----------------iterator curser-----------------------------------");
		//iterator curser
		   Iterator itr=al.iterator();
		 
		 while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			
		}
		 
		System.out.println("---------listiterator curser---------------");
		 //listiterator
		 ListIterator ltr=al.listIterator();
		 
		 while(ltr.hasNext())
		 {
			System.out.println(ltr.next()); 
		 }
		  
		 //for each loop
		System.out.println("----For each loop----"); 
		 for( Object S1:al) //Rahul 100 A
		 {
			 System.out.println(S1);//Rahul 100
		 }
		 
		 
		
	}
	

}
