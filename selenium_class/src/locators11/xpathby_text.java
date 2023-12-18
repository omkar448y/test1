package locators11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_text 
{
	
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//maximize Application
		driver.manage().window().maximize();
		
		//to setsize
		Dimension s1=new Dimension(500,700);
		driver.manage().window().setSize(s1);
		
		//to getsize
		Dimension s2=driver.manage().window().getSize();
		System.out.println(s2);
		
		
		
		// objectname.findelementmethod(by.xpath(xpathexpression)).sendkey(valuesto inter)
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("omkaryadav448@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar@123");
	
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		                              //tagname[text()='textvalu']".click()
		
	}



	
	
	
	

}
