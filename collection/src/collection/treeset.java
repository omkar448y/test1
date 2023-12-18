package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {public static void main(String[] args) 
{
	TreeSet tr=new TreeSet();

	tr.add(700);
	tr.add(600);
	tr.add(100);
	tr.add(200);
	tr.add(300);
	tr.add(400);
	tr.add(500);	
	tr.add(500);
	System.out.println(tr);
	
	System.out.println(tr.size());
	System.out.println(tr.isEmpty());
	System.out.println(tr.contains(300));
	
	//to remove information
	tr.remove(100);
	System.out.println(tr);
	
	//to remove 1st information
	tr.pollFirst();
	System.out.println(tr);
	
	//to remove last information
	tr.pollLast();
	System.out.println(tr);
	
	//to print 1st information
	System.out.println(tr.first());
	
	//to print last information
	System.out.println(tr.last());
	
	
	System.out.println("----iterator curser-----");
	
	               Iterator itr=tr.iterator();
	
	              while(itr.hasNext()) 
	              {
	            	System.out.println(itr.next());  
	              }
	
	System.out.println("--for each loop-------");
	
	
	for(Object S3:tr) 
	{
		System.out.println(S3);
	}
	
	
	
	
}


}
