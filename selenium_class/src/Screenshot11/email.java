package Screenshot11;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class email 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		//to call setproperty method 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		//create object of chromedriver class and give refrencec of the webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//to call get method to open the application 
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		//to provide wait implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	Thread.sleep(2000);
		
		//to refresh the page 
		driver.navigate().refresh();
		//to get title of page and get url of the page 
		String m1=driver.getTitle();
		String m2=driver.getCurrentUrl();
		System.out.println("Window title "+m1);
		System.out.println("Current URL "+m2);
		
		//to take screen shot
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(screenshot);
		
		//to store in destination folder
		
		//to create the object of file class
		
		File save=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\velocity class\\omkar1.jpg");
		
		FileHandler.copy(screenshot,save);
		
		//to maximize page
		driver.manage().window().maximize();
		//to set size
		
		Dimension l1=new Dimension(800,900);
		driver.manage().window().setSize(l1);
		
	Dimension l2=	driver.manage().window().getSize();
		System.out.println("Window size "+l2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
