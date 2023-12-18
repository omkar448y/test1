package webelements11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_webelements_method {
	public static  void main (String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.youtube.com/");
	boolean	s1=driver.findElement(By.xpath("(//tp-yt-paper-button[@id='button'])[2]")).isDisplayed();
		System.out.println(s1);
}}
