package webelements11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String args[]) throws InterruptedException 
{
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

//to open Application
driver.navigate().to("https://accounts.snapchat.com/accounts/login?client_id=geo");
//to proivide wait

driver.manage().window().maximize();
Thread.sleep(2000);


driver.findElement(By.xpath("//input[@name='username']")).sendKeys("omkaryadav448@gmail.com");

driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Omkar@123");
driver.findElement(By.xpath("//input[@name='password']")).clear();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Omkar@123");

driver.findElement(By.xpath("//button[@type='submit']")).click();
boolean s2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();

System.out.println(s2);
boolean s3=driver.findElement(By.xpath("//img[@class='snapchat-icon']")).isDisplayed();
System.out.println(s3);

boolean s4=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).isSelected();
System.out.println(s4);
}
	
	
}
