package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifydropdown_single_or_multiselected {

public static void main(String args[]) throws InterruptedException 
{
 
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

Thread.sleep(3000);

WebElement s1=driver.findElement(By.xpath("//select[@name='birthday_day']"));

 Select M1=new Select(s1);

boolean A1=M1.isMultiple();
System.out.println("Drop down are is multiselected :"+A1);



Thread.sleep(2000);

driver.close();
}
	
	
}
