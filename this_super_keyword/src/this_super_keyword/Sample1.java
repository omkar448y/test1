package this_super_keyword;

public class Sample1 {

    int a=20;
   int b=30;
public void M1()
{
	int a=10;                        //local variable
	System.out.println(a); //10
	
	System.out.println(a); //10
	
	System.out.println(b); //30
	
	System.out.println(this.a);//20                 //this.variablename
	
}

public static void main(String[] args) 
{
	//create object of same class
	Sample1 S1=new Sample1();
	//call the method
	S1.M1();
	
}


}
