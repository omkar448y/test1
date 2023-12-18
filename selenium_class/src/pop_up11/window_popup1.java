package pop_up11;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup1 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		//to click on new window element
		
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		
		//to provide implicitlywait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//to callgetwindow method to identify window popup
	    Set<String>	ids=driver.getWindowHandles();
		//to use arraylist collection becuse index structure
	  ArrayList<String> m1=new ArrayList<String>(ids);
		//to call get method 
		
     	String mainid=m1.get(0);
       String	childid=m1.get(1);
		
	  System.out.println(mainid);
	  System.out.println(childid);
		//to change focuse main page to child window
	  driver.switchTo().window(childid);

		
		//to click on traning button
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
			
		
	}

}
