package pop_up11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidenpopupFlipkart {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
	//treate the object of chromedriver class 
	WebDriver driver=new ChromeDriver();
	//to call get method to open the application
	driver.get("https://www.flipkart.com/");
	//wait provide
	Thread.sleep(5000);
	
	//to enter mobile no
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9309813989");
	//to enter password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar@123");
	//to click on submit button
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	
	
}
}
