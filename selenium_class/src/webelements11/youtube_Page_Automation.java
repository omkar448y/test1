package webelements11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_Page_Automation {
	public static  void main (String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().to("https://meet.google.com/gne-fewq-hyx");
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Dimension S1=new Dimension (200,900);
		driver.manage().window().setSize(S1);
		Thread.sleep(2000);
		
		Point s2=new Point(400,500);
		driver.manage().window().setPosition(s2);
		
		
		Dimension s4=driver.manage().window().getSize();
		System.out.println("Window size"+s4);
		
		Point s5=driver.manage().window().getPosition();
		System.out.println("Window position"+s5);
		
		//webelement methods apply
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("KGf 2");
		
		
		
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("KGf 2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		driver.findElement(By.xpath("//yt-icon[@id='logo-icon']")).isDisplayed();
		
		
		
	}

}
