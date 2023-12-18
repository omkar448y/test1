 package iframe11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class school3 {
public static void main(String args[]) 

{
	//to call method
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
//create object of chrome driver class and provide refrence of the webdriver interface
WebDriver driver=new ChromeDriver();

//to open the application by using th get method
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

//to change focuse selenium home page to frame
//switchTo is non static method present in webdriver interface 
driver.switchTo().frame("iframeResult");


//to double click  on buton
WebElement elementLocator = driver.findElement(By.xpath("//button[@type='button']"));
Actions actions = new Actions(driver);
actions.doubleClick(elementLocator).perform();

//to right click

WebElement elementLocator1 = driver.findElement(By.xpath("//button[@type='button']"));
Actions actions1 = new Actions(driver);
actions1.contextClick(elementLocator1).perform();

//to click ob button
driver.findElement(By.xpath("//button[@type='button']")).click();




}
	
}
