package typeofveriable1;

public class globalvariable {
	
	public static void main(String[] args) {
		
		System.out.println(a);                                       //static method call from same class
		globalvariable n1=new globalvariable();                 //non static global method call from same class
		System.out.println(n1.b);
		
		
		
	}
	
	static int a=88;                            //ststic global variable
	
	
	int b=66;                                    //non static global method 
	
	public void m1() {                         
		
		
		System.out.println("omkar yadav");
	}

}
