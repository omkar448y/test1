package webelements11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukari_com {
	
	public static void main(String args[]) throws InterruptedException 
	{
		//to open new browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// to open new application by using navigate method
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Thread.sleep(3000);
		
		//to open application 2 by using navigation method
		driver.navigate().to("https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		
		//to back to previous page
		driver.navigate().back();
		//to refresh page
		driver.navigate().refresh();
		
		String s1=driver.getTitle();    //to gate tite of web page
	 String s2=	driver.getCurrentUrl();   // to print webpage urrl
	System.out.println(s1);
	System.out.println(s2);
		
	driver.manage().window().maximize();	
		
		//webelements methods
		//send key method
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("omkar yadav");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("omkaryadav448@gamail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Omkar@123");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9309813989");
		//wait
		Thread.sleep(3000);
		
		//clear metod
		driver.findElement(By.xpath("//input[@id='mobile']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9309813989");

		//click method
		driver.findElement(By.xpath("//button[text()='Register Now']")).click();
		//wait
		Thread.sleep(2000);
		
		//to check button are enable or not
		boolean v1 =driver.findElement(By.xpath("//button[text()='Register Now']")).isEnabled();
		System.out.println("Is Enable"+v1);
		
		//to verify logo are displayed are not validate
	   boolean	v2=driver.findElement(By.xpath("//img[@src='https://static.naukimg.com/s/4/100/i/naukri_Logo.png']")).isDisplayed();
		System.out.println("Is Displayed"+v2);
		
		
		Dimension s3=new Dimension(800,600);
		driver.manage().window().setSize(s3);
		Point n1=new Point(800,700);
		driver.manage().window().setPosition(n1);
		
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
