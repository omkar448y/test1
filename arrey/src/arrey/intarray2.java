package arrey;

public class intarray2 {
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
	      System.out.println(ar[0]);  //300
		   System.out.println(ar[1]);//100
		   System.out.println(ar[2]);//200
		   System.out.println(ar[3]);//500
		   System.out.println(ar[4]);//400
		   
		            //OR
		 System.out.println("------------------");  
		
		        //i=0    0<=4       1
		                //1<=4      2 
		               //2<=4      3
		               //3<=4      4
		               //4<=4       5
		              //5<=4  
		 for(int i=0;   i<=4;     i++ ) 
		{
			System.out.println(ar[i]); //300 100 200 500  400
		}
		 

	}}
