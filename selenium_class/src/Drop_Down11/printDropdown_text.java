package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printDropdown_text {
	
public static void main(String args[]) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", 	"C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();


driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

Thread.sleep(2000);

WebElement s1=driver.findElement(By.xpath("//select[@name='birthday_month']"));

Select n1=new Select(s1);
n1.selectByVisibleText("Feb");
WebElement select1=n1.getFirstSelectedOption();

String s2=select1.getText();
System.out.println(s2);
}
}
