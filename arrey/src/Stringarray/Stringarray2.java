package Stringarray;

public class Stringarray2 {
	public static void main(String[] args)
	{
		   // Array declartion
		
	    String[] A=new String[4];
		
	    //Array Initilisation
		
	       A[0]="Virat";
		   A[1]="Rohit";
		   A[2]="Rahul";
		  
		   
		   //Usage
		   
		System.out.println(A[0]);   
		System.out.println(A[1]); 
		System.out.println(A[2]);   
		System.out.println(A[3]);   
		
		System.out.println("-----------------------------------------");
		
		for(int i=0;   i<=A.length-1;  i++ ) 
		{
			System.out.println(A[i]); 
		}
		
		
	}
	
	
	
	
	
}
