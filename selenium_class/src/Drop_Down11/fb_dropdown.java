package Drop_Down11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import webelements11.webelements;

public class fb_dropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		//to create object of cheomedriver class
		WebDriver driver=new ChromeDriver();
		
		//to open the Application
		driver.get("https://www.facebook.com/login/");
		//to find path of button
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		//to find out path of drop down
		
		WebElement m1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//to create object of select class and pass object on select constructor
		Select n1=new Select(m1);
		//to call method
		n1.selectByVisibleText("22");
		//n1.selectByValue(value);
		//n1.selectByIndex(index);
		
		//to use for each loop to print all dates
		
		List<WebElement> k1=n1.getOptions();
		for(WebElement nk:k1) 
		{
			System.out.println(nk.getText());
			
		}
	
          
	}

}
