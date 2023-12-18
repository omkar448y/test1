package Launch_Browsers11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathallinone 
{

	//main method 
	public static void main (String args[]) throws InterruptedException 
	{
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup/");
		
		
	
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("omkar");
	
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("omkar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("omkar");		
		
	}
	
	
	
	
	
	
	
}
