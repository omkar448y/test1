package collectionarraylist11;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
	
	public static void main(String args[]) 
	{
		
		LinkedHashSet v1=new LinkedHashSet();
		
		v1.add("omkar");
		v1.add(200);
		v1.add('A');
		v1.add(55.55f);
		v1.add(200);
	v1.add(null);
	v1.add(null);
	
System.out.println(v1);
		
		System.out.println(v1.isEmpty());
		System.out.println(v1.contains(200));
		System.out.println(v1.contains(2000));
		System.out.println(v1.size());
		
		v1.add('D');
		System.out.println(v1);
				v1.remove('D');
				System.out.println(v1);
				
				
				System.out.println("--------------iterator courser----------------");
				
				
				
				Iterator new1=v1.iterator();
				
				while(new1.hasNext()) {System.out.println(new1.next());}
				
				System.out.println("--------for each looop--------------");
				
				
				for(Object b:v1) {System.out.println(b);}
				
				
				
				
				
				
				
				
				
				
				
				
				
	}}	