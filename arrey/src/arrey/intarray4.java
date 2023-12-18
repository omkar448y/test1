package arrey;

public class intarray4 {
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
	
		 System.out.println(ar.length);  //Size
	
	System.out.println("----------------------------------------");
	
		for(int i=4; i>=4; i--) 
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------------------------------------");

		           //OR
		     //i=0       0<=4                 1
		                //1<=4                2
		                //2<=4                3
		                //3<=4                4
		                //4<=4                5
		                //5<=4
		for(int i=0;    i<=ar.length-1;     i++) 
		{
			System.out.println(ar[i]);  //300  100  200   500   400
		}
		
		
		
		
	}

}
