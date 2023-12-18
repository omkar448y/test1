package Launch_Browsers11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods00 {

	public static void main(String args[]) 
	{
		
		// to open Browser
		//classname.methodname("version.name of browser.name", "path of browser");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of Chrome browser class and give referance of webdriver
		
		
		WebDriver driver=new ChromeDriver();
		
		//to open Application by using GET method
		
		driver.get("https://www.google.co.in/");
		
		
	}
	
	
	
}
