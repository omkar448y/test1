package collectionarraylist11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist3 
{

	
	public static void main(String[] args) 
	{
	String a1="omkar";
	String a2="OMKAR";
	String a3="yadav";
	
	
	System.out.println(a1.charAt(1));   //find char using index 
	System.out.println(a1.length());    //find length of String
	System.out.println(a1.equals(a2));  //to copmare to string
	System.out.println(a1.equalsIgnoreCase(a2));   //to compare two string 
	System.out.println(a1.startsWith("ka"));      //to find start with and return type of theis boolean
	System.out.println(a2.endsWith("AR"));
	System.out.println(a1.concat(a3));             //add two string
	System.out.println(a1.substring(2,3));//
	System.out.println(a1.toCharArray());
	System.out.println(a1.toUpperCase());
	System.out.println(a1.toLowerCase());
	System.out.println(a1.hashCode());
	System.out.println(a1.indexOf("k")); // to find of index of char
	System.out.println(a1.isBlank());    //to find this balank
	System.out.println(a1.isEmpty());    //to check this String are empty or not      
	
	System.out.println(a1.concat(a2).concat(a3));
	        
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
