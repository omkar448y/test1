package polymorphism;

public class test2 {
	 // Method overloading
		public void addition(int a, int b)   //method declartion
		{
			int c=a+b;                       //method defination
			System.out.println(c);
		}
		
		public void addition(int a,int b,int c) 
		{
			  int sum=a+b+c;
			  System.out.println(sum);
		}
		
		public void addition(int a,int b,int c,int d) 
		{
			  int sum=a+b+c+d;
			  System.out.println(sum);
		}
		
		
}
