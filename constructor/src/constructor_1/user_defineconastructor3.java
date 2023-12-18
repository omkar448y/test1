package constructor_1;

public class user_defineconastructor3 {

	//: Variable declartion (Non-static global variable)
	//Use-I:It copies the member of class into an object---->after creation of object
	//Use-II: Initialize non-static globle variable
	
	      int a;               //datatype variablename;
	      int b;               //datatype variablename;
	
	  //Step-II: Variable initialization
	    user_defineconastructor3 ()                   //user-defined constructor   
	      {
	    	a=10;
	    	b=20;	  
	      }
	
	// Step-III: usage
	      public void addition() 
	      {
	    	  int Sum=a+b;
	    	  System.out.println(Sum);
	      }
	      
	     public void multiplication()
	     {
	    	    int mulvalue=a*b;
	    	    System.out.println(mulvalue);
	     } 
	      
	   
	     public static void main(String[] args) 
	     {
			//create object of same class 
	    	 user_defineconastructor3 S1=new user_defineconastructor3();
	    	 //call the methods
	    	   S1.addition();
	    	   S1.multiplication();
	
	
	
}}
