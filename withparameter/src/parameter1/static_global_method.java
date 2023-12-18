package parameter1;

public class static_global_method {
	
	
	
	
	static int a=10;
	  static String sname="omkar yadav";
	
	public static void main(String args[]) {
		
		
		
		System.out.println(a);
		
		static_global_method n1=new static_global_method ();
		n1.m1();
		
		System.out.println(sname);
		
	}

	public static void m1() {
		
		int b=10;
		
		int c=a+b;
		
		System.out.println(c);
		
		
	}
	
	
	
	
	
}
