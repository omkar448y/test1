package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import lunch_browser.Webdriver_Method5;

public class Drop_down_multiselectable {

	public static void main(String args[]) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Omkar/OneDrive/Desktop/listbox%20(1).html");
		//to find out path of dropdown and store in one object
	WebElement states=	driver.findElement(By.xpath("//select[@id='1234']"));
		//to create object on select class  and pass identified object in select class constructor
		Select m1=new Select(states);
		
		//select drop down
		
		m1.selectByVisibleText("Ind");
		m1.selectByVisibleText("Sri Lanka");
		m1.selectByVisibleText("China");
		
		
		///to provide wait to run proper application
		Thread.sleep(2000);
		
		
		//deselect dropdown
		
		m1.deselectByVisibleText("Ind");
		Thread.sleep(2000);
		m1.deselectByVisibleText("Sri Lanka");
		//deselect all selected drop down
		m1.deselectAll();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
