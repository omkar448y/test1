package pop_up11;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkartpopup 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//to call get method
		driver.get("https://www.flipkart.com/");
		
		//wait
		
		Thread.sleep(2000);
		
		
		//to find path of mobile no filed
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9309813989");
		
		//to enter password in text filed
		
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Omkar@123");
		
		//to click on submit button
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(2000);
		
		//to take screenshot
		 File n1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		    System.out.println(n1);
		
		File m1=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\samlpeflipkart1.jpg");
		
		FileHandler.copy(n1,m1);
		
		
		//to take Screenshot
		File b1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(b1);
		
		
		
		File j1=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\m1.jpg");
		FileHandler.copy(b1,j1);
	}

}
