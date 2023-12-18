package constructor_1;

public class Sample5 {//Step-I: Variable declartion (Non-static global variable)
	//Use-I:It copies the member of class into an object---->after creation of object
	//Use-II: Initialize non-static globle variable
	
	      int Num1;             //datatype variablename;
	      int Num2;           //datatype variablename;
	String Studentname;  //Rohit       //datatype variablename;

	 //Step-II: Variable initialization

	Sample5()                   //without parameter user defined constructor
	{
		Num1=5;
		Num2=6;
	}
	
	Sample5(int a,int b)         //with parameter user defined constructor-->int
	{
		Num1=a;    
		Num2=b;  
		
		
	}
	
	Sample5(String Sname)  //Rohit    //with parameter user defined constructor-->String
	{
		Studentname=Sname;
	}
	

   //Usage 
      public void addition() 
      {
    	  int Sum=Num1+Num2;  
    	  System.out.println(Sum);
      }
      
     public void multiplication()
     {
    	    int mulvalue=Num1*Num2;  
    	    System.out.println(mulvalue);
     } 
	
     public void studentinfo() 
     {
    	 System.out.println(Studentname);  
     }


}
