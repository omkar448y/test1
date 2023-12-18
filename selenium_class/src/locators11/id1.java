package locators11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id1 {
	
	public static void main (String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement ck=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		ck.click();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://kite.zerodha.com/forgot");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input [contains(@type,'password')]")).sendKeys("Omkar@123");
		
		
		Dimension s1=new Dimension(400,900);
		
		driver.manage().window().setSize(s1);
		
		driver.manage().window().getSize();
		
		
		
	}
	
	
	
	
}
	
	