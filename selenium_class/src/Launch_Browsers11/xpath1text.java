package Launch_Browsers11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1text 
{


public static void main(String args[]) throws InterruptedException 
{
	
System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
	
driver.findElement(By.xpath("//button[text()='Log In']")).click();
Thread.sleep(3000);

driver.get("https://kite.zerodha.com/");
driver.findElement(By.xpath("//button[@type='submit']")).click();







}}
