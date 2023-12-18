package locators11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc1 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		
		driver.findElement(By.id("userid")).sendKeys("jw0134");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		
	}
	
	

}
