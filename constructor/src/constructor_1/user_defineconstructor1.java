package constructor_1;

public class user_defineconstructor1 {//Step-I: Variable declartion (Non-static global variable)
	//Use-I:It copies the member of class into an object---->after creation of object
	//Use-II: Initialize non-static globle variable
	
	      int c;               //datatype variablename;
	      int d;               //datatype variablename;
	
      //Variable initialisation      
	      user_defineconstructor1()                     //user defined constructor
	 {
		 c=50;
		 d=10;
	 }

	  //usage
	  public void division() 
	  {
		     int divvalue=c*d;
		     System.out.println(divvalue);
	  }
	  
	public static void main(String[] args) 
	{
		//create object of same class
		user_defineconstructor1 S4=new user_defineconstructor1();
		     S4.division(); 
		     
		  //create object of different class
		     user_defineconastructor3 S3=new  user_defineconastructor3();   
		   S3.addition();
		  S3.multiplication();
	}
	  
	  
	  
}


