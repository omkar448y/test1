package pop_up11;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class guru991 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		//to call setproperty method
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//to call get method
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//wait
		Thread.sleep(2000);
		//to find path of text filed
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("omkar@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
  
		//to change focuse main page to pop up
	      Alert popup	=driver.switchTo().alert();
		//to call accept method
		popup.accept();
		popup.accept();
		//to print text of pop up
	   //String k1=popup.getText();	
		
		//System.out.println(k1);
		//to take screenshot
		Thread.sleep(3000);
		
		File l1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(l1);
		
		
		File j1=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\omkar2.jpg");
		
		FileHandler.copy(l1,j1);
		
		
		
		
		
		
		
		
		
		
	}

}
