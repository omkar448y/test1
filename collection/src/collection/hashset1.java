package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {
	public static void main(String[] args)
	{
		
		HashSet hs=new HashSet();
		//add the information
		hs.add("abc");
		hs.add(100);
		hs.add('A');
		hs.add(56.5f);
		hs.add(100);
		hs.add(null);
		hs.add(null);
			
		System.out.println(hs);		
		//size
		System.out.println(hs.size());
		//to verify empty or not
		System.out.println(hs.isEmpty());
		//to verify data
		System.out.println(hs.contains(100));
		
		//to remove information
		hs.remove('A');
		System.out.println(hs);
		
		System.out.println("------iterator curser--------");
		
		        Iterator  itr=hs.iterator();
		        
		        while(itr.hasNext()) 
		        {
		        	System.out.println(itr.next());
		        }
		
		
		System.out.println("-------for each loop------");
		        
		        for( Object S1:hs) 
		        {
		        System.out.println(S1);	
		        }
		        
		        
	}
	
}
