package com;

public class con1 {
	static String a;
	int b=55;
	public void m1() {
		
		int b=10;
		System.out.println(b);
		System.out.println(this.b);
		
		System.out.println(b);
		
	}
	
	con1()
	{
		System.out.println("VElocity");
		
	}
	con1(int a)
	{
		
		System.out.println("omkar yadav");
		
	}
	public static void main(String[] args) {
		
		
		con1 n1=new con1();
		n1.m1();
		
		
		
		
	}

}
