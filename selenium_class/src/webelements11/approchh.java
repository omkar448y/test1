package webelements11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class approchh {
	
	public static void main (String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
driver.navigate().to("https://kite.zerodha.com/forgot");		
driver.manage().window().maximize();
		

	boolean s1=driver.findElement(By.xpath("//label[text()='I remembemy user ID']")).isSelected();
		System.out.println(s1);
		
		Thread.sleep(3000);
		driver.navigate().to("https://kite.zerodha.com/forgot");
		
		
		
		
		
		
	}}