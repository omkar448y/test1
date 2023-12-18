package Launch_Browsers11;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method8 {
	


public static void main(String args[]) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//use navigate method to open Application
driver.navigate().to("https://www.bing.com/travel?form=ANTPT0");
//Maximize Page application
 driver.manage().window().maximize();

Thread.sleep(3000);
//open Facebook
driver.navigate().to("https://www.facebook.com/");

Thread.sleep(3000);
//navigare back page
driver.navigate().back();

Thread.sleep(3000);

//navigate forword page
driver.navigate().forward();

Thread.sleep(3000);

//refresh page
driver.navigate().refresh();



//wait
Thread.sleep(3000);


//To set browser


Dimension n1=new Dimension(1250, 750);
driver.manage().window().setSize(n1);


//wait
Thread.sleep(3000);



//to get browser size


Dimension s2=driver.manage().window().getSize();
System.out.println(s2);


//to set position


Point n3=new Point(200, 300);

driver.manage().window().setPosition(n3);


//to get position

Point b1=driver.manage().window().getPosition();

System.out.println(b1);

driver.manage().window().maximize();

Thread.sleep(3000);

//Too set Dimension
Dimension a1=new Dimension(100,300);

driver.manage().window().setSize(a1);

Thread.sleep(30000);

//to get Dimension

Dimension A1=driver.manage().window().getSize();
System.out.println(A1);

//to set position

Point s1=new Point(400,600);
driver.manage().window().setPosition(s1);


//to get position

Point s3=driver.manage().window().getPosition();
System.out.println(s3);











}}