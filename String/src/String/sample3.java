package String;

public class sample3 {
	
	
	public static void main(String args[]) 
	{
		
		String s1="velocity";
		String s2="";
		String s3="ABCD";
		String s4="VELOCITY";
		String s5="city";
		String s6="abcabab";
		String s7="classes";
		String s8="manual classes";
	
		System.out.println("-----find lenght----------- ");
		
		System.out.println(s1.length());
		
		System.out.println("---------find empty or not-----------");
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s2.isEmpty());
		
		System.out.println("------upper cade print--------");
		
		System.out.println(s1.toUpperCase());
		
		System.out.println("---------lower case print_-------------");
		
		System.out.println(s4.toLowerCase());
		
		//compare 2 Strings
		
		System.out.println("------------compare----------");
		
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.contains(s5));
		
		System.out.println(s4.contains(s5));
		
	
		System.out.println("------------no find char----------");
		
		System.out.println(s1.charAt(5));
		
		System.out.println("-----------start with name find-----------");
		
		System.out.println(s1.startsWith("ve"));
		
		System.out.println(s1.startsWith("ci"));   
		
	//	String s1="velocity";
	//	String s2="";
	//	String s3="ABCD";
	//	String s4="VELOCITY";
	//	String s5="city";
	//	String s6="abcabab";
	//	String s7="classes";
	//	String s8="manual classes";
		
		System.out.println("-----------------end with name---------------");
		
		System.out.println(s1.endsWith("ty"));
		
		System.out.println("--------------find index no--------------");
		
		System.out.println(s1.indexOf("c"));
		
		System.out.println(s1.indexOf("l"));
		
		System.out.println("------lastindex----------");
		
		System.out.println(s6.lastIndexOf('a'));
		
		System.out.println("----------print last 4 or more char-----------");
		
		System.out.println(s1.substring(4));
		
		System.out.println("----------print mid char--------------");
		
        System.out.println(s1.substring(2,5));
        
        
        System.out.println("----------String + String-------------");
        
        
        System.out.println(s1+s2);
        
        System.out.println(s1.concat(s7));
        
        System.out.println("-------------replace---------");
        
        System.out.println(s8.replace("manual", "Automatiom"));
        
        
        
        
        
        
        
        
        
}}
