package multidimentionalarry;

public class multidimentional {
	
	
		
		
		  // 0    1      2
		 //0 // 10	  20    30
		//1	 // 40    50    60
				
			public static void main(String[] args) 
			{
				//Array declartion
				int[][] ar=new int[2][3];
				
				//Array Initilisation
				  ar[0][0]=10;
				  ar[0][1]=20;
				  ar[0][2]=30;
				  ar[1][0]=40;
				  ar[1][1]=50;
				  ar[1][2]=60;
				  
				  //Usage
				  
				  //Outer for loop for row     
				for(int i=0;   i<=1;   i++ ) 
				{
					//Inner for loop for Column 
					for(int a=0;  a<=2;    a++ ) 
					{
						System.out.print(ar[i][a]+" "); 
						
						
					}
					System.out.println();
					
				}
				
				
			}
			
		
		
	}


