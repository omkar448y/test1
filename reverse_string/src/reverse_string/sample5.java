package reverse_string;

public class sample5 {
	
	public static void main(String args[]) {
		
		String in="sourabh yadav";
		String out="";
		
		for(int i=in.length()-1; i>=0; i--)
		
		out=out+in.charAt(i);
		System.out.println(out);
		
		sample5 n1=new sample5();           //non static call from same class
		n1.m1();
		
		
		
	}

	
	
		
		public void m1() 
		{
			
			String in="BHILAWADI";
			String out="";
			
			for(int i=in.length()-1; i>=0;i--)
				
				out=out+in.charAt(i);
			System.out.println(out);
					
			
			
			
			
		}
	
	
	
	
}
