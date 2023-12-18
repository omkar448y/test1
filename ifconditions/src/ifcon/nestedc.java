package ifcon;

public class nestedc {
	
	
	public static void main(String[] args) {
		
	
		    	String Username="abc";
		    	String Password="xyz";
		    	 if("abc"==Username) //abc==abc
		    	 {
		    		 System.out.println("Correct username");
		    		 
		    		 if("xyz1"==Password) //xyz1==xyz
		    		 {
		    			System.out.println("Correct Password-->login sucessfull"); 
		    		 }
		    		 else 
		    		 {
		    			 System.out.println("Wrong Password-->login failed"); 
		    		 }
		    	 }
		    	 else 
		    	 {
		    		 System.out.println("Wrong username-->Login failed");
		    	}
		}
			
		



	

}

