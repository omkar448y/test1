package typeofveriable1;

public class nonvariable {
	
	
	//non static global variable call from same class
	
	int z=500;
	public static void main(String []args) {
		
		                //class name and variable name
		
		
		nonvariable n1=new nonvariable();
		
		System.out.println(n1.z);                    //objectname.variable name
		
		class2 n2=new class2();
		
		System.out.println(n2.om);  
		System.out.println(n2.i);                                      //objectname.variablename
	}
	
	public void m1() {
		
		
		System.out.println(z);
	}
	

}
