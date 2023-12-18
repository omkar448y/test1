package webelements11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext1 
{
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");         //to open application with using get method 
		 Thread.sleep(3000);
		driver.manage().window().maximize();            // to maximizze the page 
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("JW0134");
		driver.findElement(By.xpath("//input[@maxlength='260']")).sendKeys("Omkar@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("448449");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("448448");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		String s1=driver.findElement(By.xpath("//span[text()='commodity']")).getText();
		
		System.out.println("Get text"+s1);
		boolean s2=driver.findElement(By.xpath("//img [@alt='Kite logo']")).isDisplayed();

		System.out.println(s2);
		
		
		
		
		
		
	}

}
