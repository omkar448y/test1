package arrey;

import java.util.Arrays;

public class intarrayasecnd1 {
	 public static void main(String[] args) 
     {
		
  	      // Array declartion
           int[] ar=new int[5];

          //Array Initilisation
             ar[0]=300;
             ar[1]=100;
             ar[2]=200;
             ar[3]=500;
             ar[4]=400;   
  	   
  	   //usage
          Arrays.sort(ar);            //To create ascending
  	   
  	   for(int i=0;  i<=ar.length-1; i++ ) 
  	   {
  		  System.out.println(ar[i]); 
  	   }
  	   
}}
