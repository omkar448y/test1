package Launch_Browsers11;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scelenium11 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		  String s1=driver.getTitle();		
		
		 String s2=driver.getCurrentUrl();
		
		 System.out.println(s1);
		System.out.println(s2);
		
		//today
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		
		
		
		//set size
		
		Dimension b1=new Dimension(400,500);
		driver.manage().window().setSize(b1);
		
		
		Thread.sleep(3000);
		//get size
		
		Dimension a1=driver.manage().window().getSize();
		
		
		System.out.println(a1);
		
		
		//set position
		
		
		Point p1=new Point(200,600);
		driver.manage().window().setPosition(p1);
		Thread.sleep(3000);
		//get  position
		
		
		Point p2=driver.manage().window().getPosition();
		System.out.println(p2);
		
		driver.close();
		
		
		
		
		
	}

}
