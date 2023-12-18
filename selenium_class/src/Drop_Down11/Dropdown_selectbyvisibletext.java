package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_selectbyvisibletext {

public static void main(String Args[]) throws InterruptedException 
{
	

System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/login/");

Thread.sleep(2000);

driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();


//select month by using dropdown
Thread.sleep(2000);
WebElement s1=driver.findElement(By.xpath("//select[@id='month']"));
Select n1=new Select(s1);

//n1.selectByVisibleText("Jan");
//n1.selectByValue("10");
n1.selectByIndex(5);
//select day by using drop down
Thread.sleep(2000);
WebElement s2=driver.findElement(By.xpath("//select[@id='day']"));
Select n2=new Select(s2);
//n2.selectByVisibleText("6");
//n2.selectByValue("6");
n2.selectByIndex(30);
//select by using dropdown

Thread.sleep(2000);
WebElement s3=driver.findElement(By.xpath("//select[@id='year']"));
Select n3=new Select(s3);

//n3.selectByVisibleText("1997");
//n3.selectByValue("2014");
n3.selectByIndex(22);


boolean d1=driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
System.out.println(d1);




}	

	
}
