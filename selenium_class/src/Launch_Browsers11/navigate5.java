package Launch_Browsers11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate5 {
	
	
	public static void main (String [] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://kite.zerodha.com/");
		driver.navigate().refresh();

		Thread.sleep(5000);
		
		driver.navigate().to("https://meet.google.com/gne-fewq-hyx");
		driver.navigate().refresh();

		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
driver.navigate().forward();
driver.navigate().refresh();
		
Thread.sleep(10000);

		driver.close();
	}

}
