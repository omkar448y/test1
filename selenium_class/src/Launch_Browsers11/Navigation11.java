package Launch_Browsers11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation11 {
	
	public static void main(String args) throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
		
		Thread.sleep(3000);
		
		
		driver.navigate().to("https://www.google.com");
		
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		Thread.sleep(3000);
		
		
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		
		driver.close();
		
	}
}
