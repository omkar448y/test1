package Launch_Browsers11;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allin1 {
	
	public static void main(String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
		
		//to create object of chrome driver calss and give the referance to webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//To call navigate method 
		driver.navigate().to("https://www.tataplay.com/");
		
		Thread.sleep(3000);
		
		
		
		driver.navigate().to("https://outlook.live.com/");
		
		
		Thread.sleep(3000);
		
		String s1=driver.getTitle();
		String s2=driver.getCurrentUrl();
		System.out.println(s1);
		System.out.println(s2);
		
		driver.manage().window().maximize();
		//to gate size
		Thread.sleep(3000);
		Dimension s3=new Dimension(400,600);
		
		driver.manage().window().setSize(s3);;
		
		
		Dimension s5= driver.manage().window().getSize();
		System.out.println(s5);
		
		
		
		//to set position
		Point s6=new Point (800,400);
		
		driver.manage().window().setPosition(s6);
		
		
		
	}
	
	
	
	
	
	
	
}