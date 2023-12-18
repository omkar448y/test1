package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {public static void main(String[] args)
{
	LinkedHashSet lh=new LinkedHashSet();
	
	//add information
	lh.add("abc");
	lh.add(100);
	lh.add('A');
	lh.add(65.5f);
	lh.add("abc");
	lh.add(null);
	lh.add(null);
		
	System.out.println(lh);
	
  //size 
	System.out.println(lh.size());
	
	//to verify empty or not
	System.out.println(lh.isEmpty());
	
	//to verify data
	System.out.println(lh.contains(100));
	
	
	System.out.println("-----iterator curser-----");
	
	          Iterator  itr=lh.iterator();
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
	
	System.out.println("----for each loop-----------");
	
	
	for(Object S2:lh) 
	{
		System.out.println(S2);
	}
	
	
	
	
}

}
