package polymorphism;

public class son extends father {
	 // Sub-class	
		public void mobile() 
		{
			System.out.println("Mobile:samsung");
		}
		//method overridden
		public void money()                    //method declartion
		{
			System.out.println("Money:1.5 lakh");  //method defination
		}
		
		//method overridden
		public void car() 
		{
			System.out.println("Car:kia seltos"); //method defination
		}
		//method overridden
		public void Home() 
		{
			System.out.println("Home:3 BHK");      //method defination
		}
		

}
