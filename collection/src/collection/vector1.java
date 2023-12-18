package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 {
	public static void main(String[] args) 
	{
		Vector V=new Vector();
		//add the information
		V.add("Rahul");
		V.add(100);
		V.add('A');
		V.add(65.5f);
		V.add(100);
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		//to verify object of vector class is empty or not
		System.out.println(V.isEmpty());//false
		//size
		System.out.println(V.size());//7
		//To verify information of an object
		System.out.println(V.contains(100));//true
		
		//Add information in between Vector--> Right shift operation
		   V.add(4, 200);
		   System.out.println(V);
		   
		   //remove/delete information in between Vector-->left shift operation
		    V.remove(4);
		    System.out.println(V);
		    
		   //update information
		    V.set(3, 80.2f);
		    System.out.println(V);
		    
		  //to find index of data
		    System.out.println(V.indexOf("Rahul"));//0
		    
		  //to get data/information by providing index
		    System.out.println(V.get(4));
		 
		    System.out.println("--------Iterator curser--------------");
		           Iterator itr=V.iterator();
		   
		     while(itr.hasNext())//true 
		    {
		          System.out.println(itr.next());	
		    }
		    
		    System.out.println("--------ListIterator curser--------------");
		     
		        ListIterator  litr=V.listIterator();
		     
		     while(litr.hasNext())
		     {
		    	 System.out.println(litr.next());
		     }
		     
		     System.out.println("--------Enumeration curser--------------");
		
		            Enumeration enu=V.elements();
		     
		     while(enu.hasMoreElements()) 
		     {
		    	System.out.println(enu.nextElement()); 
		     }
		            
		            //for each loop
		     System.out.println("-----------for each loop-----------");  
		            
		     for( Object S1:V) 
		     {
		    	 System.out.println(S1);
		     }
		     
		     
		     
		     
		     
		     
	}
}
