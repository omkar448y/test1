package Stringarray;

import java.util.Arrays;

public class Stringassending {
	public static void main(String[] args)
	{
		   // Array declartion
		
	    String[] A=new String[4];
		
	    //Array Initilisation
		
	       A[0]="Virat";
		   A[1]="Rohit";
		   A[2]="Rahul";
		   A[3]="MSD";
		   
		   //Usage
		   Arrays.sort(A);;
		
		
		for(int i=0;   i<=A.length-1;  i++ ) 
		{
			System.out.println(A[i]); 
		}
		
		
	}
	
	
}
