package constructor_1;

public class user_defineconstructor {
	
	
	public static void main(String[] args) {
		
		
		user_defineconstructor n1=new user_defineconstructor();            //non static method call from same class
		n1.m1();
		                                                                   //objectname.method name();
		
		m2();
		
		
	}
	
	//variable decleration 
	
	int a;
	int b;
	
	static int c;
	static int d;
	
	 user_defineconstructor(){
		 
		 a=55;                          //constructor 
		 b=66;
		 c=33;
		 d=77;
		 
	 }
	
	public void m1() {
		                            //non static method
		
		int sum =a+b;
		
		System.out.println("sum:"+sum);
	}
	
	public static void m2() {
		                           //static methos 
		
		 int div=c*d;
		 int div1=c+d;
		 System.out.println("mul "+div1);
		System.out.println("addition"+div);
	}
	

}
