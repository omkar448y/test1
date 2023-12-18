
package webelements11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allin {
	public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver",
	    		  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	     
	      //URL launch
	      driver.get("https://kite.zerodha.com/");
	      // JavaScript Executor to enter text
	      boolean sq=driver.findElement(By.xpath("//img[@alt='Kite']")).isDisplayed();
	     
	    System.out.println(sq);  
	      
	    boolean s1=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	    
	    System.out.println(s1);
	    
	   }
}
