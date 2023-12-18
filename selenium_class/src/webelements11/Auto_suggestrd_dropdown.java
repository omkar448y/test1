package webelements11;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestrd_dropdown {
	public static void main (String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		//to identify text field address and stored in object
		
	WebElement v1=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	//to enter text in text box field
		v1.sendKeys("selenium");
		//to give wait
		Thread.sleep(2000);
		//to find address of all suggested text
		List<WebElement> count=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		int a=count.size();
		System.out.println("Total auto sugget result"+a);
		
		count.get(6).click();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	}

}
