package Launch_Browsers11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method1 {
	
	public static void main (String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		// create Object Chromedriver and give referance of webdriver 
		
		WebDriver driver=new ChromeDriver();
		
		//open flipkart
		driver.navigate().to("https://www.flipkart.com/");
		
		//wait 3 sec
		
		Thread.sleep(3000);
		
		
		driver.navigate().to("https://www.google.com/");
		
		//wait 3 sec
		
		
		Thread.sleep(3000);
		
		
		//back to flipkart
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		
		// to google again
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		
		//refresh google
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		
		//close
		driver.close();
	}

}
