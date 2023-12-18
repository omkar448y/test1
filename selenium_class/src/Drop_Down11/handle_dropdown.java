package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_dropdown {

	
	public static void main(String args[]) throws InterruptedException 
	{
		
		//to call set property method
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");	
		
	
	//to create object of chrome class and give the reference of webdriver interface
		WebDriver driver=new ChromeDriver();
		
	     //to call the get method is the nin satatic method present in webdriver 	
		
		driver.get("https://www.facebook.com/");
		
	    //to maximize the page 
		
		Thread.sleep(2000);
		
	    driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//to provoid the wait to load all webelement
		Thread.sleep(2000);
		//to enter text into text field 

		WebElement dropdown=driver.findElement(By.xpath("//input[@name='firstname']"));
		dropdown.sendKeys("omkar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("omkaryadav@gamil.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Omkar@123");
		
		Thread.sleep(2000);
		//to find out the path of  day drop down 
		WebElement w1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select n1=new Select(w1);
		
		n1.selectByVisibleText("3");
		boolean f1=n1.isMultiple();
	    System.out.println("is Mutliselected :"+f1);
	    
	 WebElement j1=   n1.getFirstSelectedOption();
	 
	String k1= j1.getText();
	System.out.println("Day: "+k1);
	    //to find path  of month  drop down
	    
	    Thread.sleep(2000);
	 WebElement d1=   driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    //to cteate object of select class
	    Select b1=new Select(d1);
	    //to cal the selectbyvalue method is the non satatic method present in select class
	    b1.selectByValue("10");
	    
	    WebElement v1= b1.getFirstSelectedOption();
	    
	    
	     String b7= v1.getText();
	    System.out.println("month: "+b7);
	    
		//to find path  of year drop down menu
	    Thread.sleep(2000);
	 WebElement w4 =  driver.findElement(By.xpath("//select[@name='birthday_year']"));
	  
	 Select n3=new Select(w4);
	 
	 n3.selectByVisibleText("2009");
	 //to gate the text selected text box
	WebElement f2= n3.getFirstSelectedOption();
	String g1= f2.getText();
	 System.out.println("Year 2009 :"+g1);
	 
	 //to set size of page create object of dimension class
	 
	 Dimension l1=new Dimension(800,760);
	 driver.manage().window().setSize(l1);
	 
	Dimension p1= driver.manage().window().getSize();
	System.out.println("Page dimension"+p1); 
	//to refresh the page
	driver.navigate().refresh();
	
	//to provide the sleep
	Thread.sleep(2000);
	
	//to close thae application
	driver.close();
	}
	
	
}
