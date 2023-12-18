package collectionarraylist11;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 
{
public static void main (String  args []) 
{

	
	HashSet v1=new HashSet();

	
	v1.add("omkar");
	v1.add(200);
	v1.add('A');
	v1.add(null);
	v1.add(null);
	v1.add(200);
	v1.add(55.555f);
	
System.out.println(v1);

System.out.println(v1.contains(100));
 System.out.println(v1.isEmpty());
System.out.println(v1.size());
v1.remove(200);
System.out.println(v1);
v1.add(200);
System.out.println(v1);

v1.add(66.8f);
System.out.println(v1);


System.out.println("6------------------iterator--------------------");

                        Iterator n1=v1.iterator();
                        while(n1.hasNext()) {System.out.println(n1.next());}

System.out.println("--------------------for each loop---------------------");

       for(Object b:v1) {System.out.println(b);}
                          







}
}
