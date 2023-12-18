package Screenshot11;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class screenshot1FB 
{
	

	public static void main(String args[]) throws InterruptedException, IOException 
	{
		//to call sysytem.setproperty mehtod 
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");	
		//create object of cheome driver class and give referance of webdriver interface
	WebDriver driver=new ChromeDriver();	
		//to open application call the get method this is non static method present in webdriver interface
	driver.get("https://www.facebook.com/");	
		//to provide the wait 
	Thread.sleep(2000);	
	
	//to miximiza the page
	
	driver.manage().window().maximize();
//to find path  of webelements 
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//wait
	Thread.sleep(2000);
	
	//to enter text in to text field in Fb page
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("omkar");    //first name
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");       //last name

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("yadavomkar@gmail.com");    //mailid

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("omkar@123");          //password

		
		//to handle drop down
		
		//to select date
		
		WebElement d1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//create object of select class and pass object inside select constructor
		Select p1=new Select(d1);
		//to call methods objectname.methodname
		p1.selectByVisibleText("25");
		
		
	List<WebElement> allprint=	p1.getOptions();
		
	for(WebElement w1:allprint)
	{
		System.out.println("print birth day:  "+w1.getText());
	}
		
	
		System.out.println("--------Handle drop down-------");
		
		
		
		//to selct day 
	  WebElement d2=	driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select p2=new Select(d2);
		p2.selectByVisibleText("Jan");
		
		
		//to print text
       WebElement o1=p2.getFirstSelectedOption();
      String text=o1.getText();
     System.out.println(text);//jan
     
     //waiit
    Thread.sleep(2000);



	//to select year
	WebElement d3=	driver.findElement(By.xpath("//select[@name='birthday_year']"));	
	Select p3=new Select(d3);		
	p3.selectByVisibleText("1999");
	
	boolean k1=p3.isMultiple();
	System.out.println(k1); //falue 
	
	
	
	//wait
	Thread.sleep(2000);
	
	//radio button select
	WebElement click=driver.findElement(By.xpath("//input[@value='2']"));
	
	click.click();
	
	//to verify button are selected or not
      boolean h1=click.isSelected();
      System.out.println(h1);

	//wait
      
		Thread.sleep(5000);
		
		
		
		
		
		//to take screenshot and stored into destination folder
		 File print= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     System.out.println(print);
	     //to create object of file class, and pass the object into the file constructor 
	     File n1=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\sample1.jpg");
	     
	     FileHandler.copy(print, n1);
	     
	     
	}
}
