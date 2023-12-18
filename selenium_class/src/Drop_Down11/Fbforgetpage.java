package Drop_Down11;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fbforgetpage {
	

	public static void main (String arga[]) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		//to create object of chromedriver class and provide refrence of webdriver interface
		WebDriver driver=new ChromeDriver();
		//to open application by using get method 
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		//to provide wait
		Thread.sleep(2000);
		
		//to
		File s1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(s1);
		
		//to store distination folder
		
		File n1=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\sample3.jpg");
	
        FileHandler.copy(s1,n1);

	}

}
