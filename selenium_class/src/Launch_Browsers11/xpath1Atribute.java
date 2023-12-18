package Launch_Browsers11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1Atribute
{

public static void main(String args[]) 
{
	
System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://kite.zerodha.com/");

//Xpath by Attribute
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("JW0134");

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar@123");


driver.findElement(By.xpath("//button[@type='submit']")).click();


}
	
	
	
	
}
