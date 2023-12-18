package Launch_Browsers11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_Attribute 
{
	
	public static void main(String args[]) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		//Findelement is non static method to use finds elements
		//"//tagname[@attributename='attributevalue']".send key use of pass information
		
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("omkaryadav");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("omkar");
	
	}
	
	
	
	

}
