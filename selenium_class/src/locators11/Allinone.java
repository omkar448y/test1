package locators11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allinone 
{
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Dimension s1=new Dimension(500,800);
		driver.manage().window().setSize(s1);
		Thread.sleep(3000);
		Dimension s2=driver.manage().window().getSize();
		System.out.println(s2);
		
		Point s3=new Point(300,800);
		driver.manage().window().setPosition(s3);
		
		Point s4=driver.manage().window().getPosition();
		System.out.println(s4);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();;
		
		boolean s5=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(s5);
		
		boolean s6=driver.findElement(By.xpath("//img[@alt='Kite']")).isDisplayed();
		System.out.println(s6);
		
		
		String s7=driver.getTitle();
		System.out.println(s7);
		
		String s9=driver.getPageSource();
		System.out.println(s9);
		String d1=driver.getCurrentUrl();
		
		System.out.println(d1);
		
		String d2=driver.getWindowHandle();
		System.out.println(d2);
		
	}
	
	
	
	
	
	
	

}
