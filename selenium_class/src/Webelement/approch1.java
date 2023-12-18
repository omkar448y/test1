package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class approch1 {
	public static void main(String[] args) throws InterruptedException 
	{	 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		    
		  //Create object of chromedriver class and provide reference of  Webdriver interface         
		            WebDriver driver=new ChromeDriver();
		  
		       driver.get("https://www.facebook.com/");
		       
		       //enter UN
		 driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("abc");
		
		 //wait
		 Thread.sleep(2000);
		 
		//clear UN
		 driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		 
		//wait
		 Thread.sleep(2000);
		 
		 //Enter UN
		 driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("xyz");
		 
		 
		 
	}
	
	
	
	
	
	
}
