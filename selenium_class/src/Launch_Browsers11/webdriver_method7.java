package Launch_Browsers11;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method7 {
	
	public static void main(String arg[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.bing.com/travel?form=ANTPT0");
		
		//get current URL and Title of page
		String url=driver.getCurrentUrl();
		String name=driver.getTitle();
		System.out.println(url);
		System.out.println(name);
		
		
		//Maximize and minimize page
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// set Size
		Dimension s1=new Dimension(100, 200);
		
		driver.manage().window().setSize(s1);
		
		Thread.sleep(3000);
		//get Size
		
		Dimension size1=driver.manage().window().getSize();
		
		System.out.println(size1);
		
		Thread.sleep(3000);
		//set position
		Point s2=new Point(300,200);
		driver.manage().window().setPosition(s2);
		Thread.sleep(3000);
		//get position
		
		Point s3=driver.manage().window().getPosition();
		System.out.println(s3);
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}
