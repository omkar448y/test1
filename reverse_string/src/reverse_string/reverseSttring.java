package reverse_string;

public class reverseSttring 
{
	
	public static void main(String args[]) 
	{
		
		String in="Omkar yadav";
		
		String out="";
		
		for(int i=in.length()-1; i>=0; i--)
		{
			
			out=out+in.charAt(i); 
			
			
			
			
		}
		System.out.println(out);
		
		System.out.println(in.length());
		System.out.println(" "+in.concat(" "+out));
	}
	

}
