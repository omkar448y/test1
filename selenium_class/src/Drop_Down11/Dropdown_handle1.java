package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handle1 {
	
	public static void main(String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		//create chrome browser object and provide thhe refereance of interface webdriver
		WebDriver driver=new ChromeDriver();		
		//to calll gate method to open the application
		driver.get("https://www.facebook.com/");
		//to find out the dropdown path
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//******************without thread**************
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Omkar");
		//Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yadav");
	    //Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("omkaryadav448@gamail,conn");
		//Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Omkaryadav@123");
	
	//to select day
	    WebElement s1=driver.findElement(By.xpath("//select[@id='day']"));
		Select d1=new Select(s1);              //object of select class and pass object in select constructor
		d1.selectByVisibleText("2");          //call methos
		
		
	//to selct month	
		WebElement s2=driver.findElement(By.xpath("//select[@title='Month']"));
		Select n2=new Select(s2);          //object of select class and pass object in select constructor
		n2.selectByVisibleText("Jan");      //call method
		
		//refresh page
	   driver.navigate().refresh();
	   
	   //to set size
		Dimension n1=new Dimension(800,900);
		driver.manage().window().setSize(n1);
		
		//to gate current url
		String h1=driver.getCurrentUrl();
		System.out.println(h1);
		
		//to gate page title
		String h2 =driver.getTitle();
		System.out.println(h2);
	}

}
