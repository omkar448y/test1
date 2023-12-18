package Screenshot11;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class screenshotflipkart {
	

	public static void main(String args[]) throws InterruptedException, IOException 
	{
		//to call sysytem.setproperty mehtod 
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");	
		//create object of cheome driver class and give referance of webdriver interface
	WebDriver driver=new ChromeDriver();	
		//to open application call the get method this is non static method present in webdriver interface
	driver.get("https://www.facebook.com/");	
		//to provide the wait 
	Thread.sleep(2000);	
	
	//to miximiza the page
	
	driver.manage().window().maximize();
//to find path  of webelements 
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//wait
	Thread.sleep(2000);
	
	
		Thread.sleep(5000);
		 File print= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     System.out.println(print);
	     
	     File n1=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\sample1.jpg");
	     
	     FileHandler.copy(print, n1);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
}


