package arrey;

public class intarrayreverse { public static void main(String[] args) 
{
	
    // Array declartion
   int[] ar=new int[5];
  
//Array Initilisation
   ar[0]=300;
   ar[1]=100;
   ar[2]=200;
   ar[3]=500;
   ar[4]=400;

//Usage
   
      //i=4;      4>=0        3
                //3>=0        2
                //2>=0        1
                //1>=0        0
                //0>=0       -1
                //-1>=0
 for(int i=4;    i>=0;     i--  ) 
{
	   System.out.println(ar[i]); //400  500  200   100 300
}


}}
