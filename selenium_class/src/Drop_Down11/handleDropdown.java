package Drop_Down11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown 
{
	public static void main(String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//to oprn the application 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//to click on create button fb page 
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("omkar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("omkaryadav448@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Omkar@123");
		
		Thread.sleep(3000);
	
		
		 WebElement s1=driver.findElement(By.xpath("//select[@id='day']"));
		 
		 Select a1=new Select(s1);
		 
		 
	  //List<WebElement> printall=	 a1.getOptions();
	//	for(WebElement n1:printall) 
	//	{
	//		System.out.println(n1.getText());
	//	}
		 
		 
	WebElement k1=	a1.getFirstSelectedOption(); 
	String l1= k1.getText();	 
	System.out.println(l1);	 
		 
		 
		 
		 
		 
		 
		 
		 
			//Select d1=new Select(s1);              //object of select class and pass object in select constructor
		//	d1.selectByVisibleText("2"); 
			
			
		
	//	WebElement l1=driver.findElement(By.xpath("//select[@id='month']"));	
		//Select n11=new Select(l1);
		//n11.selectByVisibleText("Jan");
		
	//	WebElement l2=driver.findElement(By.xpath("//select[@id='year']"));	
	//	Select n12=new Select(l2);
	//	n12.selectByVisibleText("1955");
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
