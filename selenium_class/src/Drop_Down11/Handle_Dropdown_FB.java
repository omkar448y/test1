package Drop_Down11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown_FB 
{
	
	public static void main(String args[]) throws InterruptedException
	{
//if we want to open application we need to call sysytem.setproperty method and they accepting two parameter

	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");              //TO call Setpropertymethod
//to create object of crome driver and give the referance of webdriver interface
	WebDriver driver=new ChromeDriver();           //create object of Chrome Driverclass

//to call get method to open the application
	driver.get("https://www.facebook.com/login/");
	//to maximiza the page
	driver.manage().window().maximize();
	

	//to find addres of drop down

	driver.findElement(By.xpath("//a[@class='_97w5']")).click();    //to find of address of dropdown

	//to enter firt name on firstname field
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("omkar");
    //to enter last name in lastname field
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
   //to enter emailid in email field
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Omkaryadav@gmail.com");
	//clear mail id
	driver.findElement(By.xpath("//input[@name='reg_email__']")).clear();
	//to enter the mail id in mail id field 
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Omkaryadav@gmail.com");
//to enter password on password field
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Omkar@123");

//to reenter password in password field
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")).sendKeys("Omkar@123");
	
	
	
	
	
//to identiify the drop dwon of   "DAY"
	WebElement s1=driver.findElement(By.xpath("//select[@id='day']"));
//create object of select class and pass object on constructor of select class
	Select n1=new Select(s1);
//call the Selectbyvisibletext and pass string value
	n1.selectByVisibleText("10");

	
	
	// to identify the dropdown of month 
    WebElement s2=driver.findElement(By.xpath("//select[@id='month']"));
	//  object of select class and pass the object on select class constructor
	Select n2=new Select(s2);
	// to call method selectbyvisiblettext
	n2.selectByVisibleText("Jan");
	

	
	//to identify the dropdown of year
	WebElement s3=driver.findElement(By.xpath("//select[@id='year']"));
	//create select objrct and pass object in sselect calss constructor
	Select n4=new Select(s3);
	//to call method selctbyvisibletext
	n4.selectByVisibleText("2014");
	

	}
	}
	


