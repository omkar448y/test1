package locators11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_locator {
public static void main(String args[]) 
{
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.tataplay.com/my-account/register-user");

driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1087141342");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar@123");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar@123");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Omkaryadav448@gamilcom");
driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("9309813989");





}	
		
		
		
		
}
