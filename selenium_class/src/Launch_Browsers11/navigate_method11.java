package Launch_Browsers11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method11 {
	
	public static void main(String args[]) throws InterruptedException 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		//go back to flipkart
		driver.navigate().back();
		Thread.sleep(3000);
		
		//go forward google
		
		driver.navigate().forward();
		
		
		Thread.sleep(3000);
		
		
		// go back again
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//to refresh
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);		
		
		//to close
		
		driver.close();
		
		
		
		
		
	}
	

}
