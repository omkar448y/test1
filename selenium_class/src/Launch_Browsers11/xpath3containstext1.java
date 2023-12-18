package Launch_Browsers11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath3containstext1 {
	
	public static void main(String args[]) 
	{
		
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		
}}
