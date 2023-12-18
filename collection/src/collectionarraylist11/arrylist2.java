package collectionarraylist11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrylist2 {
	
	public static void main(String args[]) 
	{
		
		
	ArrayList ary=new ArrayList();	
		
		
	ary.add("Omkar")	;
	ary.add("yadav");
	ary.add(88);
	ary.add(66.5f);
	ary.add('A');
	ary.add(null);
	ary.add(null);
	
	System.out.println(ary.indexOf("Omkar"));	
	System.out.println(ary.isEmpty());	
	System.out.println(ary.contains('A'));	
	System.out.println(ary.get(4));	
	System.out.println(ary.size());
	ary.add(4, 'B');
	System.out.println(ary);
	ary.remove(4);
	System.out.println(ary);
	System.out.println("-------------courset iterator");
	Iterator s1=ary.iterator();
	while(s1.hasNext()) {System.out.println(s1.next());}
	System.out.println("-------for loop ------------");
	for(Object b:ary) {System.out.println(b);}
	
	ListIterator s2=ary.listIterator();
	System.out.println("-----------------");
	while(s2.hasNext()) {System.out.println(s2.next());}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
