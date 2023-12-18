package reverse_string;

public class sample8 {
	public static void main(String args[]) {
	String in="Swara Yadav";
	String out="";
	
	
for(int i=in.length()-1;i>=0; i--) {
	
out=out+in.charAt(i);
}

System.out.println(out);



sample8 n1=new sample8();
n1.m1();
n1.m2();




}
	
	
public void m1() {
	
	
	int a=10;
	int b=2;
	
	int mul=0;
	
	for (int i=1; i<=a; i++) 
	{		
	mul=mul+b;			
	}
	System.out.println(mul);
}	
	
public void m2() {
	for(int i=1; i<=10;i++) {
		System.out.println(i);
	}
		

}	
	
	
	
	
}