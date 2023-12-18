package multidimentionalarry;

public class multidimentional2 {

	  // 0    1      2
//0 // 10	  20    30
//1	 // 40    50    60
		
	public static void main(String[] args) 
	{
		//Array declartion and initialisation
	
	int[][] ar1= {{10,20,30}, {40,50,60}};
		
		
		
		//Usage
	  
	  //Outer for loop for row     
	for(int i=0;   i<=1;   i++ ) 
	{
		//Inner for loop for Column 
		for(int a=0;  a<=2;    a++ ) 
		{
			System.out.print(ar1[i][a]+" "); 
			
			
		}
		System.out.println();
		
	}}}
	


