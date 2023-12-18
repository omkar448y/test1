package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifybox2 {
public static void main(String args[]) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");

      WebDriver driver=new ChromeDriver();


       driver.get("file:///C:/Users/Omkar/OneDrive/Desktop/listbox%20(1).html");
 
       WebElement select1 =driver.findElement(By.xpath("//select[@multiple='true']"));

       Select n1=new Select(select1);

           boolean s1=n1.isMultiple();

       System.out.println(s1);




}
}
