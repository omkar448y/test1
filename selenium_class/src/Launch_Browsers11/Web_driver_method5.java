package Launch_Browsers11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver_method5 {
	
	public static void main(String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//get method to open Application
		driver.get("https://www.office.com/");
		
		
		//Print Application Titlaa and cirrent URL
		String Title=driver.getTitle();
		String Title1=driver.getCurrentUrl();
		System.out.println(Title);
		System.out.println(Title1);
		
		//Wait/pause
		
		
		 Thread.sleep(3000);
		 
		 
		 driver.navigate().to("https://www.flipkart.com/");
		 
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		 
		 driver.navigate().refresh();
		 
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
