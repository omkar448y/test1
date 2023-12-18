package reverse_string;

public class sample1 {
	
	public static void main(String args[]) 
	
	{
		
		
			
			
		String input="BHILAWADI STATION";
		String output="";
		
		for(int i=input.length()-1; i>=0;i--)
		
		output=output+input.charAt(i);	
			System.out.println(output);
			
			System.out.println(input.length());
		
		
		String in="Sourabh";
		String out="";
		
		for(int i=in.length()-1; i>=0;i--)
			
			out=out+in.charAt(i);
		System.out.println(out);
		
		
		
		
		
		
		
	}

}
